package de.rohmio.mtg.scryfall.api.model;

import java.net.URI;
import java.util.List;

public class CatalogObject extends ScryfallObject {
	
	/**
	 * A link to the current catalog on Scryfall’s API.
	 */
	private URI uri;
	
	/**
	 * The number of items in the data array.
	 */
	private Integer total_values;
	
	/**
	 * An array of datapoints, as strings.
	 */
	private List<String> data;
	
	public URI getUri() {
		return uri;
	}
	
	public Integer getTotal_values() {
		return total_values;
	}
	
	public List<String> getData() {
		return data;
	}

}
