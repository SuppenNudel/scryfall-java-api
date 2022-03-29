package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum BorderColor {
	
	@JsonProperty("black")
	BLACK,
		
	@JsonProperty("borderless")
	BORDERLESS,
	
	@JsonProperty("gold")
	GOLD,
	
	@JsonProperty("silver")
	SILVER,
	
	@JsonProperty("white")
	WHITE;

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
