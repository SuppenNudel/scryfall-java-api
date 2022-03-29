package de.rohmio.mtg.scryfall.api.endpoints.factories;

import de.rohmio.mtg.scryfall.api.endpoints.SetsCodeEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.SetsEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.SetsIdEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.SetsTcgPlayerIdEndpoint;

public final class SetsEndpointFactory {

	/**
	 * Returns a List object of all Sets on Scryfall.
	 * @return
	 */
	public SetsEndpoint sets() {
		return new SetsEndpoint();
	}
	
	/**
	 * 
	 * @param setCode The three to five-letter set code.
	 * @return Returns a Set with the given set code. The code can be either the code or the mtgo_code for the set.
	 */
	public SetsCodeEndpoint setByCode(String setCode) {
		return new SetsCodeEndpoint(setCode);
	}
	
	/**
	 * 
	 * @param id The tcgplayer_id or groupId.
	 * @return Returns a Set with the given tcgplayer_id, also known as the groupId on TCGplayer�s API.
	 */
	public SetsTcgPlayerIdEndpoint setByTcgPlayerId(String id) {
		return new SetsTcgPlayerIdEndpoint(id);
	}
	
	/**
	 * 
	 * @param id The Scryfall ID.
	 * @return Returns a Set with the given Scryfall id.
	 */
	public SetsIdEndpoint setById(String id) {
		return new SetsIdEndpoint(id);
	}

}
