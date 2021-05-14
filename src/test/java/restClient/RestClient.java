package restClient;

import static io.restassured.RestAssured.*;

import static com.spotify.specs.Specifications.*;

import io.restassured.response.Response;

public class RestClient {

	public static Response doGetRequest(String endpoint) {

		return given(getRequestSpecification()).when().get(endpoint);

	}

	public static Response doPostRequest(String endpoint, Object requestPayload) {

		return given(getRequestSpecification()).when().body(requestPayload).post(endpoint);

	}

	public static Response doPutRequest(String endpoint, Object requestPayload) {

		return given(getRequestSpecification()).when().body(requestPayload).put(endpoint);

	}

	public static Response doPatchRequest(String endpoint, Object requestPayload) {

		return given(getRequestSpecification()).when().body(requestPayload).patch(endpoint);

	}

	public static Response doDeletRequest(String endpoint) {

		return given(getRequestSpecification()).when().delete(endpoint);

	}

}
