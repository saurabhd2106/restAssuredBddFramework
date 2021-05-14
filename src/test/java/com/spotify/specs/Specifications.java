package com.spotify.specs;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.with;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {

	private static String access_token = "Bearer BQBpPspKyIIDy-0ph16lyUlMbHML4Plmye4ZSCQfPMwbo7u2SZCzBlaCXs4wZVCGwd-69ZgNGbEHhBqf11b_pXHOMk0yexTnXqiemrSNnv3iyUvSKUP8SKjTSwZWN_v1d5hZJybDpYbdgPRDbR85NEDQQPRTxf-JrWU8TyQ5maJdv2Cl90AP509Bv9QvYuoJQhFSb2hLpEypI-YvKdRDwTBZhdGcyU5fuMH1fvSOCsc-CmrH";

	public static RequestSpecification getRequestSpecification() {

		return with().contentType(ContentType.JSON).header("Authorization", access_token).log().all();

	}

	public static ResponseSpecification getResponseSpecification() {

		return expect().log().all();

	}
}
