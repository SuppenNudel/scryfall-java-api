package de.rohmio.mtg.scryfall.api.symbology;

import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.CardSymbolObject;
import de.rohmio.mtg.scryfall.api.model.ListObject;
import de.rohmio.mtg.scryfall.api.model.ParsedSymbolsObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public class SymbologyTest {
	
	@Test
	public void test() throws ScryfallError {
		ListObject<CardSymbolObject> listObject = ScryfallApi.symbology.cardSymbols().get();
		System.out.println(listObject);
	}
	
	@Test
	public void parseTest() throws ScryfallError {
		ParsedSymbolsObject parsed = ScryfallApi.symbology.parse("RUx").get();
		System.out.println(parsed);
	}

}
