package de.rohmio.mtg.scryfall.api.endpoints;

import javax.ws.rs.core.GenericType;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardSymbolObject;
import de.rohmio.mtg.scryfall.api.model.ListObject;

public class SymbologyEndpoint extends AbstractEndpoint<ListObject<CardSymbolObject>> {

	public SymbologyEndpoint() {
		super("/symbology", new GenericType<ListObject<CardSymbolObject>>() {});
	}

}
