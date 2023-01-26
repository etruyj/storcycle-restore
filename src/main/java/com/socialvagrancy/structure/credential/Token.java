//===================================================================
// Token.java
// 	Description:
// 		A container class for the JSON reponse from the token
// 		API call.
//===================================================================

package com.socialvagrancy.storcycle.restore.structure.credential;

public class Token
{
	String role;
	String token;
	String username;

	public String role() { return role; }
	public String token() { return token; }
	public String user() { return username; }
}
