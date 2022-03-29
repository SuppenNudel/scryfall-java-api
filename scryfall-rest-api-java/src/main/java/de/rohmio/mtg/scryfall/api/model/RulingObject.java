package de.rohmio.mtg.scryfall.api.model;

import java.util.Date;

public class RulingObject extends ScryfallObject {
	
	private String source;
	private Date published_at;
	private String comment;
	private String oracle_id;
	
	public String getSource() {
		return source;
	}
	public Date getPublished_at() {
		return published_at;
	}
	public String getComment() {
		return comment;
	}
	public String getOracle_id() {
		return oracle_id;
	}

}
