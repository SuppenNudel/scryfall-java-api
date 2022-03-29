package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ComponentType {
	

	@JsonProperty("token")
	TOKEN,

	@JsonProperty("meld_part")
	MELD_PART,
	
	@JsonProperty("meld_result")
	MELD_RESULT,

	@JsonProperty("combo_piece")
	COMBO_PIECE;
	
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
