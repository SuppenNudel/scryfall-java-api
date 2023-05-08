package de.rohmio.mtg.scryfall.api.jaxrs;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public class JaxRsTest {

	private static WebTarget target;

	@BeforeAll
	public static void init() {
		Client client = ClientBuilder.newClient();
		target = client.target("https://api.scryfall.com");
	}

	@Test
	public void rootDirect() throws InterruptedException, ExecutionException {
		Assertions.assertThrows(BadRequestException.class, () -> {
			ScryfallError errorBody = target.request(MediaType.APPLICATION_JSON).get(ScryfallError.class);
			System.out.println(errorBody);
		});
	}

	@Test
	public void root() throws InterruptedException, ExecutionException {
		Response response = target.request(MediaType.APPLICATION_JSON).async().get().get();
		System.out.println(response);
		ScryfallError value = response.readEntity(ScryfallError.class);
		response.close();
		System.out.println(value);
	}

	@Test
	public void readEntity() {
		WebTarget target = JaxRsTest.target.path("/cards/named").queryParam("fuzzy", "chandra acolyte of fla");
		Response response = target.request(MediaType.APPLICATION_JSON).get();
		System.out.println(target.getUri());
		System.out.println(response);
		System.out.println(response.readEntity(CardObject.class));
		response.close();
	}

	@Test
	public void readEntityNotFound() {
		WebTarget target = JaxRsTest.target.path("/cards/named").queryParam("fuzzy",
				"chandrjdiogasodsiaopghdisa acolyte of fla");
		Response response = target.request(MediaType.APPLICATION_JSON).get();
		System.out.println(target.getUri());
		System.out.println(response);
		if (response.getStatus() == Status.OK.getStatusCode()) {
			System.out.println(response.readEntity(CardObject.class));
		} else {
			System.out.println(response.readEntity(ScryfallError.class));
		}
		response.close();
	}

	@Test
	public void directNotFound() throws InterruptedException, ExecutionException {
		Assertions.assertThrows(NotFoundException.class, () -> {
			WebTarget target = JaxRsTest.target.path("/cards/named").queryParam("fuzzy",
					"Jace tdnagihdsuaigh 832he mindsc");
			CardObject cardObject = target.request(MediaType.APPLICATION_JSON).get(CardObject.class);
			System.out.println(cardObject);
		});
	}

	@Test
	public void direct() {
		WebTarget target = JaxRsTest.target.path("/cards/named").queryParam("fuzzy", "Jace the mindsc");
		CardObject cardObject = target.request(MediaType.APPLICATION_JSON).get(CardObject.class);
		System.out.println(target.getUri());
		System.out.println(cardObject);
	}

	@Test
	public void asyncDirect() throws InterruptedException, ExecutionException {
		WebTarget target = JaxRsTest.target.path("/cards/named").queryParam("fuzzy", "Jace the mindsc");
		Future<CardObject> future = target.request(MediaType.APPLICATION_JSON).async().get(CardObject.class);
		CardObject cardObject = future.get();
		System.out.println(cardObject);
	}

	@Test
	public void directMoreParams() {
		WebTarget target = JaxRsTest.target.path("/cards/named").queryParam("fuzzy", "Lightning bilt").queryParam("set",
				"M11");
		CardObject cardObject = target.request(MediaType.APPLICATION_JSON).get(CardObject.class);
		System.out.println(target.getUri());
		System.out.println(cardObject);
	}

}
