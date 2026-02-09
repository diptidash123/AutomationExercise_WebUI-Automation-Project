package com.automationexercise.TestScript;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase 
{
	WebDriver driver;

	@Test
	public void TC_01()
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
		WebElement Login=driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));
		EmailAddress.sendKeys("diptiranjandasdipti@gmail.com");
		Password.sendKeys("mac1998@");
		Login.click();
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
	    //scroll page
	    JavascriptExecutor executor=(JavascriptExecutor)driver;
	    executor.executeScript("window.scrollBy(0,500)");
	    
	    String ProductName=driver.findElement(By.xpath("((//div[@class=\"col-sm-4\"])[2]//p)[1]")).getText();
	    System.out.println("The product name is: " + ProductName);
	    
	    //add to cart
	    driver.findElement(By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[1]")).click();
	    try 
	    {
			Thread.sleep(5000);
		} 
	    catch (InterruptedException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String notificationPopupmessageActual=driver.findElement(By.xpath("(//div[@class=\"modal-content\"]//div)[3]//p[.='Your product has been added to cart.']")).getText();
	    String notificationPopupmessageExpected="Your product has been added to cart.";
	    if(notificationPopupmessageActual.equals(notificationPopupmessageExpected))
	    {
	    	System.out.println("The product add to cart is success");
	    }
	    else
	    {
	    	System.out.println("The product add to cart is not success");
	    }
	    driver.findElement(By.xpath("//button[.=\"Continue Shopping\"]")).click();
	    try 
	    {
			Thread.sleep(5000);
		} 
	    catch (InterruptedException e) 
	    {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    executor.executeScript("window.scrollTo(0,0)");
	    driver.findElement(By.xpath("(//a[@href=\"/view_cart\"])[1]")).click();
	    driver.findElement(By.xpath("//a[text()=\"Proceed To Checkout\"]")).click();
	    executor.executeScript("window.scrollBy(0,800)");
	    driver.findElement(By.xpath("//a[text()=\"Place Order\"]")).click();
	    driver.findElement(By.cssSelector("input[class=\"form-control\"]")).sendKeys("Dipti Ranjan");
	    driver.findElement(By.cssSelector("input[class=\"form-control card-number\"]")).sendKeys("123459");
	    driver.findElement(By.cssSelector("input[class=\"form-control card-cvc\"]")).sendKeys("123");
	    driver.findElement(By.cssSelector("input[class=\"form-control card-expiry-month\"]")).sendKeys("09");
	    driver.findElement(By.cssSelector("input[class=\"form-control card-expiry-year\"]")).sendKeys("2039");
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.cssSelector("button[class=\"form-control btn btn-primary submit-button\"]")).click();
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String OrderPlaced=driver.findElement(By.xpath("//p[text()=\"Congratulations! Your order has been confirmed!\"]")).getText();
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(OrderPlaced);
	    driver.close();
}
}