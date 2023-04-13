package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "(//a[@aria-label=\"Calendar\"]) [1]")
    public WebElement calendarModuleIcon;









}
