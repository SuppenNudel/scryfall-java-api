package de.rohmio.mtg.scryfall.api.model.enums;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum ImageType {

	PNG("png"),
	BORDER_CROP("border_crop"),
	ART_CROP("art_crop"),
	LARGE("large"),
	NORMAL("normal"),
	SMALL("small");

	private String value;

	private static final Map<String, ImageType> ENUM_MAP;

	static {
		ENUM_MAP = Stream.of(ImageType.values()).collect(Collectors.toMap(ImageType::getValue, Function.identity()));
	}

	private ImageType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static ImageType fromValue(String value) {
		return ENUM_MAP.get(value);
	}

}
