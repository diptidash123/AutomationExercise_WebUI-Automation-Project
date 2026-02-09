package com.automationexercise.pages;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage 
{
	//Home page validation
	private WebDriver driver;
    private WebDriverWait wait;

    By addToCart = By.xpath("(//a[contains(@class,'add-to-cart')])[1]");
    By successMsg = By.xpath("//p[text()='Your product has been added to cart.']");
    By continueBtn = By.xpath("//button[text()='Continue Shopping']");
    By cartBtn = By.xpath("//a[@href='/view_cart']");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void addProductToCart() 
    {
        WebElement product = wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product);
        product.click();

        String msg = wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg)).getText();
        Assert.assertEquals(msg, "Your product has been added to cart.");

        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }

    public void openCart() 
    {
        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();
    }
}