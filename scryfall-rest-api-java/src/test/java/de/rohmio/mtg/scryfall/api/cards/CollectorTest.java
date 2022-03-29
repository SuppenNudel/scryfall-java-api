package de.rohmio.mtg.scryfall.api.cards;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public class CollectorTest {

	@Test
	public void basicTest() throws ScryfallError {
		CardObject cardObject = ScryfallApi.cards.collectorsNumber("eld", "1").get();
		assertEquals("Acclaimed Contender", cardObject.getName());
	}

	@Test
	public void langTest() throws ScryfallError {
		CardObject cardObject = ScryfallApi.cards.collectorsNumber("eld", "1", "de").get();
		assertEquals("Bejubelte Wettstreiterin", cardObject.getPrinted_name());
	}

	@Test
	public void jpLangTest() throws ScryfallError {
		CardObject cardObject = ScryfallApi.cards.collectorsNumber("eld", "1", "ja").get();
		assertEquals("評判高い挑戦者", cardObject.getPrinted_name());
	}

}
