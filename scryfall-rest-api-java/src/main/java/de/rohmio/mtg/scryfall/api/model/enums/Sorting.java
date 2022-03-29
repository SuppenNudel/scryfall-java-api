package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Sorting {
	
	/**
	 * Sort cards by name, A → Z
	 */
	@JsonProperty("name")
	NAME,
	/**
	 * Sort cards by their set and collector number: AAA/#1 → ZZZ/#999
	 */
	@JsonProperty("set")
	SET,
	/**
	 * Sort cards by their release date: Newest → Oldest
	 */
	@JsonProperty("released")
	RELEASED,
	/**
	 * Sort cards by their rarity: Common → Mythic
	 */
	@JsonProperty("rarity")
	RARITY,
	/**
	 * Sort cards by their color and color identity: WUBRG → multicolor → colorless
	 */
	@JsonProperty("color")
	COLOR,
	/**
	 * Sort cards by their lowest known U.S. Dollar price: 0.01 → highest, null last
	 */
	@JsonProperty("usd")
	USD,
	/**
	 * Sort cards by their lowest known TIX price: 0.01 → highest, null last
	 */
	@JsonProperty("tix")
	TIX,
	/**
	 * Sort cards by their lowest known Euro price: 0.01 → highest, null last
	 */
	@JsonProperty("eur")
	EUR,
	/**
	 * Sort cards by their converted mana cost: 0 → highest
	 */
	@JsonProperty("cmc")
	CMC,
	/**
	 * Sort cards by their power: null → highest
	 */
	@JsonProperty("power")
	POWER,
	/**
	 * Sort cards by their toughness: null → highest
	 */
	@JsonProperty("toughness")
	TOUGHNESS,
	/**
	 * Sort cards by their EDHREC ranking: lowest → highest
	 */
	@JsonProperty("edhrec")
	EDHREC,
	/**
	 * Sort cards by their front-side artist name: A → Z
	 */
	@JsonProperty("artist")
	ARTIST;

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
