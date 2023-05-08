package de.rohmio.mtg.scryfall.api.model.enums;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum PriceType {

	USD("usd"),
	USD_FOIL("usd_foil"),
	EUR("eur"),
	EUR_FOIL("eur_foil"),
	TIX("tix"),
	USD_ETCHED("usd_etched");

	private String value;

	private static final Map<String, PriceType> ENUM_MAP;

	static {
		ENUM_MAP = Stream.of(PriceType.values()).collect(Collectors.toMap(PriceType::getValue, Function.identity()));
	}

	private PriceType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static PriceType fromValue(String value) {
		return ENUM_MAP.get(value);
	}

}
