package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CatalogType {

	@JsonProperty("card-names")
	CARD_NAMES,

	@JsonProperty("artist-names")
	ARTIST_NAMES,

	@JsonProperty("word-bank")
	WORD_BANK,

	@JsonProperty("creature-types")
	CREATURE_TYPES,

	@JsonProperty("planeswalker-types")
	PLANESWALKER_TYPES,

	@JsonProperty("land-types")
	LAND_TYPES,

	@JsonProperty("artifact-types")
	ARTIFACT_TYPES,

	@JsonProperty("enchantment-types")
	ENCHANTMENT_TYPES,

	@JsonProperty("spell-types")
	SPELL_TYPES,

	@JsonProperty("powers")
	POWERS,

	@JsonProperty("toughnesses")
	TOUGHNESSES,

	@JsonProperty("loyalties")
	LOYALTIES,

	@JsonProperty("watermarks")
	WATERMARKS,

	@JsonProperty("keyword-abilities")
	KEYWORD_ABILITES,

	@JsonProperty("keyword-actions")
	KEYWORD_ACTIONS,

	@JsonProperty("ability-words")
	ABILITY_WORDS;

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
