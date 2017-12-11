package com.dw.api.automation.libs;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonArray {


	public static Object parseJsonArray(String res,String data,String docs,String id)
	{
		 Object reqid=null;
		JSONObject obj = new JSONObject(res);
		JSONArray docsArray = new JSONObject(res).getJSONObject(data).getJSONArray(docs);
		JSONObject obj2 = null;

		List li = new ArrayList();
		for (Object object : docsArray) {
			obj2 = new JSONObject(object.toString());
			// System.out.println("The id is ========="+ obj2.get(id));
		}

		//System.out.println("The id is =========" + obj2.get(id));
		reqid= obj2.get(id);
      return reqid;
	}

}
