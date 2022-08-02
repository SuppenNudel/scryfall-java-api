package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardObject;

/**
 * Returns a single random Card object.
 * The optional parameter q supports the same fulltext search system that the main site uses. Providing q will filter the pool of cards before returning a random entry.
 *
 */
public class RandomEndpoint extends AbstractEndpoint<CardObject> {
	
	public RandomEndpoint() {
		super("/cards/random", CardObject.class);
	}

	/**
	 * @param query An optional fulltext search query to filter the pool of random cards. Make sure that your parameter is properly encoded.
	 * @return this builder
	 */
	public RandomEndpoint query(String query) {
		setQueryParam("q", query);
		return this;
	}
	
}
