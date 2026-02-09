package com.automationexercise.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage 
{
	    private WebDriver driver;
	    private WebDriverWait wait;

	    By checkoutBtn = By.xpath("//a[text()='Proceed To Checkout']");

	    public CartPage(WebDriver driver) 
	    {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }

	    public void proceedToCheckout() 
	    {
	        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
	    }

}