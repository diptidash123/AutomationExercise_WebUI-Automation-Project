package com.automationexercise.TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationexercise.core.BaseTestCase;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.utils.ExtentTestManager;
import com.automationexercise.utils.TestReader;

public class LoginPageTest extends BaseTestCase 
{

    @Test(description = "Verify user can login with valid credentials")
    public void verifyUserLoginWithValidCredentials() 
    {

        try 
        {

            // Initialize Page Object
            LoginPage loginPage = new LoginPage(driver);

            // Fetch Test Data
            String email = TestReader.get("EmailAddress");
            String password = TestReader.get("Password");

            // Logging
            ExtentTestManager.getTest().info("Navigating to Login Page");
            loginPage.clickSignupLogin();

            ExtentTestManager.getTest().info("Entering valid credentials");
            loginPage.login(email, password);

            // Validation (Must in Real Projects)
            boolean isLoggedIn = loginPage.isUserLoggedIn();

            Assert.assertTrue(isLoggedIn, "Login failed: User not logged in");

            ExtentTestManager.getTest().pass("Login successful");

            System.out.println("Login Test Passed");

        } catch (Exception e) 
        {

            ExtentTestManager.getTest().fail("Login Test Failed: " + e.getMessage());

            Assert.fail("Exception occurred during login test", e);
        }
    }
}
