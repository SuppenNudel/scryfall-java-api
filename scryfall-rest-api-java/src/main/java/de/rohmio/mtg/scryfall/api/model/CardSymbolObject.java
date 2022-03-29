package de.rohmio.mtg.scryfall.api.model;

import java.util.List;

import de.rohmio.mtg.scryfall.api.model.enums.Color;

public class CardSymbolObject extends ScryfallObject {
	
	/**
	 * The plaintext symbol. Often surrounded with curly braces {}. Note that not all symbols are ASCII text (for example, {∞}).
	 */
	private String symbol;
	
	/**
	 * An alternate version of this symbol, if it is possible to write it without curly braces.
	 * <br>
	 * Can be null or missing
	 */
	private String loose_variant;
	
	/**
	 * An English snippet that describes this symbol. Appropriate for use in alt text or other accessible communication formats.
	 */
	private String english;
	
	/**
	 * True if it is possible to write this symbol “backwards”. For example, the official symbol {U/P} is sometimes written as {P/U} or {P\U} in informal settings. Note that the Scryfall API never writes symbols backwards in other responses. This field is provided for informational purposes.
	 */
	private Boolean transposable;
	
	/**
	 * True if this is a mana symbol.
	 */
	private Boolean represents_mana;
	
	/**
	 * A decimal number representing this symbol’s converted mana cost. Note that mana symbols from funny sets can have fractional converted mana costs.
	 * <br>
	 * Can be null or missing
	 */
	private Double cmc;
	
	/**
	 * True if this symbol appears in a mana cost on any Magic card. For example {20} has this field set to false because {20} only appears in Oracle text, not mana costs.
	 */
	private Boolean appears_in_mana_costs;
	
	/**
	 * True if this symbol is only used on funny cards or Un-cards.
	 */
	private Boolean funny;
	
	/**
	 * An array of colors that this symbol represents.
	 */
	private List<Color> colors;
	
	/**
	 * An array of plaintext versions of this symbol that Gatherer uses on old cards to describe original printed text. For example: {W} has ["oW", "ooW"] as alternates.
	 */
	private List<String> gatherer_alternates;
	
	// from requesting myself
	private String svg_uri;
	
	@Override
	public String toString() {
		return symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public String getLoose_variant() {
		return loose_variant;
	}
	public String getEnglish() {
		return english;
	}
	public Boolean getTransposable() {
		return transposable;
	}
	public Boolean getRepresents_mana() {
		return represents_mana;
	}
	public Double getCmc() {
		return cmc;
	}
	public Boolean getAppears_in_mana_costs() {
		return appears_in_mana_costs;
	}
	public Boolean getFunny() {
		return funny;
	}
	public List<Color> getColors() {
		return colors;
	}
	public List<String> getGatherer_alternates() {
		return gatherer_alternates;
	}
	public String getSvg_uri() {
		return svg_uri;
	}

}
