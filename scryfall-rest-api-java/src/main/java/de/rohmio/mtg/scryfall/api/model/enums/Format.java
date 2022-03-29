package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Format {

	@JsonProperty("standard")
	STANDARD,

	@JsonProperty("future")
	FUTURE,

	@JsonProperty("historic")
	HISTORIC,

	@JsonProperty("pioneer")
	PIONEER,

	@JsonProperty("modern")
	MODERN,

	@JsonProperty("legacy")
	LEGACY,

	@JsonProperty("pauper")
	PAUPER,

	@JsonProperty("vintage")
	VINTAGE,

	@JsonProperty("penny")
	PENNY_DREADFUL,

	@JsonProperty("commander")
	COMMANDER,

	@JsonProperty("brawl")
	BRAWL,

	@JsonProperty("duel")
	DUEL_COMMANDER,

	@JsonProperty("gladiator")
	GLADIATOR,

	@JsonProperty("premodern")
	PREMODERN,

	@JsonProperty("oldschool")
	OLDSCHOOL,

	@JsonProperty("historicbrawl")
	HISTORIC_BRAWL,

	@JsonProperty("alchemy")
	ALCHEMY,

	@JsonProperty("paupercommander")
	PAUPER_COMMANDER;

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
