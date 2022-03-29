package de.rohmio.mtg.scryfall.api.endpoints;

import javax.ws.rs.core.GenericType;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.ListObject;
import de.rohmio.mtg.scryfall.api.model.RulingObject;
import de.rohmio.mtg.scryfall.api.model.enums.ContentSite;

public class RulingsEndpoint extends AbstractEndpoint<ListObject<RulingObject>> {

	public RulingsEndpoint(String scryfallId) {
		super(String.format("/cards/%s/rulings", scryfallId), new GenericType<ListObject<RulingObject>>() {});
	}
	
	public RulingsEndpoint(ContentSite contentSite, int id) {
		super(String.format("/cards/%s/%s/rulings", contentSite, id), new GenericType<ListObject<RulingObject>>() {});
	}
	
	public RulingsEndpoint(String setCode, String collectorNumber) {
		super(String.format("/cards/%s/%s/rulings", setCode, collectorNumber), new GenericType<ListObject<RulingObject>>() {});
	}

}
