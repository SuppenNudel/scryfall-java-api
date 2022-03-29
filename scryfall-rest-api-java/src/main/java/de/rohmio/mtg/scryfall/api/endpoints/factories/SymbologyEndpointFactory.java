package de.rohmio.mtg.scryfall.api.endpoints.factories;

import de.rohmio.mtg.scryfall.api.endpoints.SymbologyEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.SymbologyParseEndpoint;

public final class SymbologyEndpointFactory {

	public SymbologyEndpoint cardSymbols() {
		return new SymbologyEndpoint();
	}
	
	/**
	 * 
	 * @param toParse The mana string to parse.
	 */
	public SymbologyParseEndpoint parse(String toParse) {
		return new SymbologyParseEndpoint(toParse);
	}

}
