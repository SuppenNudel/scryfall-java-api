package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Layout {

	@JsonProperty("normal")
	NORMAL,

	@JsonProperty("split")
	SPLIT,

	@JsonProperty("flip")
	FLIP,

	@JsonProperty("transform")
	TRANSFORM,

	@JsonProperty("modal_dfc")
	MODAL_DFC,

	@JsonProperty("meld")
	MELD,

	@JsonProperty("leveler")
	LEVELER,

	@JsonProperty("saga")
	SAGA,

	@JsonProperty("adventure")
	ADVENTURE,

	@JsonProperty("planar")
	PLANAR,

	@JsonProperty("scheme")
	SCHEME,

	@JsonProperty("vanguard")
	VANGUARD,

	@JsonProperty("token")
	TOKEN,

	@JsonProperty("double_faced_token")
	DOUBLE_FACED_TOKEN,

	@JsonProperty("emblem")
	EMBLEM,

	@JsonProperty("augment")
	AUGMENT,

	@JsonProperty("host")
	HOST,

	@JsonProperty("art_series")
	ART_SERIES,

	@JsonProperty("class")
	CLASS,

	@JsonProperty("double_sided")
	DOUBLE_SIDED,

	@JsonProperty("reversible_card")
	REVERSIBLE_CARD;

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
