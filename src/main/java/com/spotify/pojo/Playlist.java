package com.spotify.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Playlist {

	@JsonProperty("collaborative")
	private boolean collaborative;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("external_urls")
	private ExternalUrls external_urls;
	
	@JsonProperty("followers")
	private Followers followers;
	
	@JsonProperty("href")
	private String href;
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("images")
	private List<Object> images;
	
	 @JsonProperty("name")
	private String name;
	 
	 @JsonProperty("owner")
	private Owner owner;
	 
	 @JsonProperty("public")
	private boolean publicStatus;

	public boolean isCollaborative() {
		return collaborative;
	}

	public void setCollaborative(boolean collaborative) {
		this.collaborative = collaborative;
	}

	public Object getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ExternalUrls getExternal_urls() {
		return external_urls;
	}

	public void setExternal_urls(ExternalUrls external_urls) {
		this.external_urls = external_urls;
	}

	public Followers getFollowers() {
		return followers;
	}

	public void setFollowers(Followers followers) {
		this.followers = followers;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Object> getImages() {
		return images;
	}

	public void setImages(List<Object> images) {
		this.images = images;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public boolean isPublicStatus() {
		return publicStatus;
	}

	public void setPublicStatus(boolean publicStatus) {
		this.publicStatus = publicStatus;
	}

	public String getSnapshot_id() {
		return snapshot_id;
	}

	public void setSnapshot_id(String snapshot_id) {
		this.snapshot_id = snapshot_id;
	}

	public Tracks getTracks() {
		return tracks;
	}

	public void setTracks(Tracks tracks) {
		this.tracks = tracks;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	private String snapshot_id;
	private Tracks tracks;
	private String type;
	private String uri;

}
