package de.rohmio.mtg.scryfall.api.model.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SetType {
	
	@JsonProperty("core")
	CORE, // A yearly Magic core set (Tenth Edition, etc)
	
	@JsonProperty("expansion")
	EXPANSION, // A rotational expansion set in a block (Zendikar, etc)
	
	@JsonProperty("masters")
	MASTERS, // A reprint set that contains no new cards (Modern Masters, etc)
	
	@JsonProperty("masterpiece")
	MASTERPIECE, // Masterpiece Series premium foil cards
	
	@JsonProperty("from_the_vault")
	FROM_THE_VAULT, // From the Vault gift sets
	
	@JsonProperty("spellbook")
	SPELLBOOK, // Spellbook series gift sets
	
	@JsonProperty("premium_deck")
	PREMIUM_DECK, // Premium Deck Series decks
	
	@JsonProperty("duel_deck")
	DUEL_DECK, // Duel Decks
	
	@JsonProperty("draft_innovation")
	DRAFT_INNOVATION, // Special draft sets, like Conspiracy and Battlebond
	
	@JsonProperty("treasure_chest")
	TREASURE_CHEST, // Magic Online treasure chest prize sets
	
	@JsonProperty("commander")
	COMMANDER, // Commander preconstructed decks
	
	@JsonProperty("planechase")
	PLANECHASE, // Planechase sets
	
	@JsonProperty("archenemy")
	ARCHENEMY, // Archenemy sets
	
	@JsonProperty("vanguard")
	VANGUARD, // Vanguard card sets
	
	@JsonProperty("funny")
	FUNNY, // A funny un-set or set with funny promos (Unglued, Happy Holidays, etc)
	
	@JsonProperty("starter")
	STARTER, // A starter/introductory set (Portal, etc)
	
	@JsonProperty("box")
	BOX, // A gift box set
	
	@JsonProperty("promo")
	PROMO, // A set that contains purely promotional cards
	
	@JsonProperty("token")
	TOKEN, // A set made up of tokens and emblems.
	
	@JsonProperty("memorabilia")
	MEMORABILIA; // A set made up of gold-bordered, oversize, or trophy cards that are not legal

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
