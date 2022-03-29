package de.rohmio.mtg.scryfall.api.model;

public class CardIdentifier extends ScryfallObject {

	/**
	 * UUID - Finds a card with the specified Scryfall id.
	 */
	private String id;

	/**
	 * Finds a card with the specified mtgo_id or mtgo_foil_id.
	 */
	private Integer mtgo_id;

	/**
	 * Finds a card with the specified value among its multiverse_ids.
	 */
	private Integer multiverse_id;

	/**
	 * Finds the newest edition of cards with the specified oracle_id.
	 */
	private String oracle_id;

	/*
	 * Finds the preferred scans of cards with the specified illustration_id.
	 */
	private String illustration_id;

	/**
	 * Finds the newest edition of a card with the specified name.
	 */
	private String name;

	/**
	 * Finds a card matching the specified name and set.
	 */
	private String set;

	/**
	 * Finds a card with the specified collector_number and set. Note that collector numbers are strings.
	 */
	private String collector_number;

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CardIdentifier) {
			CardIdentifier other = (CardIdentifier) obj;
			if(other.id.equals(this.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return String.format("%s - (%s)", name, set);
	}

	public String getId() {
		return id;
	}
	public Integer getMtgo_id() {
		return mtgo_id;
	}
	public Integer getMultiverse_id() {
		return multiverse_id;
	}
	public String getOracle_id() {
		return oracle_id;
	}
	public String getIllustration_id() {
		return illustration_id;
	}
	public String getName() {
		return name;
	}
	public String getSet() {
		return set;
	}
	public String getCollector_number() {
		return collector_number;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMtgo_id(Integer mtgo_id) {
		this.mtgo_id = mtgo_id;
	}

	public void setMultiverse_id(Integer multiverse_id) {
		this.multiverse_id = multiverse_id;
	}

	public void setOracle_id(String oracle_id) {
		this.oracle_id = oracle_id;
	}

	public void setIllustration_id(String illustration_id) {
		this.illustration_id = illustration_id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSet(String set) {
		this.set = set;
	}

	public void setCollector_number(String collector_number) {
		this.collector_number = collector_number;
	}

}
