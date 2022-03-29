package de.rohmio.mtg.scryfall.api.model;

import java.net.URI;
import java.util.List;

// TODO add a utility for requesting all cards
public class ListObject<T> extends ScryfallObject {
	
	/**
	 * 	An array of the requested objects, in a specific order.
	 */
	private List<T> data;
	
	/**
	 * True if this List is paginated and there is a page beyond the current page.
	 */
	private Boolean has_more;
	
	/**
	 * Can be null or missing
	 * <br>
	 * If there is a page beyond the current page, this field will contain a full API URI to that page. You may submit a HTTP GET request to that URI to continue paginating forward on this List.
	 */
	private URI next_page;
	
	/**
	 * Can be null or missing
	 * <br>
	 * If this is a list of Card objects, this field will contain the total number of cards found across all pages.
	 */
	private Integer total_cards;
	
	/**
	 * Can be null or missing
	 * <br>
	 * An array of human-readable warnings issued when generating this list, as strings. Warnings are non-fatal issues that the API discovered with your input. In general, they indicate that the List will not contain the all of the information you requested. You should fix the warnings and re-submit your request.
	 */
	private List<String> warnings;
	
	private List<CardIdentifier> not_found;
	
	@Override
	public String toString() {
		return data.toString();
	}
	
	public List<T> getData() {
		return data;
	}
	
	public Boolean getHas_more() {
		return has_more;
	}
	
	public URI getNext_page() {
		return next_page;
	}
	
	public Integer getTotal_cards() {
		return total_cards;
	}
	
	public List<String> getWarnings() {
		return warnings;
	}
	
	public List<CardIdentifier> getNot_found() {
		return not_found;
	}

}
