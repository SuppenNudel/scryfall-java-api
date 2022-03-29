package de.rohmio.mtg.scryfall.api.model;

import java.util.List;

public class ErrorObject {
	
	/**
	 * An integer HTTP status code for this error.
	 */
	private Integer status;
	
	/**
	 * 	A computer-friendly string representing the appropriate HTTP status code.
	 */
	private String code;
	
	/**
	 * A human-readable string explaining the error.
	 */
	private String details;

	/**
	 * Can be null or missing
	 * <br>
	 * A computer-friendly string that provides additional context for the main error. For example, an endpoint many generate HTTP 404 errors for different kinds of input. This field will provide a label for the specific kind of 404 failure, such as ambiguous.
	 */
	private String type;
	
	/**
	 * Can be null or missing
	 * <br>
	 * If your input also generated non-failure warnings, they will be provided as human-readable strings in this array.
	 */
	private List<String> warnings;
	
	public Integer getStatus() {
		return status;
	}
	public String getCode() {
		return code;
	}
	public String getDetails() {
		return details;
	}
	public String getType() {
		return type;
	}
	public List<String> getWarnings() {
		return warnings;
	}
		
}
