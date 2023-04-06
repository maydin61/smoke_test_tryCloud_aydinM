package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsModule {

    public ContactsModule() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/header/div[1]/ul/li[7]/a")
    public WebElement dashBoardContactsIcon;

    @FindBy(css = "span.app-navigation-entry__title")
    public WebElement Nc_NewGroup;

    @FindBy(css = "button.icon.action-item__menutoggle.icon-add")
    public WebElement Nc_plusSingNewGroup;

    @FindBy(css = "input.action-input__input.focusable")
    public WebElement Nc_CreatANewGroupInput;

    @FindBy(css = "label.action-input__label")
    public WebElement Nc_CreatANewGroupArrowIcon;

    @FindBy(xpath = "(//span[@class='app-navigation-entry__title'])[4]")
    public WebElement Nc_NewCreatedGroup;

    @FindBy(xpath = "(//button[@test-attr='1'])[4]")
    public WebElement Nc_Group22_3dots;

    @FindBy(xpath = "(//a[@href='#'])[9]")     // add second person in list
    public WebElement Nc_SearchContacts2Selection;

    @FindBy(xpath = "//div[@class='entity-picker__navigation']//button[2]")  // add second person in list
    public WebElement Nc_SearchContacts_AddToGroupButton;

    @FindBy(xpath = "/html/body/div[3]/main/div/div[2]/section/div[6]/h3/div[2]")
    public WebElement Nc_AddNewProperty;

    @FindBy(xpath = "(//span[@class='multiselect__placeholder']/../..//div)[9]")
    public WebElement Nc_AddPropertyTypeInput;

    @FindBy(xpath = "(//span[@class='multiselect__placeholder']/../..//div)[15]")
    public WebElement Nc_AddProperty_Birthday;

    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement Nc_AllContacts;

    @FindBy(xpath = "//a[@aria-expanded='true']")
    public WebElement Nc_allContacts_3linesIcon;

    @FindBy(css = "div.app-content-list-item.active")
    public WebElement Nc_allContacts_firstUser;

    @FindBy(css = "span.multiselect__placeholder")
    public WebElement Nc_AddPropertyTypeInput2;






}
