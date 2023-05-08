package de.rohmio.mtg.scryfall.api.endpoints.factories;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.logging.Logger;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.AsyncInvoker;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.InvocationCallback;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;

import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public abstract class AbstractEndpoint<T> {

	// TODO add proper optional path parameter support, e.g. {id} and save in a map

	private static final String SCRYFALL_URI = "https://api.scryfall.com";
	private static final MediaType MEDIA_TYPE = MediaType.APPLICATION_JSON_TYPE;

	private static LocalDateTime lastRequestTimestamp =
			LocalDateTime.now().minus(ScryfallApi.SCRYFALL_RATE_LIMIT,
					ChronoUnit.MILLIS);

	private WebTarget target;
	private GenericType<T> resultType;

	protected AbstractEndpoint(String path, GenericType<T> resultType) {
		this(path, resultType, false);
	}

	protected AbstractEndpoint(String path, GenericType<T> resultType, boolean absolute) {
		Client client = ClientBuilder.newClient();
		if(absolute) {
			target = client.target(path);
		} else {
			target = client.target(SCRYFALL_URI).path(path);
		}
		target = target.register(JacksonJsonProvider.class);
		this.resultType = resultType;
		client.register(UploadMonitorInterceptor.class);
	}

	public class UploadMonitorInterceptor implements ReaderInterceptor {

		@Override
		public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {

			// the original outputstream jersey writes with
			final InputStream in = context.getInputStream();

			// you can use Jersey's target/builder properties or
			// special headers to set identifiers of the source of the stream
			// and other info needed for progress monitoring
			String id = (String) context.getProperty("id");
			long fileSize = (long) context.getProperty("fileSize");

			// subclass of counting stream which will notify my progress
			// indicators.
			context.setInputStream(new MyCountingInputStream(in, id, fileSize));

			// proceed with any other interceptors
			return context.proceed();
		}

	}

	public class MyCountingInputStream extends InputStream {

		public MyCountingInputStream(InputStream in, String id, long fileSize) {
		}


		@Override
		public int read() throws IOException {
			return 0;
		}

	}

	protected AbstractEndpoint(String path, Class<T> resultClass) {
		this(path, new GenericType<>(resultClass));
	}

	protected void setQueryParam(String key, Object... values) {
		target = target.queryParam(key, values);
	}

	private static long between() {
		return ChronoUnit.MILLIS.between(LocalDateTime.now(), lastRequestTimestamp.plus(ScryfallApi.SCRYFALL_RATE_LIMIT, ChronoUnit.MILLIS));
	}

	protected static synchronized void waitIfNecessary() {
		long between;
		while ((between = between()) >= 0) {
			try {
				Thread.sleep(between);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//		Logger.getGlobal().info(Thread.currentThread() + " will execute");
		lastRequestTimestamp = LocalDateTime.now();
	}

	protected WebTarget getTarget() {
		return target;
	}

	public T get() throws ScryfallError {
		waitIfNecessary();
		Builder request = target.request(MEDIA_TYPE);
		return handleResponse(request.get());
	}

	public Future<T> getAsync() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		return executor.submit(() -> get());
	}

	public void get(Consumer<T> callback) {
		waitIfNecessary();
		AsyncInvoker async = target.request(MEDIA_TYPE).async();
		async.get(new InvocationCallback<Response>() {
			@Override
			public void completed(Response response) {
				try {
					T result = handleResponse(response);
					callback.accept(result);
				} catch (ScryfallError e) {
					e.printStackTrace();
				}
			}

			@Override
			public void failed(Throwable throwable) {
				throwable.printStackTrace();
			}
		});
	}

	protected T handleResponse(Response response) throws ScryfallError {
		T result = null;
		if (response.getStatus() == Status.OK.getStatusCode()) {
			result = parseResponse(response);
		} else {
			try {
				ScryfallError scryfallError = response.readEntity(ScryfallError.class);
				throw scryfallError;
			} catch (ProcessingException | IllegalStateException e) {
				Logger.getGlobal().severe(target.getUri().toString());
				Logger.getGlobal().severe(response.toString());
				e.printStackTrace();
			}
		}
		response.close();
		return result;
	}

	protected T parseResponse(Response response) {
		try {
			return response.readEntity(resultType);
		} catch (ProcessingException | IllegalStateException e) {
			Logger.getGlobal().severe(target.getUri().toString());
			Logger.getGlobal().severe(e.getMessage());
			Logger.getGlobal().severe(e.getStackTrace()[0].toString());
			e.printStackTrace();
		}
		return null;
	}

}
