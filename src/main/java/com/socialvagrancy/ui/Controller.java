//===================================================================
// Controller.java
// 	Description:
// 		The controller for the StorCycle Restore Script
//===================================================================

package com.socialvagrancy.storcycle.restore.ui;

import com.socialvagrancy.storcycle.restore.util.api.StorCycle;
import com.socialvagrancy.utils.Logger;

public class Controller
{
	String dev_log_path;
	Logger log;
	StorCycle storcycle;

	public Controller(String endpoint, String port, boolean https, boolean ignore_ssl, String user, String pass)
	{
		try
		{
			dev_log_path = "/Users/seans/Desktop/log/ssc-main.log";
			log = new Logger(dev_log_path, 10240, 4, 1);
			storcycle = new StorCycle(endpoint, port, https, ignore_ssl, log);
			storcycle.login(user, pass, log);
		}
		catch(Exception e)
		{
			log.error(e.getMessage());
		}
	}


}
