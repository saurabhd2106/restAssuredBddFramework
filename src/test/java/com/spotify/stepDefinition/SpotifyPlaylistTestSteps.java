package com.spotify.stepDefinition;

import static com.spotify.specs.Specifications.getResponseSpecification;
import static io.restassured.RestAssured.baseURI;

import com.spotify.pojo.Playlist;
import com.spotify.requests.PlaylistApi;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class SpotifyPlaylistTestSteps {


	private Response response;

	private String playlistId;

	@Before
	public void setup() {
		baseURI = "https://api.spotify.com/v1/users/31nxcxs7cabfgs3g32odnwdvlmpu";
	}

	@Given("user is logged in to spotify account")
	public void user_is_logged_in_to_spotify_account() {

		System.out.println("User logged in...");

	}

	@When("user creates a playlist with name Saurabh Playlist")
	public void user_creates_a_playlist_with_name_Saurabh_Playlist() {

		Playlist playlist = preparePlaylistRequestPayload("GE Healthcare Playlist", "Test Playlist", false, false);

		response = PlaylistApi.postPlaylist(playlist);

	}

	@Then("Playlist is created successfully")
	public void playlist_is_created_successfully() {

		response.then().spec(getResponseSpecification()).statusCode(201);

		playlistId = response.then().extract().path("id");
	}

	@When("user request for all his playlist")
	public void user_request_for_all_his_playlist() {

		response = PlaylistApi.getPlaylist();
	}

	@Then("all playlist are listed")
	public void all_playlist_are_listed() {

		response.then().spec(getResponseSpecification()).statusCode(200);

	}

	@When("user updates the above playlist to name Saurabh Fav Playlist")
	public void user_updates_the_above_playlist_to_name_Saurabh_Fav_Playlist() {

		Playlist playlist = preparePlaylistRequestPayload("Updated Playlist", "Test Playlist", false, false);

		response = PlaylistApi.updatePlaylist(playlistId, playlist);
	}

	@Then("the playlist is updated")
	public void the_playlist_is_updated() {

		response.then().spec(getResponseSpecification()).statusCode(200);
	}

	private Playlist preparePlaylistRequestPayload(String name, String description, boolean publicStatus,
			boolean collStatus) {
		Playlist playlist = new Playlist();

		playlist.setName("GE Healthcare playlist updated");
		playlist.setPublicStatus(false);
		playlist.setDescription("Test Playlist");
		playlist.setCollaborative(false);

		return playlist;
	}

}
