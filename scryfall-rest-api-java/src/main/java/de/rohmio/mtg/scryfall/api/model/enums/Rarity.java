package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Rarity {

	@JsonProperty("common")
	COMMON,

	@JsonProperty("uncommon")
	UNCOMMON,

	@JsonProperty("rare")
	RARE,

	@JsonProperty("mythic")
	MYTHIC,

	@JsonProperty("bonus")
	BONUS,

	@JsonProperty("special")
	SPECIAL;

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
