package com.project.pages;

import com.project.utilites.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //@FindBy(xpath = "//input[@id='user']")
   // public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(xpath = "//input[@name='user']")
    public WebElement usernameInput;

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



//    @FindBy(id = "user")
//    public WebElement userNameInbox;
    @FindBy(id = "password")
    public WebElement paswordInbox;

    @FindBy(id = "submit-form")
    public WebElement loginButton;




    public void login(){
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.logInButton.click();




    }
}
