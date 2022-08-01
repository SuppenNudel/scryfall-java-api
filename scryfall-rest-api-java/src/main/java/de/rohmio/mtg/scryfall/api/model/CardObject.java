package de.rohmio.mtg.scryfall.api.model;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import de.rohmio.mtg.scryfall.api.model.enums.BorderColor;
import de.rohmio.mtg.scryfall.api.model.enums.Color;
import de.rohmio.mtg.scryfall.api.model.enums.ContentSite;
import de.rohmio.mtg.scryfall.api.model.enums.Finish;
import de.rohmio.mtg.scryfall.api.model.enums.Format;
import de.rohmio.mtg.scryfall.api.model.enums.Frame;
import de.rohmio.mtg.scryfall.api.model.enums.FrameEffect;
import de.rohmio.mtg.scryfall.api.model.enums.Game;
import de.rohmio.mtg.scryfall.api.model.enums.ImageStatus;
import de.rohmio.mtg.scryfall.api.model.enums.Legality;
import de.rohmio.mtg.scryfall.api.model.enums.Rarity;

public class CardObject extends CardFaceObject {

	/**
	 * UUID - Finds a card with the specified Scryfall id.
	 */
	private String id;

	/**
	 * Finds a card with the specified mtgo_id or mtgo_foil_id.
	 */
	private Integer mtgo_id;

	/**
	 * Finds a card with the specified value among its multiverse_ids.
	 */
	private Integer multiverse_id;

	private Integer penny_rank;

	public Integer getPenny_rank() {
		return penny_rank;
	}

	/*
	 * Finds the preferred scans of cards with the specified illustration_id.
	 */
//	private String illustration_id;

	/**
	 * Finds the newest edition of a card with the specified name.
	 */
//	private String name;

	/**
	 * Finds a card matching the specified name and set.
	 */
	private String set;

	/**
	 * Finds a card with the specified collector_number and set. Note that collector numbers are strings.
	 */
	private String collector_number;

	// Core Card Fields

	private Integer arena_id;
	private String lang;
	private Integer mtgo_foil_id;
	private List<Integer> multiverse_ids;
	private Integer tcgplayer_id;
	private Integer tcgplayer_etched_id;
	private Integer cardmarket_id;
	private String prints_search_uri;
	private String rulings_uri;
	private String scryfall_uri;
	private String uri;

	// Gameplay Fields

	private List<RelatedCardObject> all_parts;
	private List<CardFaceObject> card_faces;
	private List<Color> color_identity;
	private List<String> keywords;
	private Integer edhrec_rank;
	private Boolean foil;
	private String hand_modifier;
	private Map<Format, Legality> legalities;
	private String life_modifier;
	private Boolean nonfoil;
	private Boolean oversized;

	/**
	 * Colors of mana that this card could produce.
	 */
	private List<Color> produced_mana;
	private Boolean reserved;

	// Print Fields

	private List<String> artist_ids;
	private Boolean booster;
	private BorderColor border_color;
	private String card_back_id;
	private Boolean digital;
	private List<Finish> finishes;
	private List<FrameEffect> frame_effects;
	private Frame frame;
	private Boolean full_art;
	private List<Game> games;
	private Boolean highres_image;
	private ImageStatus image_status;
	private PriceObject prices;
	private Boolean promo;
	private List<String> promo_types;
	private Map<ContentSite, String> purchase_uris;
	private Rarity rarity;
	private Map<String, String> related_uris;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate released_at;
	private Boolean reprint;
	private URI scryfall_set_uri;
	private String set_name;
	private URI set_search_uri;
	private String set_type;
	private URI set_uri;
	private String set_id;
	private Boolean story_spotlight;
	private Boolean textless;
	private Boolean variation;
	private String variation_of;
	private String security_stamp;
	private Preview preview;

	private Boolean content_warning;

	@Override
	public String toString() {
		return String.format("%s - %s (%s)", getName(), getSet(), getSet_name());
	}

	public Integer getArena_id() {
		return arena_id;
	}

	public String getLang() {
		return lang;
	}

	public Integer getMtgo_foil_id() {
		return mtgo_foil_id;
	}

	public List<Integer> getMultiverse_ids() {
		return multiverse_ids;
	}

	public Integer getTcgplayer_id() {
		return tcgplayer_id;
	}

	public Integer getCardmarket_id() {
		return cardmarket_id;
	}

	public String getPrints_search_uri() {
		return prints_search_uri;
	}

	public String getRulings_uri() {
		return rulings_uri;
	}

	public String getScryfall_uri() {
		return scryfall_uri;
	}

	public String getUri() {
		return uri;
	}

	public List<RelatedCardObject> getAll_parts() {
		return all_parts;
	}

	public List<CardFaceObject> getCard_faces() {
		return card_faces;
	}
	
	public List<Color> getColor_identity() {
		return color_identity;
	}

	public Integer getEdhrec_rank() {
		return edhrec_rank;
	}

	public Boolean getFoil() {
		return foil;
	}

	public String getHand_modifier() {
		return hand_modifier;
	}

	public Map<Format, Legality> getLegalities() {
		return legalities;
	}

	public String getLife_modifier() {
		return life_modifier;
	}

	public Boolean getNonfoil() {
		return nonfoil;
	}

	public Boolean getOversized() {
		return oversized;
	}

	public Boolean getReserved() {
		return reserved;
	}

	public BorderColor getBorder_color() {
		return border_color;
	}

	public Boolean getDigital() {
		return digital;
	}

	public List<FrameEffect> getFrame_effects() {
		return frame_effects;
	}

	public Frame getFrame() {
		return frame;
	}

	public Boolean getFull_art() {
		return full_art;
	}

	public List<Game> getGames() {
		return games;
	}

	public Boolean getHighres_image() {
		return highres_image;
	}

	public ImageStatus getImage_status() {
		return image_status;
	}

	public PriceObject getPrices() {
		return prices;
	}

	public Boolean getPromo() {
		return promo;
	}

	public Map<ContentSite, String> getPurchase_uris() {
		return purchase_uris;
	}

	public Rarity getRarity() {
		return rarity;
	}

	public Map<String, String> getRelated_uris() {
		return related_uris;
	}

	public LocalDate getReleased_at() {
		return released_at;
	}

	public Boolean getReprint() {
		return reprint;
	}

	public URI getScryfall_set_uri() {
		return scryfall_set_uri;
	}

	public String getSet_id() {
		return set_id;
	}

	public String getSet_name() {
		return set_name;
	}

	public URI getSet_search_uri() {
		return set_search_uri;
	}

	public URI getSet_uri() {
		return set_uri;
	}

	public Boolean getStory_spotlight() {
		return story_spotlight;
	}

	public Preview getPreview() {
		return preview;
	}

	public Boolean getBooster() {
		return booster;
	}

	public String getCard_back_id() {
		return card_back_id;
	}

	public List<String> getPromo_types() {
		return promo_types;
	}

	public String getSet_type() {
		return set_type;
	}

	public Boolean getTextless() {
		return textless;
	}

	public Boolean getVariation() {
		return variation;
	}

	public String getVariation_of() {
		return variation_of;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public List<Color> getProduced_mana() {
		return produced_mana;
	}

	public Boolean getContent_warning() {
		return content_warning;
	}

	public List<Finish> getFinishes() {
		return finishes;
	}

	public String getSecurity_stamp() {
		return security_stamp;
	}

	public String getCollector_number() {
		return collector_number;
	}

	public String getId() {
		return id;
	}
	public Integer getMtgo_id() {
		return mtgo_id;
	}
	public Integer getMultiverse_id() {
		return multiverse_id;
	}
	public String getSet() {
		return set;
	}

	public List<String> getArtist_ids() {
		return artist_ids;
	}
	public Integer getTcgplayer_etched_id() {
		return tcgplayer_etched_id;
	}

}
