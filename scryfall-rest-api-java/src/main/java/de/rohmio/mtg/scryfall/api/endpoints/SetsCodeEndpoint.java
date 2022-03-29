package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.SetObject;

public class SetsCodeEndpoint extends AbstractEndpoint<SetObject> {
	
	/**
	 * 
	 * @param setCode The three to five-letter set code.
	 */
	public SetsCodeEndpoint(String setCode) {
		super("/sets/"+setCode, SetObject.class);
	}
	
}
