package com.spotify.requests;

import java.util.HashMap;

import io.restassured.response.Response;
import utils.ConfigLoader;

public class TokenManager {
	
	public static String renewToken() {
		
		HashMap<String, String> formParams = new HashMap();
		
		formParams.put("client_id", ConfigLoader.getInstance().getClientId());
		formParams.put("client_secret", ConfigLoader.getInstance().getClientSecret());
		formParams.put("refresh_token", ConfigLoader.getInstance().getRefreshToken());
		formParams.put("grant_type", ConfigLoader.getInstance().getGrantType());
		
		Response response = AccountApi.postAccountApi(formParams);
		
		if(response.statusCode() !=200 ) {
			throw new RuntimeException("Failed to get the access token");
		}
		
		return response.then().extract().path("access_token");
	}

}
