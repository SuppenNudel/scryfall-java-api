package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CatalogObject;
import de.rohmio.mtg.scryfall.api.model.enums.CatalogType;

public class CatalogsEndpoint extends AbstractEndpoint<CatalogObject> {
	
	public CatalogsEndpoint(CatalogType catalog) {
		super("/catalog/"+catalog, CatalogObject.class);
	}

}
