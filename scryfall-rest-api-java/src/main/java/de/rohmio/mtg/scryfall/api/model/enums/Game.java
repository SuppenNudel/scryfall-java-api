package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Game {

	@JsonProperty("paper")
	PAPER,

	@JsonProperty("arena")
	ARENA,

	@JsonProperty("mtgo")
	MTGO,

	@JsonProperty("astral")
	ASTRAL,

	@JsonProperty("sega")
	SEGA;

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
