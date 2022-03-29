package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.SetObject;

public class SetsTcgPlayerIdEndpoint extends AbstractEndpoint<SetObject> {
	
	public SetsTcgPlayerIdEndpoint(String id) {
		super("/sets/tcgplayer/"+id, SetObject.class);
	}

}
