package de.rohmio.mtg.scryfall.api.model;

import java.util.List;

public class ScryfallError extends RuntimeException {

	private static final long serialVersionUID = -4852492830619286372L;

	private String object;

	private Integer status;
	private String code;
	private String details;
	private String type;
	private List<String> warnings;

	@Override
	public String getMessage() {
		return getDetails();
	}

	@Override
	public String toString() {
		return String.format("%s %s - %s%s", status, code, details, warnings == null ? "" : ": "+warnings);
	}

	public String getObject() {
		return object;
	}
	public String getCode() {
		return code;
	}
	public Integer getStatus() {
		return status;
	}
	public List<String> getWarnings() {
		return warnings;
	}
	public String getDetails() {
		return details;
	}
	public String getType() {
		return type;
	}

}
