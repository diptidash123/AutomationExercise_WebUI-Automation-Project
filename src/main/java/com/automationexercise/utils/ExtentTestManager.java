package com.automationexercise.utils;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager 
{
	   //step: 01 Make ExtentTest globally accessible (for logging from Pages)
	    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

	    public static void setTest(ExtentTest extentTest) 
	    {
	        test.set(extentTest);
	    }

	    public static ExtentTest getTest() 
	    {
	        return test.get();
	    }
}