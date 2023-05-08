package de.rohmio.mtg.scryfall.api.model.enums;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Format {

	STANDARD("standard"),
	FUTURE("future"),
	HISTORIC("historic"),
	PIONEER("pioneer"),
	MODERN("modern"),
	LEGACY("legacy"),
	PAUPER("pauper"),
	VINTAGE("vintage"),
	PENNY_DREADFUL("penny"),
	COMMANDER("commander"),
	BRAWL("brawl"),
	DUEL_COMMANDER("duel"),
	GLADIATOR("gladiator"),
	PREMODERN("premodern"),
	OLDSCHOOL("oldschool"),
	HISTORIC_BRAWL("historicbrawl"),
	ALCHEMY("alchemy"),
	EXPLORER("explorer"),
	PAUPER_COMMANDER("paupercommander");

	private String value;

	private static final Map<String, Format> ENUM_MAP;

	static {
		ENUM_MAP = Stream.of(Format.values()).collect(Collectors.toMap(Format::getValue, Function.identity()));
	}

	private Format(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static Format fromValue(String value) {
		return ENUM_MAP.get(value);
	}

}
