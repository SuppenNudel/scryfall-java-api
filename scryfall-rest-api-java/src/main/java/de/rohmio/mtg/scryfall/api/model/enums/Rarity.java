package de.rohmio.mtg.scryfall.api.model.enums;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Rarity {

	COMMON("common"),
	UNCOMMON("uncommon"),
	RARE("rare"),
	MYTHIC("mythic"),
	BONUS("bonus"),
	SPECIAL("special");

	private String value;

	private static final Map<String, Rarity> ENUM_MAP;

	static {
		ENUM_MAP = Stream.of(Rarity.values()).collect(Collectors.toMap(Rarity::getValue, Function.identity()));
	}

	private Rarity(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static Rarity fromValue(String value) {
		return ENUM_MAP.get(value);
	}

}
