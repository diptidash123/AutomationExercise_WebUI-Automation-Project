package com.automationexercise.core;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager 
{
	//Driver Manager
    // Thread-safe WebDriver for parallel execution
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void InitializeDriver(String browser) 
    {

        switch (browser.toLowerCase()) 
        {
            case "firefox":
                driver.set(new FirefoxDriver());
                break;
            case "edge":
                driver.set(new EdgeDriver());
                break;
            case "safari":
                driver.set(new SafariDriver());
                break;
            default: 
            	// Chrome (Disable browser notifications)
            	ChromeOptions options = new ChromeOptions();
            	// Open in In-cognito mode
            	options.addArguments("--incognito");
            	Map<String, Object> prefs = new HashMap<>();
            	prefs.put("profile.default_content_setting_values.notifications", 2);
            	prefs.put("profile.default_content_setting_values.geolocation", 2);
            	prefs.put("profile.default_content_setting_values.media_stream", 2);
            	options.setExperimentalOption("prefs", prefs);
            	options.addArguments("--disable-extensions");
            	driver.set(new ChromeDriver(options));

        }

                getDriver().manage().window().maximize();
    }

    public static WebDriver getDriver() 
    {
        return driver.get();
    }

    public static void quitDriver() 
    {

        if (getDriver() != null) 
        {
            getDriver().quit();
            driver.remove();
        }
    }
}
