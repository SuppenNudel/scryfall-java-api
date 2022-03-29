package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum FrameEffect {

	@JsonProperty("legendary")
	LEGENDARY,

	@JsonProperty("miracle")
	MIRACLE,

	@JsonProperty("nyxtouched")
	NYX_TOUCHED,

	@JsonProperty("draft")
	DRAFT,

	@JsonProperty("devoid")
	DEVOID,

	@JsonProperty("tombstone")
	TOMBSTONE,

	@JsonProperty("colorshifted")
	COLORSHIFTED,

	@JsonProperty("inverted")
	INVERTED,

	@JsonProperty("sunmoondfc")
	SUN_MOON_DFC,

	@JsonProperty("compasslanddfc")
	COMPASS_LAND_DFC,

	@JsonProperty("originpwdfc")
	ORIGIN_PW_DFC,

	@JsonProperty("mooneldrazidfc")
	MOON_ELDRAZI_DFC,

	@JsonProperty("moonreversemoondfc")
	MOOND_REVERSE_MOON_DFC,

	@JsonProperty("showcase")
	SHOWCASE,

	@JsonProperty("extendedart")
	EXTENDED_ART,

	@JsonProperty("companion")
	COMPANION,

	@JsonProperty("etched")
	ETCHED,

	@JsonProperty("snow")
	SNOW,

	@JsonProperty("lesson")
	LESSON,

	@JsonProperty("waxingandwaningmoondfc")
	WAXING_AND_WANING_MOON_DFC,

	@JsonProperty("fullart")
	FULLART;

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
