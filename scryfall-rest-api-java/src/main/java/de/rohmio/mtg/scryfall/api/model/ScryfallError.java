package de.rohmio.mtg.scryfall.api.model;

import java.util.List;

public class ScryfallError extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4852492830619286372L;
	
	private String object;
	private String code;
	private Integer status;
	private List<String> warnings;
	private String details;
	
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

}
