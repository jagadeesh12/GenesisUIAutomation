package com.dw.automation.support;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class DataClient {
	private final String ENDPOINT = "http://10.45.150.101:8080/tdm/dw";
	private final String RESOURCE = "profile";
	private final Client client = Client.create();

	public DataClient() {
	}

	public UserProfile getProfile(String type) {
		try {
			return new ResponseParser(client.resource(ENDPOINT).path(RESOURCE + "/user")
					.queryParam("type", type).get(ClientResponse.class)
					.getEntity(String.class)).getProfile();
		} catch (Exception e) {
			return null;
		}

	}
}
