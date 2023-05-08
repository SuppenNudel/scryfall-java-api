package de.rohmio.mtg.scryfall.api.cards;

import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.CardFaceObject;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ListObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;
import de.rohmio.mtg.scryfall.api.model.enums.Direction;
import de.rohmio.mtg.scryfall.api.model.enums.Sorting;
import de.rohmio.mtg.scryfall.api.model.enums.Unique;

public class SearchTest {

	private CardFaceObject getFront(CardObject cardObject) {
		if (cardObject.getCardFaces() == null) {
			return cardObject;
		} else {
			return cardObject.getCardFaces().get(0);
		}
	}

	@Test
	public void noAdditionalParameters() throws ScryfallError {
		ListObject<CardObject> cardList = ScryfallApi.cards.search("!\"Lightning Bolt\"").get();
		System.out.println(cardList);
	}

	@Test
	public void testAllParameters() throws ScryfallError {
		ListObject<CardObject> cardList = ScryfallApi.cards.search("mana:3").unique(Unique.ART).order(Sorting.ARTIST)
				.dir(Direction.ASC).includeExtras(true).includeMultilingual(true).includeVariations(true).page(1).get();
		System.out.println(cardList);
	}

}
