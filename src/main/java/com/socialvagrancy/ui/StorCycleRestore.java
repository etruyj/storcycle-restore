//===================================================================
// StorCycleRestore.java
// 	Description:
// 		This is a script that automates a full restore of all
// 		archived StorCycle projects.
//===================================================================

package com.socialvagrancy.storcycle.restore.ui;

public class StorCycleRestore
{

	public static void main(String[] args)
	{
		ArgParser aparser = new ArgParser();
		aparser.parse(args);

		if(aparser.checkValidInputs())
		{
			Controller control = new Controller(aparser.getIP(), aparser.getPort(), true, aparser.getBooleanFlag(), aparser.getUsername(), aparser.getPassword());

			switch (aparser.getCommand())
			{
				case "restore-all":
					System.err.println("Command successful");
					break;
			}
		}
	}
}
