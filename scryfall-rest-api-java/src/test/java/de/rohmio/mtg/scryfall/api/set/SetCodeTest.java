package de.rohmio.mtg.scryfall.api.set;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;
import de.rohmio.mtg.scryfall.api.model.SetObject;

public class SetCodeTest {

	private static Stream<Arguments> provideParameters() {
	    return Stream.of(
	      Arguments.of("snc", "Streets of New Capenna")
	    );
	}

	@ParameterizedTest
	@MethodSource("provideParameters")
	public void test(String setCode, String expectedSetName) throws ScryfallError {
		System.out.println("SetCodeTest.test() "+setCode);
		SetObject setObject = ScryfallApi.sets.setByCode(setCode).get();
		assertEquals(expectedSetName, setObject.getName());
		assertEquals(LocalDate.parse("2022-04-29"), setObject.getReleasedAt());
	}

}
