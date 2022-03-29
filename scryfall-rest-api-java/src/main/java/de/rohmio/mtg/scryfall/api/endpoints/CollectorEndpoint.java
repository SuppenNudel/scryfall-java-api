package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardObject;

public class CollectorEndpoint extends AbstractEndpoint<CardObject> {

	public CollectorEndpoint(String code, String number) {
		super("/cards/"+code+"/"+number, CardObject.class);
	}

	public CollectorEndpoint(String code, String number, String lang) {
		super("/cards/"+code+"/"+number+"/"+lang, CardObject.class);
	}
	
}
