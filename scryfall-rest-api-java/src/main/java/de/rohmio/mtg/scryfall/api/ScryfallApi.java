package de.rohmio.mtg.scryfall.api;

import java.util.logging.Level;
import java.util.logging.Logger;

import de.rohmio.mtg.scryfall.api.endpoints.factories.BulkDataEndpointFactory;
import de.rohmio.mtg.scryfall.api.endpoints.factories.CardsEndpointFactory;
import de.rohmio.mtg.scryfall.api.endpoints.factories.CatalogsEndpointFactory;
import de.rohmio.mtg.scryfall.api.endpoints.factories.SetsEndpointFactory;
import de.rohmio.mtg.scryfall.api.endpoints.factories.SymbologyEndpointFactory;

public abstract class ScryfallApi {

	public static final long SCRYFALL_RATE_LIMIT = 100; // 50 to 100 milliseconds

	public static void setLogLevel(Level logLevel) {
		Logger.getGlobal().setLevel(logLevel);
	}

	public static final SetsEndpointFactory sets = new SetsEndpointFactory();
	public static final CardsEndpointFactory cards = new CardsEndpointFactory();
	public static final CatalogsEndpointFactory catalogs = new CatalogsEndpointFactory();
	public static final SymbologyEndpointFactory symbology = new SymbologyEndpointFactory();
	public static final BulkDataEndpointFactory bulkData = new BulkDataEndpointFactory();

}
