package de.rohmio.mtg.scryfall.api;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.model.BulkDataObject;
import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public class BulkDataTest {

	@Test
	public void test() throws ScryfallError {
		String type = "default_cards";
		BulkDataObject bulkDataObject = ScryfallApi.bulkData.bulkDataInfo(type).get();
		System.out.println(bulkDataObject);
	}
	@Test
	public void defaultCard() throws ScryfallError {
		String type = "oracle-cards";
		List<CardObject> bulkDataObject = ScryfallApi.bulkData.bulkData(type, false).get();
		assertNotNull(bulkDataObject);
	}

}
