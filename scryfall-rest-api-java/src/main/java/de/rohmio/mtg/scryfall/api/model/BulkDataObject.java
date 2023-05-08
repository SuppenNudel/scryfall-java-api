package de.rohmio.mtg.scryfall.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BulkDataObject extends ScryfallObject {

	private String id;
	private String uri;
	private String type;
	private String name;
	private String description;
	private String download_uri;
	//	@JsonFormat(pattern = "yyyy-MM-ddT")
	//	@JsonSerialize(using = LocalDateSerializer.class)
	//	@JsonDeserialize(using = LocalDateDeserializer.class)
	private String updated_at;
	@JsonProperty("size")
	private int size;
	private String content_type;
	private String content_encoding;

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public String getUri() {
		return uri;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getSize() {
		return size;
	}

	public String getDownload_uri() {
		return download_uri;
	}

	public String getContent_type() {
		return content_type;
	}

	public String getContent_encoding() {
		return content_encoding;
	}

}
