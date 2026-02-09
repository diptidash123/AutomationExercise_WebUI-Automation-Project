package com.automationexercise.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.automationexercise.core.DriverManager;

public class ScreenshotUtil 
{
	// One folder per execution run
    private static final String RUN_FOLDER;

    static 
    {
        String timestamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
        RUN_FOLDER = "target/screenshots/Run_" + timestamp;

        // Create folder at the start
        new File(RUN_FOLDER).mkdirs();
    }

    public static String takeScreenshot(String testName) 
    {

        try 
        {
            String time = new SimpleDateFormat("HHmmss").format(new Date());

            File src = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);

            String path = RUN_FOLDER + "/" + testName + "_" + time + ".png";

            FileUtils.copyFile(src, new File(path));

            return path;

        } 
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

}