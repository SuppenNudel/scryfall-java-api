package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Color {

	@JsonProperty("W")
	WHITE,

	@JsonProperty("U")
	BLUE,

	@JsonProperty("B")
	BLACK,

	@JsonProperty("R")
	RED,

	@JsonProperty("G")
	GREEN,

	@JsonProperty("C")
	COLORLESS;

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
