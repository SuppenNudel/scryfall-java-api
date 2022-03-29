package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.BulkDataObject;

public class BulkDataInfoEndpoint extends AbstractEndpoint<BulkDataObject> {

	public BulkDataInfoEndpoint(String idOrType) {
		super("/bulk-data/"+idOrType, BulkDataObject.class);
	}

}
