package com.automationexercise.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader 
{
	    private static Properties properties;

	    static 
	    {
	        try 
	        {
	        	properties = new Properties();
	        	properties.load(new FileInputStream("src/test/resources/config/Config_QAEnvironment.properties"));
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }

	    public static String get(String key) 
	    {
	        return properties.getProperty(key);
	    }
}