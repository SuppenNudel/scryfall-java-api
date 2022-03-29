package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Direction {
	
	/**
	 * Scryfall will automatically choose the most inuitive direction to sort
	 */
	@JsonProperty("auto")
	AUTO,
	/**
	 * Sort ascending (the direction of the arrows in the previous table)
	 */
	@JsonProperty("asc")
	ASC,
	/**
	 * Sort descending (flip the direction of the arrows in the previous table)
	 */
	@JsonProperty("desc")
	DESC;

	@Override
	public String toString() {
		try {
			JsonProperty annotation = getClass().getField(name()).getAnnotation(JsonProperty.class);
			return annotation.value();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		return null;
	}

}
