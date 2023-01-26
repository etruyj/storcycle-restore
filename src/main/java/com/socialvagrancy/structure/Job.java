//===================================================================
// Job.java
// 	Description:
// 		A container class for job information.
//===================================================================

package com.socialvagrancy.storcycle.restore.structure;

public class Job
{
	public Job(String n, String s)
	{
		name = n;
		state = s;
	}

	public String getName() { return name; }
	public String getState() { return state; }
	public void setName(String n) { name = n; }
	public void setState(String s) { state = s; }

	String name;
	String state;
}
