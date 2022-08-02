package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CatalogObject;

/**
 * Returns a Catalog object containing up to 20 full English card names that could be autocompletions of the given string parameter.
 * This method is designed for creating assistive UI elements that allow users to free-type card names.
 * The names are sorted with the nearest match first, highly favoring results that begin with your given string.
 * Spaces, punctuation, and capitalization are ignored.
 * If q is less than 2 characters long, or if no names match, the Catalog will contain 0 items (instead of returning any errors).
 *
 */
public class AutocompleteEndpoint extends AbstractEndpoint<CatalogObject> {

	public AutocompleteEndpoint(String query) {
		super("/cards/autocomplete", CatalogObject.class);
		setQueryParam("q", query);
	}
	
	/**
	 * 
	 * @param includeExtras If true, extra cards (tokens, planes, vanguards, etc) will be included. Defaults to false. 
	 * @return this builder
	 */
	public AutocompleteEndpoint includeExtras(boolean includeExtras) {
		setQueryParam("include_extras", includeExtras);
		return this;		
	}

}
