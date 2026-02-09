package com.automationexercise.core;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.automationexercise.utils.ConfigReader;

public class BaseTestCase 
{
	//BaseTestCase
	//Every test starts with a fresh browser and ends cleanly, while supporting cross-browser and parallel execution.
	protected WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
    public void SetupBrowser(@Optional("chrome") String browser) 
	{
        DriverManager.InitializeDriver(browser);
        driver = DriverManager.getDriver(); 
        DriverManager.getDriver().get(ConfigReader.get("url"));
    }

    @AfterMethod
    public void CloseBrowser() 
    {
    	DriverManager.quitDriver();
    }
}