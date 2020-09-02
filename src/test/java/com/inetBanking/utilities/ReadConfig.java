package com.inetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;//one object for Properties class
	
	public ReadConfig() {
		
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src); //read mode
			pro = new Properties();
			pro.load(fis); //load complete file    
		}catch(Exception e) {
			System.out.println("Exception is " + e.getMessage() );
		}
	}
	
	//reading each value
	public String getApplicationURL() 
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		String password=pro.getProperty("password");
		return password;
	}

	public String getChromePath() {
		String chromepath=pro.getProperty("chromepath");
				return chromepath;
				
	}
	public String getFirefoxPath() {
		String firefoxpath=pro.getProperty("firefoxpath");
				return firefoxpath;
				
	}
	public String getEdgePath() {
		String edgepath=pro.getProperty("edgepath");
				return edgepath;
				
	}
}
