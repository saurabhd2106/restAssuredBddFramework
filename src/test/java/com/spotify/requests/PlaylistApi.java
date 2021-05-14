package com.spotify.requests;

import io.restassured.response.Response;
import restClient.RestClient;

public class PlaylistApi {

	public static Response postPlaylist(Object requestPayload) {

		return RestClient.doPostRequest("/playlists", requestPayload);

	}

	public static Response getPlaylist() {

		return RestClient.doGetRequest("/playlists");

	}
	
	public static Response updatePlaylist(String playlistId, Object requestPayload) {

		return RestClient.doPutRequest("/playlists/" + playlistId, requestPayload);

	}

}
