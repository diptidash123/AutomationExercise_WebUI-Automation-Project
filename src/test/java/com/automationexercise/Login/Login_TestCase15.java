package com.automationexercise.Login;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_TestCase15 
{
	//Invalid password
	WebDriver driver;
	
	@Test
	public void TC_07()
	{
		//Leading/trailing spaces
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
				WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
				//2.Leading/trailing spaces
				EmailAddress.sendKeys("@#$%aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@example.com ");
				Password.sendKeys("#$$$$aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@example.com ");
				Login.click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String message = EmailAddress.getAttribute("validationMessage");
				System.out.println("The tooltip message is : " + message);
				AssertJUnit.assertEquals(message, "Please enter a part followed by '@'. '@#$%aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa@example.com' is incomplete.");//TRUE
				driver.close();

	}

}