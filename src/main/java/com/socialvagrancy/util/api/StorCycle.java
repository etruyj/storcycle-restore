//===================================================================
// StorCycle.java
// 	Description:
// 		A class holding all the StorCycle API information
//===================================================================

package com.socialvagrancy.storcycle.restore.util.api;

import com.socialvagrancy.storcycle.restore.structure.credential.Token;

import com.google.gson.Gson;
import com.socialvagrancy.utils.http.RestApi;
import com.socialvagrancy.utils.Logger;

public class StorCycle
{
	String token;
	String base_url;
	RestApi api;

	public StorCycle(String endpoint, String port, boolean https, boolean ignore_ssl, Logger log)
	{
		base_url = ApiUrls.baseURL(endpoint, port, https);
		log.info("Creating connection to " + base_url); 
		api = new RestApi(ignore_ssl);
	}

	public void getProjects(Logger log) throws Exception
	{
		try
		{
			log.info("Getting list of projects.");

			String url = base_url + ApiUrls.projectURL();

			log.info("GET: " + url);
			String json = api.get(url, token);

			System.err.println(json);

		}
		catch(Exception e)
		{
			log.error(e.getMessage());
			throw new Exception("Unable to get projects from StorCycle at " + base_url);
		}
	}

	public void login(String user, String pass, Logger log) throws Exception
	{
		try
		{
			log.info("Logging in with user: " + user);
			
			String creds = "{\"username\":\"" + user 
				+ "\" , \"password\": \"" + pass 
				+ "\" }";

			String url = base_url + ApiUrls.loginURL();
			String json = api.authenticate(url, creds);

			Gson gson = new Gson();
			Token t = gson.fromJson(json, Token.class);
			
			token = "Bearer " + t.token();
			
			log.info("Login successful.");

		}
		catch(Exception e)
		{
			log.error(e.getMessage());
		
			throw new Exception("Login failed.");
		}
	}
	
	
}
