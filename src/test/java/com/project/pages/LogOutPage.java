package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {

    public LogOutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='menutoggle']")
    public WebElement EButton;

    @FindBy(xpath = "//nav[@class='settings-menu menu']/ul/li[4]/a")
    public WebElement logoutButton;
}
