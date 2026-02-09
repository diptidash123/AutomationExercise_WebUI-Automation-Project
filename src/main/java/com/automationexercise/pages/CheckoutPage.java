package com.automationexercise.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CheckoutPage 
{
	private WebDriver driver;
    private WebDriverWait wait;

    By placeOrder = By.xpath("//a[text()='Place Order']");
    By name = By.cssSelector("input.form-control");
    By card = By.cssSelector("input.card-number");
    By cvc = By.cssSelector("input.card-cvc");
    By month = By.cssSelector("input.card-expiry-month");
    By year = By.cssSelector("input.card-expiry-year");
    By payBtn = By.cssSelector("button.submit-button");
    By success = By.xpath("//p[contains(text(),'order has been confirmed')]");
    public boolean isOrderPlacedSuccessfully() 
    {

        return driver.findElement(
            By.xpath("//p[contains(text(),'Congratulations')]")
        ).isDisplayed();
    }

    public CheckoutPage(WebDriver driver) 
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void placeOrder(String username, String cardNo, String cvcNo, String expMonth, String expYear)
    {

        wait.until(ExpectedConditions.elementToBeClickable(placeOrder)).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(name)).sendKeys(username);
        driver.findElement(card).sendKeys(cardNo);
        driver.findElement(cvc).sendKeys(cvcNo);
        driver.findElement(month).sendKeys(expMonth);
        driver.findElement(year).sendKeys(expYear);

        driver.findElement(payBtn).click();

        String successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(success)).getText();
        Assert.assertTrue(successMsg.contains("confirmed"), "Order was not confirmed!");
    }

}
