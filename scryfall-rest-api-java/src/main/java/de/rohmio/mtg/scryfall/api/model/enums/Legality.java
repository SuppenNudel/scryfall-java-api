package de.rohmio.mtg.scryfall.api.model.enums;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Legality {

	LEGAL("legal"),
	NOT_LEGAL("not_legal"),
	RESTRICTED("restricted"),
	BANNED("banned");

	private String value;

	private static final Map<String, Legality> ENUM_MAP;

	static {
		ENUM_MAP = Stream.of(Legality.values()).collect(Collectors.toMap(Legality::getValue, Function.identity()));
	}

	private Legality(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static Legality fromValue(String value) {
		return ENUM_MAP.get(value);
	}

}
