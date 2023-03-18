package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "submit-form")
    public WebElement logInButton;

    @FindBy(xpath ="//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongMsg;

    @FindBy(xpath ="//a[@class='toggle-password']" )
    public WebElement eyeButton;

    @FindBy(id ="lost-password")
    public WebElement forgotPassword;

    @FindBy(id ="reset-password-submit")
    public WebElement resetPassword;
}
