package com.automationexercise.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage 
{
	//Globally called WebDriver/WebDriverWait
	private WebDriver driver;
    private WebDriverWait wait;

    By signupLoginBtn = By.xpath("//a[contains(text(),'Signup / Login')]");
    By emailField = By.xpath("//input[@data-qa='login-email']");
    By passwordField = By.xpath("//input[@data-qa='login-password']");
    By loginBtn = By.xpath("//button[@data-qa='login-button']");
    By loggedInText = By.xpath("//a[contains(text(),'Logged in as')]");
    
    public boolean isUserLoggedIn() 
    {

        return driver.findElement(By.xpath("//a[contains(text(),'Logout')]"))
                     .isDisplayed();
    }


    public LoginPage(WebDriver driver) 
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickSignupLogin() 
    {
        driver.findElement(signupLoginBtn).click();
        wait.until(ExpectedConditions.urlContains("/login"));
        Assert.assertTrue(driver.getCurrentUrl().contains("/login"));
    }

    public void login(String email, String password)
    {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginBtn).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInText));
        Assert.assertTrue(driver.findElement(loggedInText).isDisplayed());
    }
}