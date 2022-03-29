package de.rohmio.mtg.scryfall.api.model;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Map;

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
	private URI prints_search_uri;
	private URI rulings_uri;
	private URI scryfall_uri;
	private URI uri;

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
	private Date released_at;
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

	public URI getPrints_search_uri() {
		return prints_search_uri;
	}

	public URI getRulings_uri() {
		return rulings_uri;
	}

	public URI getScryfall_uri() {
		return scryfall_uri;
	}

	public URI getUri() {
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

	public Date getReleased_at() {
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

	public void setArena_id(Integer arena_id) {
		this.arena_id = arena_id;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public void setMtgo_foil_id(Integer mtgo_foil_id) {
		this.mtgo_foil_id = mtgo_foil_id;
	}

	public void setMultiverse_ids(List<Integer> multiverse_ids) {
		this.multiverse_ids = multiverse_ids;
	}

	public void setTcgplayer_id(Integer tcgplayer_id) {
		this.tcgplayer_id = tcgplayer_id;
	}

	public void setCardmarket_id(Integer cardmarket_id) {
		this.cardmarket_id = cardmarket_id;
	}

	public void setPrints_search_uri(URI prints_search_uri) {
		this.prints_search_uri = prints_search_uri;
	}

	public void setRulings_uri(URI rulings_uri) {
		this.rulings_uri = rulings_uri;
	}

	public void setScryfall_uri(URI scryfall_uri) {
		this.scryfall_uri = scryfall_uri;
	}

	public void setUri(URI uri) {
		this.uri = uri;
	}

	public void setAll_parts(List<RelatedCardObject> all_parts) {
		this.all_parts = all_parts;
	}

	public void setCard_faces(List<CardFaceObject> card_faces) {
		this.card_faces = card_faces;
	}

	public void setColor_identity(List<Color> color_identity) {
		this.color_identity = color_identity;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public void setEdhrec_rank(Integer edhrec_rank) {
		this.edhrec_rank = edhrec_rank;
	}

	public void setFoil(Boolean foil) {
		this.foil = foil;
	}

	public void setHand_modifier(String hand_modifier) {
		this.hand_modifier = hand_modifier;
	}

	public void setLegalities(Map<Format, Legality> legalities) {
		this.legalities = legalities;
	}

	public void setLife_modifier(String life_modifier) {
		this.life_modifier = life_modifier;
	}

	public void setNonfoil(Boolean nonfoil) {
		this.nonfoil = nonfoil;
	}

	public void setOversized(Boolean oversized) {
		this.oversized = oversized;
	}

	public void setProduced_mana(List<Color> produced_mana) {
		this.produced_mana = produced_mana;
	}

	public void setReserved(Boolean reserved) {
		this.reserved = reserved;
	}

	public void setBooster(Boolean booster) {
		this.booster = booster;
	}

	public void setBorder_color(BorderColor border_color) {
		this.border_color = border_color;
	}

	public void setCard_back_id(String card_back_id) {
		this.card_back_id = card_back_id;
	}

	public void setDigital(Boolean digital) {
		this.digital = digital;
	}

	public void setFrame_effects(List<FrameEffect> frame_effects) {
		this.frame_effects = frame_effects;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public void setFull_art(Boolean full_art) {
		this.full_art = full_art;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	public void setHighres_image(Boolean highres_image) {
		this.highres_image = highres_image;
	}

	public void setPrices(PriceObject prices) {
		this.prices = prices;
	}

	public void setPromo(Boolean promo) {
		this.promo = promo;
	}

	public void setPromo_types(List<String> promo_types) {
		this.promo_types = promo_types;
	}

	public void setPurchase_uris(Map<ContentSite, String> purchase_uris) {
		this.purchase_uris = purchase_uris;
	}

	public void setRarity(Rarity rarity) {
		this.rarity = rarity;
	}

	public void setRelated_uris(Map<String, String> related_uris) {
		this.related_uris = related_uris;
	}

	public void setReleased_at(Date released_at) {
		this.released_at = released_at;
	}

	public void setReprint(Boolean reprint) {
		this.reprint = reprint;
	}

	public void setScryfall_set_uri(URI scryfall_set_uri) {
		this.scryfall_set_uri = scryfall_set_uri;
	}

	public void setSet_name(String set_name) {
		this.set_name = set_name;
	}

	public void setSet_search_uri(URI set_search_uri) {
		this.set_search_uri = set_search_uri;
	}

	public void setSet_type(String set_type) {
		this.set_type = set_type;
	}

	public void setSet_uri(URI set_uri) {
		this.set_uri = set_uri;
	}

	public void setStory_spotlight(Boolean story_spotlight) {
		this.story_spotlight = story_spotlight;
	}

	public void setTextless(Boolean textless) {
		this.textless = textless;
	}

	public void setVariation(Boolean variation) {
		this.variation = variation;
	}

	public void setVariation_of(String variation_of) {
		this.variation_of = variation_of;
	}

	public void setPreview(Preview preview) {
		this.preview = preview;
	}

	public void setContent_warning(Boolean content_warning) {
		this.content_warning = content_warning;
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
