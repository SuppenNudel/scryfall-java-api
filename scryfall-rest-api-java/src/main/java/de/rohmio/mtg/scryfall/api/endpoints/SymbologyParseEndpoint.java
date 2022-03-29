package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.ParsedSymbolsObject;

public class SymbologyParseEndpoint extends AbstractEndpoint<ParsedSymbolsObject> {
	
	public SymbologyParseEndpoint(String toParse) {
		super("/symbology/parse-mana", ParsedSymbolsObject.class);
		setQueryParam("cost", toParse);
	}

}
