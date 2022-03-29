package de.rohmio.mtg.scryfall.api.cards;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public class ScryfallIdTest {
	
	@Test
	public void test() throws ScryfallError {
		String scryfallId = "e9d5aee0-5963-41db-a22b-cfea40a967a3";
		CardObject cardObject = ScryfallApi.cards.scryfallId(scryfallId).get();
		assertEquals("Dusk // Dawn", cardObject.getName());
	}

}
