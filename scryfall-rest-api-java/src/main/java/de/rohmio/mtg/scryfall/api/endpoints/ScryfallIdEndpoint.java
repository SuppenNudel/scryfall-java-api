package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardObject;

public class ScryfallIdEndpoint extends AbstractEndpoint<CardObject> {
	
	public ScryfallIdEndpoint(String scryfallId) {
		super("/cards/"+scryfallId, CardObject.class);
	}
	
}
