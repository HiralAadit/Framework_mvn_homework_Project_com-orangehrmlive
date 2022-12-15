package com.orangehrmlive.testsuite;

import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){loginPage=new LoginPage();}
    @Test(groups = {"smoke","regression"})
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.getEnterUserName("Admin");
        loginPage.getEnterPassword("admin123");
        loginPage.getclickOnLoginButton();
        String expectedText = "Dashboard";
        Assert.assertEquals(loginPage.getVerifyText(), expectedText, "Test not displayed");
    }
        @Test(groups = {"sanity","regrassion"})
        public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        loginPage.clickOnForgotPassword();
        String expectedText = "Reset Password";
        Assert.assertEquals(loginPage.getResetPassword(),expectedText,"message not displayed");

    }
}
