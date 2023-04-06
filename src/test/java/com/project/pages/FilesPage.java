package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {

    public FilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "app-sidebar-tabs__content")
    public WebElement sideBar;

    @FindBy(xpath = "//div[@class='actions creatable']/a")
    public WebElement plusButton;

    @FindBy(xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']/ul/li[1]")
    public WebElement uploadAFile;
}
