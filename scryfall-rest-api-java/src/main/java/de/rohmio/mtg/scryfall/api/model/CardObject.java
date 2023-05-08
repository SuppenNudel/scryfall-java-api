package de.rohmio.mtg.scryfall.api.model;

import java.net.URI;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import de.rohmio.mtg.scryfall.api.model.enums.Color;
import de.rohmio.mtg.scryfall.api.model.enums.Format;
import de.rohmio.mtg.scryfall.api.model.enums.Legality;
import de.rohmio.mtg.scryfall.api.model.enums.PriceType;
import de.rohmio.mtg.scryfall.api.model.enums.Rarity;

public class CardObject extends CardFaceObject {

	private Boolean foil; // ignored, now in finishes
	private Boolean nonfoil; // ignored, now in finishes
	private List<UUID> artist_ids; // ignored,

	// Core Card Fields

	@JsonProperty("arena_id")
	private Integer arenaId;
	private UUID id;
	private String lang;
	@JsonProperty("mtgo_id")
	private Integer mtgoId;
	@JsonProperty("mtgo_foil_id")
	private Integer mtgoFoilId;
	@JsonProperty("multiverse_ids")
	private List<Integer> multiverseIds;
	@JsonProperty("tcgplayer_id")
	private Integer tcgplayerId;
	@JsonProperty("tcgplayer_etched_id")
	private Integer tcgplayerEtchedId;
	@JsonProperty("cardmarket_id")
	private Integer cardmarketId;
	// private String object; -> ScryfallObject
	// private UUID oracleId; -> CardFaceObject
	@JsonProperty("prints_search_uri")
	private URI printsSearchUri;
	@JsonProperty("rulings_uri")
	private URI rulingsUri;
	@JsonProperty("scryfall_uri")
	private URI scryfallUri;
	private URI uri;

	// Gameplay Fields

	@JsonProperty("all_parts")
	private List<RelatedCardObject> allParts;
	@JsonProperty("card_faces")
	private List<CardFaceObject> cardFaces;
	// private Double cmc; -> CardFaceObject
	@JsonProperty("color_identity")
	private List<String> colorIdentity;
	// private List<String> colorIndicator; -> CardFaceObject
	// private List<String> color; -> CardFaceObject
	@JsonProperty("edhrec_rank")
	private Integer edhrecRank;
	@JsonProperty("hand_modifier")
	private String handModifier;
	private List<String> keywords;
	// private String layout; -> CardFaceObject
	private Map<String, String> legalities; // TODO enum to string
	@JsonProperty("life_modifier")
	private String lifeModifier;
	// private String loyalty; -> CardFaceObject
	// private String manaCost; -> CardFaceObject
	// private String name; -> CardFaceObject
	// private String oracle_text; -> CardFaceObject
	private Boolean oversized;
	@JsonProperty("penny_rank")
	private Integer pennyRank;
	// private String power; -> CardFaceObject
	@JsonProperty("produced_mana")
	private List<String> producedMana;
	private Boolean reserved;
	// private String toughness; -> CardFaceObject
	// private String type_line -> CardFaceObject

	// Print Fields

	// artist -> CardFaceObject
	@JsonProperty("attraction_lights")
	private List<Integer> attractionLights;
	private Boolean booster;
	@JsonProperty("border_color")
	private String borderColor;
	@JsonProperty("card_back_id")
	private UUID cardBackId;
	@JsonProperty("collector_number")
	private String collectorNumber;
	@JsonProperty("content_warning")
	private Boolean contentWarning;
	private Boolean digital;
	private List<String> finishes;
	@JsonProperty("flavor_name")
	private String flavorName;
	// flavor_text -> CardFaceObject
	@JsonProperty("frame_effects")
	private List<String> frameEffects;
	private String frame;
	@JsonProperty("full_art")
	private Boolean fullArt;
	private List<String> games;
	@JsonProperty("highres_image")
	private Boolean highresImage;
	// illustration_id -> CardFaceObject
	@JsonProperty("image_status")
	private String imageStatus;
	private Map<String, Double> prices;
	// printed_name -> CardFaceObject
	// printed_type_line -> CardFaceObject
	private Boolean promo;
	@JsonProperty("promo_types")
	private List<String> promoTypes;
	@JsonProperty("purchase_uris")
	private Map<String, String> purchaseUris;
	private String rarity;
	@JsonProperty("related_uris")
	private Map<String, String> relatedUris;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonProperty("released_at")
	private LocalDate releasedAt;
	private Boolean reprint;
	@JsonProperty("scryfall_set_uri")
	private URI scryfallSetUri;
	@JsonProperty("set_name")
	private String setName;
	@JsonProperty("set_search_uri")
	private URI setSearchUri;
	@JsonProperty("set_type")
	private String setType;
	@JsonProperty("set_uri")
	private URI setUri;
	private String set;
	@JsonProperty("set_id")
	private String setId;
	@JsonProperty("story_spotlight")
	private Boolean storySpotlight;
	private Boolean textless;
	private Boolean variation;
	@JsonProperty("variation_of")
	private UUID variationOf;
	@JsonProperty("security_stamp")
	private String securityStamp;
	// watermark -> CardFaceObject
	// preview.previewed_at -> preview
	// preview.source_uri -> preview
	// preview.source -> preview
	private Preview preview;

	@Override
	public String toString() {
		return String.format("%s - %s (%s)", getName(), getSet(), getSetName());
	}

	public List<Integer> getAttractionLights() {
		return attractionLights;
	}

	public Integer getArenaId() {
		return arenaId;
	}

	public String getLang() {
		return lang;
	}

	public Integer getMtgoFoilId() {
		return mtgoFoilId;
	}

	public List<Integer> getMultiverseIds() {
		return multiverseIds;
	}

	public Integer getTcgplayerId() {
		return tcgplayerId;
	}

	public Integer getCardmarketId() {
		return cardmarketId;
	}

	public URI getPrintsSearchUri() {
		return printsSearchUri;
	}

	public URI getRulingsUri() {
		return rulingsUri;
	}

	public URI getScryfallUri() {
		return scryfallUri;
	}

	public URI getUri() {
		return uri;
	}

	public List<RelatedCardObject> getAllParts() {
		return allParts;
	}

	public List<CardFaceObject> getCardFaces() {
		return cardFaces;
	}

	public List<String> getColorIdentity() {
		return colorIdentity;
	}

	@JsonIgnore
	public List<Color> getColorIdentityEnum() {
		if (colorIdentity == null) {
			return null;
		}
		return colorIdentity.stream().map(Color::fromValue).collect(Collectors.toList());
	}

	public Integer getEdhrecRank() {
		return edhrecRank;
	}

	public String getHandModifier() {
		return handModifier;
	}

	public Map<String, String> getLegalities() {
		return legalities;
	}

	@JsonIgnore
	public Map<Format, Legality> getLegalitiesEnum() {
		if (legalities == null) {
			return null;
		}
		Map<Format, Legality> enumMap = new HashMap<>();
		for (Entry<String, String> entry : legalities.entrySet()) {
			enumMap.put(Format.fromValue(entry.getKey()), Legality.fromValue(entry.getValue()));
		}
		return enumMap;
	}

	public String getLifeModifier() {
		return lifeModifier;
	}

	public Boolean getOversized() {
		return oversized;
	}

	public Boolean getReserved() {
		return reserved;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public Boolean getDigital() {
		return digital;
	}

	public List<String> getFrameEffects() {
		return frameEffects;
	}

	public String getFrame() {
		return frame;
	}

	public Boolean getFullArt() {
		return fullArt;
	}

	public List<String> getGames() {
		return games;
	}

	public Boolean getHighresImage() {
		return highresImage;
	}

	public String getImageStatus() {
		return imageStatus;
	}

	public Map<String, Double> getPrices() {
		return prices;
	}

	@JsonIgnore
	public Map<PriceType, Double> getPricesEnum() {
		if (prices == null) {
			return null;
		}
		Map<PriceType, Double> enumMap = new HashMap<>();
		for (Entry<String, Double> entry : prices.entrySet()) {
			enumMap.put(PriceType.fromValue(entry.getKey()), entry.getValue());
		}
		return enumMap;
	}

	public Boolean getPromo() {
		return promo;
	}

	public Map<String, String> getPurchaseUris() {
		return purchaseUris;
	}

	public String getRarity() {
		return rarity;
	}

	@JsonIgnore
	public Rarity getRarityEnum() {
		return Rarity.fromValue(rarity);
	}

	public Map<String, String> getRelatedUris() {
		return relatedUris;
	}

	public LocalDate getReleasedAt() {
		return releasedAt;
	}

	public Boolean getReprint() {
		return reprint;
	}

	public URI getScryfallSetUri() {
		return scryfallSetUri;
	}

	public String getSetId() {
		return setId;
	}

	public String getSetName() {
		return setName;
	}

	public URI getSetSearchUri() {
		return setSearchUri;
	}

	public URI getSetUri() {
		return setUri;
	}

	public Boolean getStorySpotlight() {
		return storySpotlight;
	}

	public Preview getPreview() {
		return preview;
	}

	public Boolean getBooster() {
		return booster;
	}

	public UUID getCardBackId() {
		return cardBackId;
	}

	public List<String> getPromoTypes() {
		return promoTypes;
	}

	public String getSetType() {
		return setType;
	}

	public Boolean getTextless() {
		return textless;
	}

	public Boolean getVariation() {
		return variation;
	}

	public UUID getVariationOf() {
		return variationOf;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public List<String> getProducedMana() {
		return producedMana;
	}

	@JsonIgnore
	public List<Color> getProducedManaEnum() {
		if (producedMana == null) {
			return null;
		}
		return producedMana.stream().map(Color::fromValue).collect(Collectors.toList());
	}

	public Boolean getContentWarning() {
		return contentWarning;
	}

	public List<String> getFinishes() {
		return finishes;
	}

	public String getSecurityStamp() {
		return securityStamp;
	}

	public String getCollectorNumber() {
		return collectorNumber;
	}

	public UUID getId() {
		return id;
	}

	public Integer getMtgoId() {
		return mtgoId;
	}

	public String getSet() {
		return set;
	}

	public Integer getTcgplayerEtchedId() {
		return tcgplayerEtchedId;
	}

	public Integer getPennyRank() {
		return pennyRank;
	}

	/**
	 * Use {@link #getFinishes()}
	 *
	 * @return true if there is a foil version for this card
	 */
	@Deprecated
	public Boolean getFoil() {
		return foil;
	}

	/**
	 * Use {@link #getFinishes()}
	 *
	 * @return true if there is no foil version for this card
	 */
	@Deprecated
	public Boolean getNonfoil() {
		return nonfoil;
	}

	/**
	 * Not in documentation
	 *
	 * @return the id of the artist of this card
	 */
	@Deprecated
	public List<UUID> getArtist_ids() {
		return artist_ids;
	}

}
