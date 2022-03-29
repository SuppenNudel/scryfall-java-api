package de.rohmio.mtg.scryfall.api.model;

import java.util.Date;

public class Preview {
	
	private String source;
	private String source_uri;
	private Date previewed_at;
	
	public String getSource() {
		return source;
	}
	public String getSource_uri() {
		return source_uri;
	}
	public Date getPreviewed_at() {
		return previewed_at;
	}

}
