package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ImageType {
	
	@JsonProperty("small")
	SMALL,

	@JsonProperty("normal")
	NORMAL,

	@JsonProperty("large")
	LARGE,

	@JsonProperty("png")
	PNG,

	@JsonProperty("art_crop")
	ART_CROP,

	@JsonProperty("border_crop")
	BORDER_CROP;

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
