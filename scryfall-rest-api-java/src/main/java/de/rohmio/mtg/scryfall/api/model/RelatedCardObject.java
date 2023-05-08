package de.rohmio.mtg.scryfall.api.model;

import java.net.URI;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RelatedCardObject extends ScryfallObject {

	private UUID id;
	// private String object; -> ScryfallObject
	private String component;
	private String name;
	@JsonProperty("type_line")
	private String typeLine;
	private URI uri;

	public UUID getId() {
		return id;
	}
	public String getComponent() {
		return component;
	}
	public String getName() {
		return name;
	}
	public String getTypeLine() {
		return typeLine;
	}
	public URI getUri() {
		return uri;
	}

}
