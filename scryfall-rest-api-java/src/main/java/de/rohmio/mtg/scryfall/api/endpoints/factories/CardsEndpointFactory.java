package de.rohmio.mtg.scryfall.api.endpoints.factories;

import java.util.List;

import de.rohmio.mtg.scryfall.api.endpoints.AutocompleteEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.CollectionEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.CollectorEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.IdEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.NamedEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.RandomEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.RulingsEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.ScryfallIdEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.SearchEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardIdentifier;
import de.rohmio.mtg.scryfall.api.model.enums.ContentSite;

public final class CardsEndpointFactory {

	public CardsEndpointFactory() {}

	/**
	 * @param query A fulltext search query. Make sure that your parameter is properly encoded.
	 * @return the endpoint
	 */
	public SearchEndpoint search(String query) {
		return new SearchEndpoint(query);
	}

	/**
	 * @param cardName The exact card name to search for, case insenstive.
	 * @return the endpoint
	 */
	public NamedEndpoint exactNamed(String cardName) {
		return new NamedEndpoint(cardName, false);
	}

	/**
	 * @param cardName A fuzzy card name to search for.
	 * @return the endpoint
	 */
	public NamedEndpoint fuzzyNamed(String cardName) {
		return new NamedEndpoint(cardName, true);
	}

	/**
	 * @param query the query
	 * @return the endpoint
	 */
	public AutocompleteEndpoint autocomplete(String query) {
		return new AutocompleteEndpoint(query);
	}

	/**
	 *
	 * @return the endpoint
	 */
	public RandomEndpoint random() {
		return new RandomEndpoint();
	}

	public CollectionEndpoint collection(List<CardIdentifier> cardIdentifiers) {
		return new CollectionEndpoint(cardIdentifiers);
	}

	public CollectorEndpoint collectorsNumber(String code, String number) {
		return new CollectorEndpoint(code, number);
	}

	public CollectorEndpoint collectorsNumber(String code, String number, String lang) {
		return new CollectorEndpoint(code, number, lang);
	}

	public IdEndpoint id(ContentSite contentSite, int id) {
		return new IdEndpoint(contentSite, id);
	}

	public ScryfallIdEndpoint scryfallId(String scryfallId) {
		return new ScryfallIdEndpoint(scryfallId);
	}

	public RulingsEndpoint rulings(String scryfallId) {
		return new RulingsEndpoint(scryfallId);
	}

	public RulingsEndpoint rulingsById(ContentSite contentSite, int id) {
		return new RulingsEndpoint(contentSite, id);
	}

	public RulingsEndpoint rulingsByCollector(String setCode, String collectorNumber) {
		return new RulingsEndpoint(setCode, collectorNumber);
	}

}
