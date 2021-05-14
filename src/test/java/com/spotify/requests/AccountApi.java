package com.spotify.requests;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.response.Response;

public class AccountApi {

	public static Response postAccountApi(Map<String, String> formParams) {

		return given().when().formParams(formParams).post("https://accounts.spotify.com/api/token");

	}
}
