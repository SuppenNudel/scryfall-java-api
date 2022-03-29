package de.rohmio.mtg.scryfall.api.endpoints;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public class BulkDataEndpoint extends AbstractEndpoint<List<CardObject>> {

	private boolean save;
	private boolean useCache;

	private File file;

	// TODO check if cache is there before using getDownloadUrl
	public BulkDataEndpoint(String idOrType, boolean forceUseOfCache) {
		super(getDownloadUrl(idOrType, forceUseOfCache), new GenericType<List<CardObject>>() {}, true);
		file = new File(idOrType+".json");
		useCache(forceUseOfCache);
	}

	private static String getDownloadUrl(String idOrType, boolean useCache) {
		if(useCache) {
			return "not used";
		}
		try {
			return ScryfallApi.bulkData.bulkDataInfo(idOrType).get().getDownload_uri();
		} catch (ScryfallError e) {
			e.printStackTrace();
		}
		return null;
	}

	public BulkDataEndpoint save(boolean save) {
		this.save = save;
		return this;
	}

	public BulkDataEndpoint useCache(boolean useCache) {
		this.useCache = useCache;
		return this;
	}

	@Override
	public List<CardObject> get() throws ScryfallError {
		List<CardObject> objects = null;
		if(useCache && file.exists()) {
			JsonMapper mapper = new JsonMapper();
			try {
				objects = mapper.readValue(file, new TypeReference<List<CardObject>>() {});
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			objects = super.get();
		}
		return objects;
	}

	@Override
	public void get(Consumer<List<CardObject>> callback) {
		if(useCache && file.exists()) {
			JsonMapper mapper = new JsonMapper();
			try {
				List<CardObject> objects = mapper.readValue(file, new TypeReference<List<CardObject>>() {});
				callback.accept(objects);
			} catch (JsonParseException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			super.get(callback);
		}
	}

	@Override
	protected List<CardObject> parseResponse(Response response) {
		List<CardObject> parseResponse = super.parseResponse(response);

		if(save) {
			JsonMapper mapper = new JsonMapper();
			mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
			try {
				mapper.writeValue(file, parseResponse);
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return parseResponse;
	}

}
