package de.rohmio.mtg.scryfall.api.cards;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.CardIdentifier;
import de.rohmio.mtg.scryfall.api.model.CardIdentifierFactory;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ListObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public class CollectionTest {

	@Disabled
	@Test
	public void collectionTest() throws ScryfallError {
		CardIdentifier identifier = CardIdentifierFactory.createByName("Lightning Bolt");
		List<CardIdentifier> cardIdentifiers = Arrays.asList(identifier);
		ListObject<CardObject> cards = ScryfallApi.cards.collection(cardIdentifiers).get();
		assertNotNull(cards);
		assertEquals(1, cards.getData().size());
		assertEquals("Lightning Bolt", cards.getData().get(0).getName());
	}

}
