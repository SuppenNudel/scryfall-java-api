package de.rohmio.mtg.scryfall.api.model;

import java.net.URI;
import java.util.Date;

import de.rohmio.mtg.scryfall.api.model.enums.SetType;

public class SetObject extends ScryfallObject {
	
	private String id;
	private String code;
	private String mtgo_code;
	private String arena_code;
	private Integer tcgplayer_id;
	private String name;
	private SetType set_type;
	private Date released_at;
	private String block_code;
	private String block;
	private String parent_set_code;
	private Integer card_count;
	private Boolean digital;
	private Boolean foil_only;
	private Boolean nonfoil_only;
	private URI scryfall_uri;
	private URI uri;
	private URI icon_svg_uri;
	private URI search_uri;
	
	public String getId() {
		return id;
	}
	public String getCode() {
		return code;
	}
	public String getMtgo_code() {
		return mtgo_code;
	}
	public String getArena_code() {
		return arena_code;
	}
	public Integer getTcgplayer_id() {
		return tcgplayer_id;
	}
	public String getName() {
		return name;
	}
	public SetType getSet_type() {
		return set_type;
	}
	public Date getReleased_at() {
		return released_at;
	}
	public String getBlock_code() {
		return block_code;
	}
	public String getBlock() {
		return block;
	}
	public String getParent_set_code() {
		return parent_set_code;
	}
	public Integer getCard_count() {
		return card_count;
	}
	public Boolean getDigital() {
		return digital;
	}
	public Boolean getFoil_only() {
		return foil_only;
	}
	public Boolean getNonfoil_only() {
		return nonfoil_only;
	}
	public URI getScryfall_uri() {
		return scryfall_uri;
	}
	public URI getUri() {
		return uri;
	}
	public URI getIcon_svg_uri() {
		return icon_svg_uri;
	}
	public URI getSearch_uri() {
		return search_uri;
	}

}
