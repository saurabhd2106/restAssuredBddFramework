package com.spotify.specs;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.with;

import static com.spotify.requests.TokenManager.*;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {

	
	public static RequestSpecification getRequestSpecification() {

		return with().contentType(ContentType.JSON).header("Authorization", "Bearer " +renewToken()).log().all();

	}

	public static ResponseSpecification getResponseSpecification() {

		return expect().log().all();

	}
}
