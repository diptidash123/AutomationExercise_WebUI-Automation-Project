package com.automationexercise.Login;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_TestCase6
{
	//Press Enter key instead of clicking Login
	WebDriver driver;

	@Test
	public void TC_06()
	{
		System.setProperty("webdriver.chrome.driver", 
		"/Users/diptiranjandash/eclipse-workspace/com.automationexercise/Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		WebElement SinUp_LoginButton=driver.findElement(By.xpath("//div[@class=\"col-sm-8\"]//div//ul//li[4]"));
		SinUp_LoginButton.click();
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ActualURL=driver.getCurrentUrl();
		String ExpectedURL="https://www.automationexercise.com/login";
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("URL validated successfully");
		}
		else
		{
			System.out.println("URL Not - validated successfully");
		}
		WebElement EmailAddress=driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));
		WebElement Password=driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));
		//WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
		EmailAddress.sendKeys("diptiranjandasdipti@gmail.com");
		Password.sendKeys("mac1998@");
		
		//Actions class use for enter operation 
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		
		/*String ErrorMessage_origional=driver.findElement(By.xpath("//p[.=\"Your email or password is incorrect!\"]")).getText();
		String ErrorMessage_expected="Your email or password is incorrect!";
		if(ErrorMessage_origional.equals(ErrorMessage_expected))
		{
			System.out.println("The email address cannot accepts UPPERCASE AS EMAIL STRING - Error");
		}
		else
		{
			System.out.println("The email address accepts UPPERCASE AS EMAIL STRING - No Error");
		}*/
		try 
		{
			Thread.sleep(7000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String LoggedIn=driver.findElement(By.xpath("//div[@class=\"shop-menu pull-right\"]//ul//li[10]//a")).getText();
	    System.out.println("User logged successfully Dipti Ranjan: " + LoggedIn);
	    driver.close();
	}
}