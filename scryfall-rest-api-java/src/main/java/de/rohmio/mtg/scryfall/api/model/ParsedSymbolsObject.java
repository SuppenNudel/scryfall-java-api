package de.rohmio.mtg.scryfall.api.model;

import java.util.List;
import java.util.stream.Collectors;

import de.rohmio.mtg.scryfall.api.model.enums.Color;

public class ParsedSymbolsObject extends ScryfallObject {

	/**
	 * The normalized cost, with correctly-ordered and wrapped mana symbols.
	 */
	private String cost;

	/**
	 * The converted mana cost. If you submit Un-set mana symbols, this decimal could include fractional parts.
	 */
	private Double cmc;

	/**
	 * The colors of the given cost.
	 */
	private List<String> colors;

	/**
	 * True if the cost is colorless.
	 */
	private Boolean colorless;

	/**
	 * True if the cost is monocolored.
	 */
	private Boolean monocolored;

	/**
	 * True if the cost is multicolored.
	 */
	private Boolean multicolored;

	@Override
	public String toString() {
		return cost;
	}

	public String getCost() {
		return cost;
	}
	public Double getCmc() {
		return cmc;
	}
	public List<String> getColors() {
		return colors;
	}
	public List<Color> getColorsEnum() {
		if (getColors() == null) {
			return null;
		}
		return getColors().stream().map(Color::fromValue).collect(Collectors.toList());
	}
	public Boolean isColorless() {
		return colorless;
	}
	public Boolean isMonocolored() {
		return monocolored;
	}
	public Boolean isMulticolored() {
		return multicolored;
	}

}
