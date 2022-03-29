package de.rohmio.mtg.scryfall.api.model;

import java.net.URI;

import de.rohmio.mtg.scryfall.api.model.enums.ComponentType;

public class RelatedCardObject extends ScryfallObject {
	
	private String id;
	private ComponentType component;
	private String name;
	private String type_line;
	private URI uri;
	
	public String getId() {
		return id;
	}
	public ComponentType getComponent() {
		return component;
	}
	public String getName() {
		return name;
	}
	public String getType_line() {
		return type_line;
	}
	public URI getUri() {
		return uri;
	}

}
