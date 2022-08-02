package de.rohmio.mtg.scryfall.api.endpoints.factories;

import de.rohmio.mtg.scryfall.api.endpoints.CatalogsEndpoint;
import de.rohmio.mtg.scryfall.api.model.enums.CatalogType;

public final class CatalogsEndpointFactory {
	
	public CatalogsEndpointFactory() {}
	
	/**
	 * Returns a list of all nontoken English card names in Scryfall's database. Values are updated as soon as a new card is entered for spoiler seasons.
	 * @param catalog the type of catalog to request
	 * @return the endpoint
	 */
	public CatalogsEndpoint catalog(CatalogType catalog) {
		return new CatalogsEndpoint(catalog);
	}

}
