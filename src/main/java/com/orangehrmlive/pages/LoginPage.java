package com.orangehrmlive.pages;

import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement enterUsername;

    @CacheLookup
    @FindBy(name = "password")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement clickLoginButtun;


    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement verifyText;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPasswordField;

    @CacheLookup
    @FindBy(xpath = "//h6[text()='Reset Password']")
    WebElement resetPasswordText;


    public void getEnterUserName(String username) {
        Reporter.log("Enter username" + username + "to username" + username.toString());
        sendTextToElement(enterUsername, username);
    }

    public void getEnterPassword(String password) {
        Reporter.log("Enter passwaord" + password + "to password" + password.toString());
        sendTextToElement(enterPassword, password);
    }

    public void getclickOnLoginButton() {
        Reporter.log("click on login button" + clickLoginButtun.toString());
        clickOnElement(clickLoginButtun);
    }

    public String getVerifyText() {
        Reporter.log("get verify text" + verifyText.toString());
        return getTextFromElement(verifyText);
    }

    public void clickOnForgotPassword() {
        Reporter.log("click on forgot password" + forgotPasswordField.toString());
        clickOnElement(forgotPasswordField);
    }

    public String getResetPassword() {
        Reporter.log(" Reset password " + resetPasswordText.toString());
        return getTextFromElement(resetPasswordText);
    }


}