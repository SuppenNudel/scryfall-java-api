package de.rohmio.mtg.scryfall.api;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import de.rohmio.mtg.scryfall.api.model.CardObject;
import de.rohmio.mtg.scryfall.api.model.ScryfallError;

public class PenetrationTest {

	@Test
	public void penetrationTest() throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		System.out.println("Start: "+LocalDateTime.now());
		for(int i=0; i<100; ++i) {
			executor.execute(this::callScryfall);
		}
		executor.shutdown();
		executor.awaitTermination(10, TimeUnit.MINUTES);
	}

	private void callScryfall() {
		try {
			CardObject cardObject = ScryfallApi.cards.random().get();
			System.out.println("Result: "+cardObject);
		} catch (ScryfallError e) {
			e.printStackTrace();
		}
	}

}
