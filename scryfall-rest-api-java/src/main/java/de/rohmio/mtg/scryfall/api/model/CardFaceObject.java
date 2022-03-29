package de.rohmio.mtg.scryfall.api.model;

import java.util.List;
import java.util.Map;

import de.rohmio.mtg.scryfall.api.model.enums.Color;
import de.rohmio.mtg.scryfall.api.model.enums.ImageType;
import de.rohmio.mtg.scryfall.api.model.enums.Layout;

public class CardFaceObject extends ScryfallObject {

	private String artist;
	private String artist_id;
	private List<Color> color_indicator;
	private List<Color> colors;
	private String flavor_name;
	private String flavor_text;
	private String illustration_id;
	private Map<ImageType, String> image_uris;
	private String loyalty;
	private String mana_cost;
	private String name;
	private String oracle_text;
	private String power;
	private String printed_name;
	private String printed_text;
	private String printed_type_line;
	private String toughness;
	private String type_line;
	private String watermark;
	private Layout layout;
	private Double cmc;
	/**
	 * Finds the newest edition of cards with the specified oracle_id.
	 */
	private String oracle_id;

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public List<Color> getColor_indicator() {
		return color_indicator;
	}

	public List<Color> getColors() {
		return colors;
	}

	public String getFlavor_text() {
		return flavor_text;
	}

	public String getIllustration_id() {
		return illustration_id;
	}

	public Map<ImageType, String> getImage_uris() {
		return image_uris;
	}

	public String getLoyalty() {
		return loyalty;
	}

	public String getMana_cost() {
		return mana_cost;
	}

	public String getName() {
		return name;
	}

	public String getOracle_text() {
		return oracle_text;
	}

	public String getPower() {
		return power;
	}

	public String getPrinted_name() {
		return printed_name;
	}

	public String getPrinted_text() {
		return printed_text;
	}

	public String getPrinted_type_line() {
		return printed_type_line;
	}

	public String getToughness() {
		return toughness;
	}

	public String getType_line() {
		return type_line;
	}

	public String getWatermark() {
		return watermark;
	}

	public String getArtist_id() {
		return artist_id;
	}

	public String getFlavor_name() {
		return flavor_name;
	}

	public String getOracle_id() {
		return oracle_id;
	}
	public Layout getLayout() {
		return layout;
	}
	public Double getCmc() {
		return cmc;
	}

}
