package de.rohmio.mtg.scryfall.api.cards;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.endpoints.NamedEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public class NamedTest {

	@Test
	public void test() throws ScryfallError {
		NamedEndpoint fuzzyCardEndpoint = ScryfallApi.cards.fuzzyNamed("Lightning Bolt");
		CardObject cardByFuzzyName = fuzzyCardEndpoint.get();
		assertEquals("Lightning Bolt", cardByFuzzyName.getName());
		NamedEndpoint exactCardEndpoint = ScryfallApi.cards.exactNamed("Lightning Bolt");
		CardObject cardByExactName = exactCardEndpoint.get();
		assertEquals("Lightning Bolt", cardByExactName.getName());

	}

	@Test
	public void builderTest() throws ScryfallError {
		NamedEndpoint cards = ScryfallApi.cards.exactNamed("Lightning Bolt").set("M11");
		CardObject card = cards.get();
		assertEquals("Lightning Bolt", card.getName());
		assertEquals("card", card.getObject());
	}

}
