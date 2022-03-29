package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ContentSite {

	@JsonProperty("multiverse")
	MULTIVERSE,

	@JsonProperty("mtgo")
	MTGO,

	@JsonProperty("arena")
	ARENA,

	@JsonProperty("tcgplayer")
	TCGPLAYER,

	@JsonProperty("cardmarket")
	CARDMARKET,

	@JsonProperty("cardhoarder")
	CARDHOARDER;

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
