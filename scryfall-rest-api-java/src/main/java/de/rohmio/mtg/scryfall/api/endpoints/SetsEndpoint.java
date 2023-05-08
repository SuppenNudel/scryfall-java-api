package de.rohmio.mtg.scryfall.api.endpoints;


import javax.ws.rs.core.GenericType;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.ListObject;
import de.rohmio.mtg.scryfall.api.model.SetObject;

public class SetsEndpoint extends AbstractEndpoint<ListObject<SetObject>> {

	public SetsEndpoint() {
		super("/sets", new GenericType<ListObject<SetObject>>() {});
	}

}
