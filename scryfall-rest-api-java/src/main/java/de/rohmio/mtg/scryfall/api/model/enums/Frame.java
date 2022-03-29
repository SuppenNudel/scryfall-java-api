package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Frame {
	
	@JsonProperty("1993")
	FRAME_1993,

	@JsonProperty("1997")
	FRAME_1997,

	@JsonProperty("2003")
	FRAME_2003,

	@JsonProperty("2015")
	FRAME_2015,

	@JsonProperty("future")
	FUTURE;

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
