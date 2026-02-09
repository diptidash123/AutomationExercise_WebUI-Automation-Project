package com.automationexercise.utils;

import org.testng.ITestResult;

public class RetryAnalyzer 
{

	private int count = 0;
    private static final int maxRetry = 2;

    public boolean RetryMethod(ITestResult result) 
    {
        if (count < maxRetry) 
        {
            count++;
            return true;
        }
        
        return false;
    }
}