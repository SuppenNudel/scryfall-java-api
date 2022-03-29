package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.SetObject;

public class SetsIdEndpoint extends AbstractEndpoint<SetObject> {
	
	public SetsIdEndpoint(String id) {
		super("/sets/"+id, SetObject.class);
	}
	
}
