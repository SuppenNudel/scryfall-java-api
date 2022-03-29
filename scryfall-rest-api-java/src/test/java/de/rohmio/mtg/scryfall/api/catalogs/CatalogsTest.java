package de.rohmio.mtg.scryfall.api.catalogs;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.ScryfallApi;
import de.rohmio.mtg.scryfall.api.model.CatalogObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;
import de.rohmio.mtg.scryfall.api.model.enums.CatalogType;

public class CatalogsTest {
	
	@Test
	public void request() throws ScryfallError {
		for(CatalogType catalog : CatalogType.values()) {
			CatalogObject catalogObject = ScryfallApi.catalogs.catalog(catalog).get();
			assertNotNull(catalogObject);
			if(catalog == CatalogType.CARD_NAMES) {
				assertTrue(catalogObject.getData().contains("Lightning Bolt"));
			}
		}
	}

}
