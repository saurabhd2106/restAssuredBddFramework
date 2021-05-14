package com.spotify.specs;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.with;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {

	private static String access_token = "Bearer BQAeqt506W03VomEl4VjmWykkrZAGM9UWZS6fh7bLmeJqwJe29fy73chid4BFu493pcbdhedA_5hMF8TFVZSyTYVUYYq4FV2MXUVyfc6U2F2zWfblRNS3v_XbeFkmtHWwW2lUi0MN2-s2q43PEsI6OIFGpOzIIThG6NQgjwNBH9c9zOf_iYcXirvQ74VaugEqnjb2n0SV0sYVrc19XH4Dqeui3J-_b02Ch4J3JONouPOEMUt";

	public static RequestSpecification getRequestSpecification() {

		return with().contentType(ContentType.JSON).header("Authorization", access_token).log().all();

	}

	public static ResponseSpecification getResponseSpecification() {

		return expect().log().all();

	}
}
