package com.spotify.stepDefinition;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import static com.spotify.specs.Specifications.*;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SpotifyPlaylistTestSteps {

	
	private RequestSpecification requestSpec;

	private Response response;

	private String playlistId;

	@Before
	public void setup() {
		baseURI = "https://api.spotify.com/v1/users/31nxcxs7cabfgs3g32odnwdvlmpu";
	}

	@Given("user is logged in to spotify account")
	public void user_is_logged_in_to_spotify_account() {

		requestSpec = given(getRequestSpecification());

	}

	@When("user creates a playlist with name Saurabh Playlist")
	public void user_creates_a_playlist_with_name_Saurabh_Playlist() {
		String requestPayload = "{\r\n" + "    \"name\" : \"Saurabh Playlist\",\r\n"
				+ "    \"description\" : \"Saurabh's fav songs playlist\",\r\n" + "    \"public\" : false\r\n" + "\r\n"
				+ "}";

		response = requestSpec.when().body(requestPayload).post("/playlists");

	}

	@Then("Playlist is created successfully")
	public void playlist_is_created_successfully() {

		response.then().spec(getResponseSpecification()).statusCode(201);

		playlistId = response.then().extract().path("id");
	}

	@When("user request for all his playlist")
	public void user_request_for_all_his_playlist() {

		response = requestSpec.when().get("/playlists");
	}

	@Then("all playlist are listed")
	public void all_playlist_are_listed() {

		response.then().spec(getResponseSpecification()).statusCode(200);

	}

	@When("user updates the above playlist to name Saurabh Fav Playlist")
	public void user_updates_the_above_playlist_to_name_Saurabh_Fav_Playlist() {

		String updatedRequestPayload = "{\r\n" + "    \"name\" : \"Saurabh fav Playlist\",\r\n"
				+ "    \"description\" : \"Saurabh fav songs playlist\",\r\n" + "    \"public\" : false\r\n" + "\r\n"
				+ "}";

		response = given(getRequestSpecification())
				.pathParam("playlist_id", playlistId).when().body(updatedRequestPayload)
				.put("/playlists/{playlist_id}");
	}

	@Then("the playlist is updated")
	public void the_playlist_is_updated() {

		response.then().spec(getResponseSpecification()).statusCode(200);
	}

}
