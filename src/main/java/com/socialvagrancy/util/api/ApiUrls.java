//===================================================================
// ApiUrls.java
// 	Description:
// 		A list of all the API commands for StorCycle
//===================================================================

package com.socialvagrancy.storcycle.restore.util.api;

public class ApiUrls
{
	public static String baseURL(String endpoint, String port, boolean https)
	{
		String url;

		if(https)
		{
			url = "https://";
		}
		else
		{
			url = "http://";
		}
	
		return url + endpoint + ":" + port + "/";
	}
	public static String loginURL()	{	return "openapi/tokens"; }
	public static String manifestURL() {	return "api/manifests"; } 
	public static String projectURL() { 	return "openapi/projects"; }
	public static String restoreURL(String project) { return "openapi/projects/restore/" + project; }
}
