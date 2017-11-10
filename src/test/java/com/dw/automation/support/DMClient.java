package com.dw.automation.support;

import javax.ws.rs.core.Cookie;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class DMClient {
	private final String ENDPOINT =
			"http://nonprod.api.scholastic.com:80/qa1/app/iam-svcs/1.0";
	private final String RESOURCE = "users";

	private final String TOKEN = "Bearer QX507NurAlNremIGU6SjoeHPQ9oa";
	private final Client client = Client.create();

	private Cookie cookie;

	public DMClient() {
	}

	public String getUser(String email) {
		return client.resource(ENDPOINT).path(RESOURCE).queryParam("email", email)
				.header("Authorization", TOKEN).cookie(cookie).get(ClientResponse.class)
				.getEntity(String.class);
	}
}
