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

    @FindBy(xpath = "(//input[@class='action-input__input focusable']/../../../..//span)[3]")
    public WebElement Nc_creatANewGroupText;

    @FindBy(css = "input.action-input__input.focusable")
    public WebElement Nc_CreatANewGroupInput;

    @FindBy(css = "label.action-input__label")
    public WebElement Nc_CreatANewGroupArrowIcon;

    @FindBy(xpath = "(//span[@class='app-navigation-entry__title'])[4]")
    public WebElement Nc_NewCreatedGroup;

    @FindBy(xpath = "(//button[@test-attr='1'])[4]")
    public WebElement Nc_Group_EU10_3dots_2ndInGroup_List;

   // (//button[@aria-haspopup='true'])[4]

    @FindBy(xpath = "(//a[@href='#'])[9]")     // add second person in list
    public WebElement Nc_SearchContacts2Selection;

    @FindBy(xpath = "//div[@class='entity-picker__navigation']//button[2]")  // add second person in list
    public WebElement Nc_SearchContacts_AddToGroupButton;

    @FindBy(xpath = "(//div[@class='property__value property__title--right'])[6]")
    public WebElement Nc_AddNewPropertyText;

    @FindBy(xpath = "//div[@class='multiselect property__value multiselect--above multiselect--single']")
    public WebElement Nc_AddNewProperty;

    @FindBy(xpath = "(//input)[37]")
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

    @FindBy(xpath = "(//button[@aria-haspopup='true'])[4]")
    public WebElement Nc_group3DotsButton;

    @FindBy(xpath = "//span[@class='action-button__text']")
    public WebElement Nc_plusSingAddContacts_group;

    // New Contact locators

    @FindBy(xpath = "//button")
    public WebElement NewContact_plusNewContact;

    @FindBy(xpath = "(//input)[20]")
    public WebElement NewContact_text;

    @FindBy(xpath = "(//input)[21]")
    public WebElement NewContact_Company;

    @FindBy(xpath = "(//input)[22]")
    public WebElement NewContact_title;

    @FindBy(xpath = "(//input)[23]")
    public WebElement NewContact_Home_Dropdown_Phone;

    @FindBy(xpath = "(//input)[24]")
    public WebElement NewContact_Phone_Input;

    @FindBy(xpath = "(//input)[25]")
    public WebElement NewContact_Home_DropDown_Email;

    @FindBy(xpath = "(//input)[26]")
    public WebElement NewContact_Email_Input;

    @FindBy(xpath = "(//input)[27]")
    public WebElement NewContact_Home_DropDown_Address;

    @FindBy(xpath = "(//input)[28]")
    public WebElement NewContact_PostOfficeBox;

    @FindBy(xpath = "(//input)[29]")
    public WebElement NewContact_Address_Address;

    @FindBy(xpath = "(//input)[30]")
    public WebElement NewContact_ExtendedAddress;

    @FindBy(xpath = "(//input)[31]")
    public WebElement NewContact_PostalCode;

    @FindBy(xpath = "(//input)[32]")
    public WebElement NewContact_City;

    @FindBy(xpath = "(//input)[33]")
    public WebElement NewContact_StataOrProvince;

    @FindBy(xpath = "(//input)[34]")
    public WebElement NewContact_Country;

    @FindBy (xpath = "//button[@class='action-item action-item--single property__actions property__actions--floating icon-delete undefined undefined has-tooltip']")
    public WebElement NewContact_Delete_Address;

    @FindBy (xpath = "(//button[@class='action-item action-item--single property__actions icon-delete undefined undefined has-tooltip'])[1]")
    public WebElement NewContact_Delete_Phone;

    @FindBy (xpath = "(//button[@class='action-item action-item--single property__actions icon-delete undefined undefined has-tooltip'])[2]")
    public WebElement NewContact_Email_Phone;







}
