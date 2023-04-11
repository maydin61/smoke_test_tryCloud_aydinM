package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomisePage {

    public CustomisePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//a[@class='edit-panels icon-rename']")
    public WebElement customiseButton;

    @FindBy(xpath = "//label[@class='icon-user-status-online']")
    public WebElement statusButton;

    @FindBy(xpath = "//h3[.='Edit widgets']")
    public WebElement widgetNames;

    @FindBy(xpath = "//label[@for='status-checkbox-status']")
    public WebElement statusCheckbox;

    @FindBy(xpath = "//label[@for='status-checkbox-weather']")
    public WebElement weatherCheckbox;

    @FindBy(xpath = "//label[@for='panel-checkbox-recommendations']")
    public WebElement recommendedCheck;

    @FindBy(xpath = "//label[@for='panel-checkbox-spreed']")
    public WebElement talkCheck;

    @FindBy(xpath = "//label[@for='panel-checkbox-mail']")
    public WebElement importantCheck;

    @FindBy(xpath = "//label[@for='panel-checkbox-calendar']")
    public WebElement upcomingEventCheck;

    @FindBy(xpath = "//label[@for='panel-checkbox-deck']")
    public WebElement upcomingCardsCheck;

    @FindBy(xpath = "//label[@for='panel-checkbox-mail-unread']")
    public WebElement unreadMailCheck;

    @FindBy(xpath = "//label[@for='panel-checkbox-user_status']")
    public WebElement recentCheck;
}