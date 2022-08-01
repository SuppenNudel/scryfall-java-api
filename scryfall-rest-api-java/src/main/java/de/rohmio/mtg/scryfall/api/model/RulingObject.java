package de.rohmio.mtg.scryfall.api.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class RulingObject extends ScryfallObject {

	private String source;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate published_at;
	private String comment;
	private String oracle_id;

	public String getSource() {
		return source;
	}

	public LocalDate getPublished_at() {
		return published_at;
	}

	public String getComment() {
		return comment;
	}

	public String getOracle_id() {
		return oracle_id;
	}

}
