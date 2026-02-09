package com.automationexercise.TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationexercise.core.BaseTestCase;
import com.automationexercise.pages.CartPage;
import com.automationexercise.pages.CheckoutPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;

public class AddToCartTest extends BaseTestCase 
{

    @Test(description = "Verify user can add product to cart and place order successfully")
    public void verifyAddToCartAndCheckoutFlow() 
    {

        try 
        {

            // Initialize Page Objects
            LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);
            CartPage cartPage = new CartPage(driver);
            CheckoutPage checkoutPage = new CheckoutPage(driver);

            // Login
            loginPage.clickSignupLogin();
            loginPage.login("diptiranjandasdipti@gmail.com", "mac1998@");

            // Validate Login
            Assert.assertTrue(loginPage.isUserLoggedIn(),"Login failed: User not logged in");

            // Add Product
            homePage.addProductToCart();
            homePage.openCart();

            // Checkout
            cartPage.proceedToCheckout();

            // Place Order
            checkoutPage.placeOrder("Dipti","1998","233","12","1998");

            // Validate Order
            Assert.assertTrue(checkoutPage.isOrderPlacedSuccessfully(),"Order was not placed successfully");

        } 
        catch (Exception e) 
        {

            Assert.fail("Test failed due to exception: " + e.getMessage(), e);
        }
    }
}