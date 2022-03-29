package de.rohmio.mtg.scryfall.api.model;

import java.util.List;

public class IdentifierWrapper {
	
	private List<CardIdentifier> identifiers;

	public IdentifierWrapper(List<CardIdentifier> cardIdentifiers) {
		this.identifiers = cardIdentifiers;
	}
	
	public List<CardIdentifier> getIdentifiers() {
		return identifiers;
	}

}