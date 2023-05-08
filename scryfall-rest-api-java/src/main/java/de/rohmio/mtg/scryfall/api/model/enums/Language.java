package de.rohmio.mtg.scryfall.api.model.enums;

public final class Language {

	public static final Language ENGLISH	= new Language("en", "en");
	public static final Language SPANISH	= new Language("es", "sp");
	public static final Language FRENCH		= new Language("fr", "fr");
	public static final Language GERMAN		= new Language("de", "de");
	public static final Language ITALIAN	= new Language("it", "it");
	public static final Language PORTUGUESE	= new Language("pt", "pt");
	public static final Language JAPANESE	= new Language("ja", "jp");
	public static final Language KOREAN		= new Language("ko", "kr");
	public static final Language RUSSION	= new Language("ru", "ru");
	public static final Language SIMPLIFIED_CHINESE  = new Language("zhs", "cs");
	public static final Language TRADITIONAL_CHINESE = new Language("zht", "ct");
	public static final Language HEBREW			= new Language("he", null);
	public static final Language LATIN			= new Language("la", null);
	public static final Language ANCIENT_GREEK	= new Language("grc", null);
	public static final Language ARABIC			= new Language("ar", null);
	public static final Language SANSKRIT		= new Language("sa", null);
	public static final Language PHYREXIAN		= new Language("ph", "ph");

	private String code;
	private String printedCode;

	private Language(String code, String printedCode) {
		this.code = code;
		this.printedCode = printedCode;
	}

	public String getCode() {
		return code;
	}
	public String getPrintedCode() {
		return printedCode;
	}

}
