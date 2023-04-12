package com.project.pages;

import com.project.step_definitions.Calendar_StepDefs;
import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarModule{

    public CalendarModule(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/header/div[2]/div/div/div/button")
    public WebElement calendarViewMenu;

    @FindBy(xpath = "//span[.='Day']")
    public WebElement dailyCalendarViewIcon;

    @FindBy(xpath = "//span[.='Week']")
    public WebElement weeklyCalendarViewIcon;

    @FindBy(xpath = "//span[.='Month']")
    public WebElement monthlyCalendarViewIcon;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitleInputBox;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'"+Calendar_StepDefs.eventTitleForDeleteFeature+"')]")
    public WebElement newCreatedEvent;

    @FindBy(xpath = "//button[contains(text(),'More')]") // also can be created with "." like this //button[contains(.,'More')]
    public WebElement moreButton;

    @FindBy (xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[4]")
    public WebElement menuIcon;

    @FindBy (xpath = "//span[.='Delete']")
    public WebElement deleteButton;






}
