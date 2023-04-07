package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RightHeaderElements {
    public RightHeaderElements() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='header-menu__trigger']")
    public WebElement magnifyingGlass;

    @FindBy(xpath = "//input[@class='unified-search__form-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//ul[@class='unified-search__results unified-search__results-files']/li/a")
    public WebElement file;

    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactsIcon;

    @FindBy(xpath = "//input[@id='contactsmenu-search']")
    public WebElement contactsInput;

    @FindBy(id = "contactsmenu-contacts")
    public WebElement specificContact;

    @FindBy(xpath = "//a[@id='nextcloud']")
    public WebElement tryCloudIcon;

}
