package de.rohmio.mtg.scryfall.api.model;

import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import de.rohmio.mtg.scryfall.api.model.enums.CardType;
import de.rohmio.mtg.scryfall.api.model.enums.Color;
import de.rohmio.mtg.scryfall.api.model.enums.ImageType;
import de.rohmio.mtg.scryfall.api.model.enums.Layout;

public class CardFaceObject extends ScryfallObject {

	private String artist;
	@JsonProperty("artist_id")
	private UUID artistId;
	private Double cmc;
	@JsonProperty("color_indicator")
	private List<String> colorIndicator; // enum done
	private List<String> colors; // enum done
	private Integer defense;
	@JsonProperty("flavor_name")
	private String flavorName;
	@JsonProperty("flavor_text")
	private String flavorText;
	@JsonProperty("illustration_id")
	private UUID illustrationId;
	/**
	 * An object providing URIs to imagery for this face, if this is a double-sided
	 * card. If this card is not double-sided, then the image_uris property will be
	 * part of the parent object instead.
	 */
	@JsonProperty("image_uris")
	private Map<String, URI> imageUris;
	private String layout;
	private Layout layoutEnum;
	private String loyalty;
	@JsonProperty("mana_cost")
	private String manaCost;
	private String name;
	// private String object; -> ScryfallObject
	@JsonProperty("oracle_id")
	private UUID oracleId;
	@JsonProperty("oracle_text")
	private String oracleText;
	private String power;
	@JsonProperty("printed_name")
	private String printedName;
	@JsonProperty("printed_text")
	private String printedText;
	@JsonProperty("printed_type_line")
	private String printedTypeLine;
	private String toughness;
	@JsonProperty("type_line")
	private String typeLine;
	private String watermark;

	@Override
	public String toString() {
		return getName();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public List<String> getColorIndicator() {
		return colorIndicator;
	}

	@JsonIgnore
	public List<Color> getColorIndicatorEnum() {
		if (getColorIndicator() == null) {
			return null;
		}
		return getColorIndicator().stream().map(Color::fromValue).collect(Collectors.toList());
	}

	public List<String> getColors() {
		return colors;
	}

	@JsonIgnore
	public List<Color> getColorsEnum() {
		if (getColors() == null) {
			return null;
		}
		return getColors().stream().map(Color::fromValue).collect(Collectors.toList());
	}

	public String getFlavorText() {
		return flavorText;
	}

	public UUID getIllustrationId() {
		return illustrationId;
	}

	public Map<String, URI> getImageUris() {
		return imageUris;
	}

	@JsonIgnore
	public Map<ImageType, URI> getImageUrisEnum() {
		if (getImageUris() == null) {
			return null;
		}
		Map<ImageType, URI> enumMap = new HashMap<>();
		for(Entry<String, URI> entry : imageUris.entrySet()) {
			enumMap.put(ImageType.fromValue(entry.getKey()), entry.getValue());
		}
		return enumMap;
	}

	public String getLoyalty() {
		return loyalty;
	}

	public String getManaCost() {
		return manaCost;
	}

	public String getName() {
		return name;
	}

	public String getOracleText() {
		return oracleText;
	}

	public String getPower() {
		return power;
	}

	public String getPrintedName() {
		return printedName;
	}

	public String getPrintedText() {
		return printedText;
	}

	public String getPrintedTypeLine() {
		return printedTypeLine;
	}

	public String getToughness() {
		return toughness;
	}

	public String getTypeLine() {
		return typeLine;
	}

	@JsonIgnore
	public List<String> getTypes() {
		if(typeLine == null) {
			System.err.println();
		}
		return Arrays.asList(typeLine.replace("— ", "").split(" "));
	}

	public List<CardType> getTypesEnum() {
		List<String> types = getTypes();
		List<CardType> typesEnum = types.stream().map(typeStr -> {
			try {
				return CardType.valueOf(typeStr.toUpperCase());
			} catch (IllegalArgumentException e) {
				// not implemented
				return null;
			}
		}).filter(type -> type != null).collect(Collectors.toList());
		return typesEnum;
	}

	public String getWatermark() {
		return watermark;
	}

	public UUID getOracleId() {
		return oracleId;
	}

	public String getLayout() {
		return layout;
	}
	public Layout getLayoutEnum() {
		if(layout == null) {
			return null;
		}
		if(layoutEnum == null) {
			layoutEnum = Layout.valueOf(layout.toUpperCase());
		}
		return layoutEnum;
	}

	public Double getCmc() {
		return cmc;
	}

	public UUID getArtistId() {
		return artistId;
	}

	public String getFlavorName() {
		return flavorName;
	}

	public Integer getDefense() {
		return defense;
	}

}
