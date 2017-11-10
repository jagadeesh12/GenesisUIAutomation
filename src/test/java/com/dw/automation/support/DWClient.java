package com.dw.automation.support;

import javax.ws.rs.core.Cookie;

import org.json.JSONArray;
import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;

public class DWClient {
	private static final String ENDPOINT =
			"http://dev40-rco-scholastic.demandware.net/s/rco-us/dw/shop/v16_1";
	private static final String CLIENT_ID = "53a878fd-49ca-4bce-a6e8-660c8f9aed67";
	private static final String RESOURCE = "content";
	private static final String RES_PROD = "products";

	private static Client client = Client.create();
	private static Cookie cookie;

	public static String getAsset(String id) {
		return getBuilder(RESOURCE, id).get(ClientResponse.class).getEntity(String.class);
	}

	public static String getAssetAttribute(String id, String attrName) {
		String resp = getBuilder(RESOURCE, id).get(ClientResponse.class)
				.getEntity(String.class);
		JSONObject jsonText = new JSONObject(resp);
		return jsonText.getString(attrName);
	}

	public static JSONObject getProducts(String q, int count) {
		String resp = getQueryBuilder("search_suggestion", q, String.valueOf(count))
				.get(ClientResponse.class).getEntity(String.class);
		System.out.println(resp);
		return new JSONObject(resp);
	}

	public static String getProduct(String id) {
		return getBuilder(RES_PROD, id).get(ClientResponse.class).getEntity(String.class);
	}

	private static Builder getBuilder(String forResource, String id) {
		return client.resource(ENDPOINT).path(getResourceUrl(forResource, id))
				.queryParam("client_id", CLIENT_ID).cookie(cookie);
	}
	private static Builder getQueryBuilder(String forResource, String q, String count) {
		return client.resource(ENDPOINT).path(forResource)
				.queryParam("client_id", CLIENT_ID).queryParam("q", q)
				.queryParam("count", count).cookie(cookie);
	}
	private static String getResourceUrl(String resource, String id) {
		StringBuilder sb = new StringBuilder("").append(resource).append("/" + id);
		return sb.toString();
	}

	public static String getAssetProductAttribute(String id, String attrName) {
		String resp = getBuilder(RES_PROD, id).get(ClientResponse.class)
				.getEntity(String.class);
		JSONObject jsonText = new JSONObject(resp);
		return jsonText.getString(attrName);
	}
	/**
	 * used where json value is in ["",""] format
	 * while getting value parse it to string
	 * using ".toString()"
	 * method
	 **/
	public static JSONArray getAssetProductArrayAttributes(String id, String attrName) {
		String resp = getBuilder(RES_PROD, id).get(ClientResponse.class)
				.getEntity(String.class);
		JSONObject jsonText = new JSONObject(resp);
		return jsonText.getJSONArray(attrName);
	}

}
