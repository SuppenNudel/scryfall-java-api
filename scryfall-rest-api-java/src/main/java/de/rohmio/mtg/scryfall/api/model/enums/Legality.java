package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Legality {
	
	@JsonProperty("legal")
	LEGAL,

	@JsonProperty("not_legal")
	NOT_LEGAL,

	@JsonProperty("restricted")
	RESTRICTED,

	@JsonProperty("banned")
	BANNED;

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
