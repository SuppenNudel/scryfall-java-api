package de.rohmio.mtg.scryfall.api.cards;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.ListObject;
import de.rohmio.mtg.scryfall.api.model.RulingObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;
import de.rohmio.mtg.scryfall.api.model.enums.ContentSite;

public class RulingsTest {

	private static Stream<Arguments> provideParameters() {
	    return Stream.of(
	      Arguments.of(ContentSite.MULTIVERSE, 3255, "Lion’s Eye Diamond"),
	      Arguments.of(ContentSite.MTGO, 57934, "Demonic Pact"),
	      Arguments.of(ContentSite.ARENA, 67462, "Song of Freyalise")
	    );
	}

	@ParameterizedTest
	@MethodSource("provideParameters")
	public void test(ContentSite contentSite, int id, String expected) throws ScryfallError {
		ListObject<RulingObject> rulings = ScryfallApi.cards.rulingsById(contentSite, id).get();
		System.out.println(rulings);
	}

}
