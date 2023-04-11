package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarModule {

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




}
