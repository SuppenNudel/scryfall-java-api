package de.rohmio.mtg.scryfall.api.endpoints;

import de.rohmio.mtg.scryfall.api.endpoints.factories.AbstractEndpoint;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ErrorObject;

/**
 * Supported formats: <code>json</code>, <code>text</code>, <code>image</code>
 * <br>
 * Returns a Card based on a name search string. This method is designed for building
 * chat bots, forum bots, and other services that need card details quickly.
 * <br>
 * If you provide the <code>exact</code> parameter, a card with that exact name is returned.
 * Otherwise, a 404 {@link ErrorObject} is returned because no card matches.
 * <br>
 * If you provide the <code>fuzzy</code> parameter and a card name matches that string, then that card is returned. If not, a fuzzy search is executed for your card name. The server allows misspellings and partial words to be provided. For example: jac bele will match Jace Beleren.
 * <br>
 * When fuzzy searching, a card is returned if the server is confident that you unambiguously identified a unique name with your string. Otherwise, you will receive a 404 Error object describing the problem: either more than 1 one card matched your search, or zero cards matched.
 * <br>
 * You may also provide a set code in the set parameter, in which case the name search and the returned card print will be limited to the specified set.
 * <br>
 * For both exact and fuzzy, card names are case-insensitive and punctuation is optional (you can drop apostrophes and periods etc). For example: fIReBALL is the same as Fireball and smugglers copter is the same as Smuggler's Copter.
 *
 */
public class NamedEndpoint extends AbstractEndpoint<CardObject> {

	/**
	 * 
	 * 
	 * @param cardName
	 * @param fuzzy If false: The exact card name to search for, case insenstive. If true: A fuzzy card name to search for.
	 */
	public NamedEndpoint(String cardName, boolean fuzzy) {
		super("/cards/named", CardObject.class);
		if(fuzzy) {
			setQueryParam("fuzzy", cardName);
		} else {
			setQueryParam("exact", cardName);
		}
	}

	/**
	 * @param setCode A set code to limit the search to one set.
	 */
	public NamedEndpoint set(String setCode) {
		setQueryParam("set", setCode);
		return this;
	}
	
	/**
	 * @param format The data format to return: json, text, or image. Defaults to json.
	 */
//	public NamedEndpoint format(String format) {
//		target = target.queryParam("format", format);
//		return this;
//	}
	
	/**
	 * @param face If using the image format and this parameter has the value back, the back face of the card will be returned. Will return a 422 if this card has no back face.
	 */
//	public NamedEndpoint face(String face) {
//		target = target.queryParam("face", face);
//		return this;
//	}
	
	/**
	 * @param version The image version to return when using the image format: small, normal, large, png, art_crop, or border_crop. Defaults to large.
	 */
//	public NamedEndpoint version(ImageType version) {
//		target = target.queryParam("version", version);
//		return this;
//	}
	
	/**
	 * @param pretty If true, the returned JSON will be prettified. Avoid using for production code.
	 */
//	public NamedEndpoint pretty(boolean pretty) {
//		target = target.queryParam("pretty", pretty);
//		return this;
//	}
	
}
