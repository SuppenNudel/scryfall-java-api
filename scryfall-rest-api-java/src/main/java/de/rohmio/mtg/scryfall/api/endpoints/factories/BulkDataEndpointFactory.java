package de.rohmio.mtg.scryfall.api.endpoints.factories;

import de.rohmio.mtg.scryfall.api.endpoints.BulkDataEndpoint;
import de.rohmio.mtg.scryfall.api.endpoints.BulkDataInfoEndpoint;

public final class BulkDataEndpointFactory {

	public enum Type {
		ORACLE_CARDS("oracle_cards"),
		UNIQUE_ARTWORK("unique_artwork"),
		DEFAULT_CARDS("default_cards"),
		ALL_CARDS("all_cards"),
		RULINGS("rulings");

		private String type;

		private Type(String type) {
			this.type = type;
		}
		public String getType() {
			return type;
		}
	}

	public BulkDataEndpointFactory() {}

	public BulkDataInfoEndpoint bulkDataInfo(String idOrType) {
		return new BulkDataInfoEndpoint(idOrType);
	}
	public BulkDataInfoEndpoint bulkDataInfo(Type type) {
		return bulkDataInfo(type.getType());
	}

	public BulkDataEndpoint bulkData(String idOrType, boolean forceUseOfCache) {
		return new BulkDataEndpoint(idOrType, forceUseOfCache);
	}

	public BulkDataEndpoint bulkData(Type type, boolean forceUseOfCache) {
		return bulkData(type.getType(), forceUseOfCache);
	}

}
