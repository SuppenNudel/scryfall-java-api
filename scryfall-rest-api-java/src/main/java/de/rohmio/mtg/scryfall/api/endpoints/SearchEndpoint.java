package de.rohmio.mtg.scryfall.api.endpoints;


import javax.ws.rs.core.GenericType;

import de.rohmio.mtg.scryfall.api.endpoints.factories.PagedAbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ListObject;
import de.rohmio.mtg.scryfall.api.model.enums.Direction;
import de.rohmio.mtg.scryfall.api.model.enums.Sorting;
import de.rohmio.mtg.scryfall.api.model.enums.Unique;

/**
 * Supported formats: json and csv
 * Returns a List object containing Cards found using a fulltext search string. This string supports the same fulltext search system that the main site uses.
 * This method is paginated, returning 175 cards at a time. Review the documentation for paginating the List type and and the Error type type to understand all of the possible output from this method.
 * If only one card is found, this method will still return a List.
 *
 * Missing Luxuries
 *
 * Note that this search endpoint is more strict than the user-facing search system on Scryfall. In particular:
 *
 * On Scryfall’s website, if your search does not match any cards, the search system automatically retries with include:extras added. This API method does not automatically retry your search.
 *
 * On Scryfall’s website, if your search is only for a set (example: e:set), the system automatically redirects you to the ++e:set page for that set. This API method does not automatically redirect you.
 *
 * On Scryfall’s website, certain searches trigger additional user interface elements that suggest expanding your search coverage (with o:changeling or ++ for example). This API method does not have this suggestion behavior.
 *
 * This API method will not provide help with spelling errors.
 */
public class SearchEndpoint extends PagedAbstractEndpoint<CardObject> {

	public SearchEndpoint(String query) {
		super("/cards/search", new GenericType<ListObject<CardObject>>() {});
		setQueryParam("q", query);
	}

	/**
	 * @param unique The strategy for omitting similar cards. See below. Defaults to cards
	 * @return this builder
	 */
	public SearchEndpoint unique(Unique unique) {
		setQueryParam("unique", unique);
		return this;
	}

	/**
	 * @param sorting The method to sort returned cards. See below. Defaults to name
	 * @return this builder
	 */
	public SearchEndpoint order(Sorting sorting) {
		setQueryParam("order", sorting);
		return this;
	}

	/**
	 * @param direction The direction to sort cards. See below. Defaults to auto
	 * @return this builder
	 */
	public SearchEndpoint dir(Direction direction) {
		setQueryParam("dir", direction);
		return this;
	}

	/**
	 * @param includeExtras If true, extra cards (tokens, planes, etc) will be included. Equivalent to adding include:extras to the fulltext search. Defaults to false.
	 * @return this builder
	 */
	public SearchEndpoint includeExtras(boolean includeExtras) {
		setQueryParam("include_extras", includeExtras);
		return this;
	}

	/**
	 * @param includeMultilingual If true, cards in every language supported by Scryfall will be included. Defaults to false.
	 * @return this builder
	 */
	public SearchEndpoint includeMultilingual(boolean includeMultilingual) {
		setQueryParam("include_multilingual", includeMultilingual);
		return this;
	}

	/**
	 * @param includeVariations If true, rare care variants will be included, like the Hairy Runesword. Defaults to false.
	 * @return this builder
	 */
	public SearchEndpoint includeVariations(boolean includeVariations) {
		setQueryParam("include_variations", includeVariations);
		return this;
	}

	/**
	 * @param page The page number to return, default 1.
	 * @return this builder
	 */
	@Override
	public SearchEndpoint page(int page) {
		setQueryParam("page", page);
		return this;
	}

}
