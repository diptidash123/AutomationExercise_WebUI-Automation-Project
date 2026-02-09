package com.automationexercise.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager 
{
	private static ExtentReports extent;
    public static ExtentReports getInstance() 
    
    {

        if (extent == null) 
        {

            String timestamp = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
            String reportFolder = "target/extent-report/Run_" + timestamp;
            new File(reportFolder).mkdirs();

            ExtentSparkReporter spark = new ExtentSparkReporter(reportFolder + "/SparkReport.html");
            spark.config().setReportName("Automation Execution Report");
            spark.config().setDocumentTitle("Test Report");

            extent = new ExtentReports();
            extent.attachReporter(spark);
            
            // Optional system info
            extent.setSystemInfo("Project", "AutomationExercise");
            extent.setSystemInfo("Tester", "Dipti Ranjan");
            extent.setSystemInfo("Framework", "Selenium + Java + TestNG + POM + Maven");
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            extent.setSystemInfo("OS Version", System.getProperty("os.version"));
            extent.setSystemInfo("Java Version", System.getProperty("java.version"));
            extent.setSystemInfo("User", System.getProperty("user.name"));
            extent.setSystemInfo("Browser", ConfigReader.get("browser"));


        }

        return extent;
    }
}
