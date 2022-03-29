package de.rohmio.mtg.scryfall.api.model;

public class PriceObject {

	private Double usd;
	private Double usd_foil;
	private Double eur;
	private Double eur_foil;
	private Double tix;
	private Double usd_etched;

	@Override
	public String toString() {
		return String.format("usd: %.2f; usd_foil: %.2f; eur: %.2f; tix: %.2f", usd, usd_foil, eur, tix);
	}

	public Double getUsd() {
		return usd;
	}
	public Double getUsd_foil() {
		return usd_foil;
	}
	public Double getEur() {
		return eur;
	}
	public Double getEur_foil() {
		return eur_foil;
	}
	public Double getTix() {
		return tix;
	}
	public Double getUsd_etched() {
		return usd_etched;
	}

}
