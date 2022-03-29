package de.rohmio.mtg.scryfall.api.model;

public class CardIdentifierFactory {
	
	public static CardIdentifier createById(String id) {
		CardIdentifier cardIdentifier = new CardIdentifier();
		cardIdentifier.setId(id);
		return cardIdentifier;
	}

	
	public static CardIdentifier createByMtgoId(Integer mtgo_id) {
		CardIdentifier cardIdentifier = new CardIdentifier();
		cardIdentifier.setMtgo_id(mtgo_id);
		return cardIdentifier;
	}

	
	public static CardIdentifier createByMultiverseId(Integer multiverse_id) {
		CardIdentifier cardIdentifier = new CardIdentifier();
		cardIdentifier.setMultiverse_id(multiverse_id);
		return cardIdentifier;
	}

	
	public static CardIdentifier createByOracleId(String oracle_id) {
		CardIdentifier cardIdentifier = new CardIdentifier();
		cardIdentifier.setOracle_id(oracle_id);
		return cardIdentifier;
	}

	
	public static CardIdentifier createByIllustrationId(String illustration_id) {
		CardIdentifier cardIdentifier = new CardIdentifier();
		cardIdentifier.setIllustration_id(illustration_id);
		return cardIdentifier;
	}

	
	public static CardIdentifier createByName(String name) {
		CardIdentifier cardIdentifier = new CardIdentifier();
		cardIdentifier.setName(name);;
		return cardIdentifier;
	}

	
	public static CardIdentifier createByNameAndSet(String name, String set) {
		CardIdentifier cardIdentifier = new CardIdentifier();
		cardIdentifier.setName(name);
		cardIdentifier.setSet(set);
		return cardIdentifier;
	}

	
	public static CardIdentifier createByCollectorNumberAndSet(String collector_number, String set) {
		CardIdentifier cardIdentifier = new CardIdentifier();
		cardIdentifier.setCollector_number(collector_number);
		cardIdentifier.setSet(set);
		return cardIdentifier;
	}

}
