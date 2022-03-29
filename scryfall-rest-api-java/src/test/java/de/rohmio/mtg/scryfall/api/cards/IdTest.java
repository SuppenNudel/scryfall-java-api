package de.rohmio.mtg.scryfall.api.cards;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;
import de.rohmio.mtg.scryfall.api.model.enums.ContentSite;

public class IdTest {
	
	private static Stream<Arguments> provideParameters() {
	    return Stream.of(
	      Arguments.of(ContentSite.MULTIVERSE, 409574, "Strip Mine", "Zendikar Expeditions"),
	      Arguments.of(ContentSite.MTGO, 54957, "Ghost Quarter", "Commander 2014"),
	      Arguments.of(ContentSite.ARENA, 67330, "Yargle, Glutton of Urborg", "Dominaria"),
	      Arguments.of(ContentSite.TCGPLAYER, 162145, "Rona, Disciple of Gix", "Dominaria"),
	      Arguments.of(ContentSite.CARDMARKET, 379041, "Embodiment of Agonies", "Core Set 2020")
	    );
	}
	
	@ParameterizedTest
	@MethodSource("provideParameters")
	public void test(ContentSite contentSite, int id, String expectedName, String expectedSet) throws ScryfallError {
		CardObject cardObject = ScryfallApi.cards.id(contentSite, id).get();
		assertEquals(expectedName, cardObject.getName());
		assertEquals(expectedSet, cardObject.getSet_name());
	}
	
}
