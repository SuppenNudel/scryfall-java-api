package de.rohmio.mtg.scryfall.api.model;

import java.net.URI;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

public class Preview {

	@JsonFormat(pattern = "yyyy-MM-dd")
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonProperty("previewed_at")
	private LocalDate previewedAt;
	@JsonProperty("source_uri")
	private String sourceUri;
	//	private URI sourceUri;
	private String source;


	public String getSource() {
		return source;
	}

	public URI getSourceUri() {
		//		return sourceUri;
		try {
			return URI.create(sourceUri);
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		}
	}

	public LocalDate getPreviewedAt() {
		return previewedAt;
	}

}
