package de.rohmio.mtg.scryfall.api.endpoints;

import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardIdentifier;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.IdentifierWrapper;
import de.rohmio.mtg.scryfall.api.model.ListObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

/**
 * Accepts a JSON array of card identifiers, and returns a List object with the collection of requested cards. A maximum of 75 card references may be submitted per request. The request must be posted with Content-Type as application/json.
 *
 */
public class CollectionEndpoint extends AbstractEndpoint<ListObject<CardObject>> {

	private IdentifierWrapper identifiers;

	public CollectionEndpoint(List<CardIdentifier> cardIdentifiers) {
		super("/cards/collection", new GenericType<ListObject<CardObject>>() {});
		this.identifiers = new IdentifierWrapper(cardIdentifiers);
	}

	@Override
	public ListObject<CardObject> get() throws ScryfallError {
		waitIfNecessary();
		Entity<IdentifierWrapper> entity = Entity.json(identifiers);
		return handleResponse(getTarget().request(MediaType.APPLICATION_JSON).post(entity));
	}

}
