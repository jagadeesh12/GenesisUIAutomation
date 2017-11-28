package com.dw.api.automation.libs;

import java.util.HashMap;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.NewCookie;

import org.json.JSONArray;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Get {

	//Get Api Request with json response
	
	 public ClientResponse getRestServiceMethod(String geturl, NewCookie newCookie){
		 ClientResponse response = null;
		 try {
         	
         	
             Client client = Client.create();
             WebResource webResource = client
                .resource(geturl);
                          response = webResource.accept("application/json")
                     .type("application/json")
                     .header("Content-Type", "application/json;charset=UTF-8")
                     .cookie(newCookie)
                     .get(ClientResponse.class);
            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
              + response.getStatus());
           }
             String output = response.getEntity(String.class);
             System.out.println("Output from Server .... \n");
             System.out.println(output);
             
             
             
             System.out.println(response.getStatus());
             System.out.println(response.getHeaders().toString());
             System.out.println("*****************From Get Client  Class **************");
           } catch (Exception e) {
             System.out.println("Exception at get jersey " +e.getMessage());;
           }
                  return response;
         
         
         }
 
	
}
