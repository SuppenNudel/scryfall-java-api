package de.rohmio.mtg.scryfall.api.model.enums;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Color {

	WHITE("W"),
	BLUE("U"),
	BLACK("B"),
	RED("R"),
	GREEN("G"),
	TAP_SYMBOL("T");
	//	COLORLESS("C");

	private String value;

	private static final Map<String, Color> ENUM_MAP;

	static {
		ENUM_MAP = Stream.of(Color.values()).collect(Collectors.toMap(Color::getValue, Function.identity()));
	}

	private Color(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static Color fromValue(String value) {
		return ENUM_MAP.get(value);
	}

}
