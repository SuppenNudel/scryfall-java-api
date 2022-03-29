package de.rohmio.mtg.scryfall.api.async;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.CatalogObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;
import de.rohmio.mtg.scryfall.api.model.enums.CatalogType;

public class CardsAsyncTest {

	private List<CardObject> results = new ArrayList<>();
	private CountDownLatch countdown;

	@Test
	public void test() throws InterruptedException, ExecutionException, ScryfallError {
		CatalogObject catalogObject = ScryfallApi.catalogs.catalog(CatalogType.CARD_NAMES).get();
		List<String> sublist = catalogObject.getData().subList(0, 10);
		countdown = new CountDownLatch(sublist.size());
		for(String cardName : sublist) {
			ScryfallApi.cards.exactNamed(cardName).get(this::doSth);
		}
		countdown.await();
		List<String> collect = results.stream().map(CardObject::getName).collect(Collectors.toList());
		assertTrue(collect.containsAll(sublist));
	}

	private void doSth(CardObject cardObject) {
		results.add(cardObject);
		countdown.countDown();
	}

}
