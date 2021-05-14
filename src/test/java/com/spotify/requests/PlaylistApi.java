package com.spotify.requests;

import static com.spotify.spotifyRoutes.Routes.*;

import io.restassured.response.Response;
import restClient.RestClient;

public class PlaylistApi {

	public static Response postPlaylist(Object requestPayload) {

		return RestClient.doPostRequest(PLAYLIST, requestPayload);

	}

	public static Response getPlaylist() {

		return RestClient.doGetRequest(PLAYLIST);

	}
	
	public static Response updatePlaylist(String playlistId, Object requestPayload) {

		return RestClient.doPutRequest(PLAYLIST + "/" + playlistId, requestPayload);

	}

}
