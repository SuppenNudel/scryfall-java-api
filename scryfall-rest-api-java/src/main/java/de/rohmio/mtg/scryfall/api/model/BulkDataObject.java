package de.rohmio.mtg.scryfall.api.model;

public class BulkDataObject extends ScryfallObject {

	private String id;
	private String type;
	private String updated_at;
	private String uri;
	private String name;
	private String description;
	private int compressed_size;
	private String download_uri;
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

	public int getCompressed_size() {
		return compressed_size;
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
