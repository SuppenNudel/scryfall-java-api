package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.enums.ContentSite;

public class IdEndpoint extends AbstractEndpoint<CardObject> {
	
	public IdEndpoint(ContentSite contentCreator, int id) {
		super("cards/"+contentCreator+"/"+id, CardObject.class);
	}

}
