package com.project.step_definitions;

import com.project.pages.ContactsModule;
import com.project.pages.LoginPage;
import com.project.utilites.Driver;
import io.cucumber.java.bs.I;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class ContanctModule_StepDefinition {

    ContactsModule contactsModule = new ContactsModule();

    @When("user should able to click to -Contacts icon- on dashboard page, then go Contacts module page")
    public void user_should_able_to_click_to_contacts_icon_on_dashboard_page_then_go_contacts_module_page() {
        contactsModule.dashBoardContactsIcon.click();
        String expectedUrl = "https://qa.trycloud.net/index.php/apps/contacts/All%20contacts";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("contacts"));

    }

    @Then("user should able to click to -New group- text or -plus sing- to creat a New group")
    public void userShouldAbleToClickToNewGroupTextOrPlusSingToCreatANewGroup() throws InterruptedException {
        contactsModule.Nc_NewGroup.click();
       /* Thread.sleep(2000);
        contactsModule.Nc_CreatANewGroupInput.isDisplayed();
        contactsModule.Nc_plusSingNewGroup.click();
        Thread.sleep(2000);
        contactsModule.Nc_CreatANewGroupInput.isDisplayed();*/
    }

    @And("Create a New group text input box should becomes visible")
    public void createANewGroupTextInputBoxShouldBecomesVisible() throws InterruptedException {
        contactsModule.Nc_plusSingNewGroup.click();
        Thread.sleep(3000);
        contactsModule.Nc_CreatANewGroupInput.isDisplayed();

    }

    @And("user should able to type a {string} name in to input box and while clicking arrow icon creat a new group")
    public void userShouldAbleToTypeANameInToInputBoxAndWhileClickingArrowIconCreatANewGroup(String arg0) {
        contactsModule.Nc_CreatANewGroupInput.sendKeys(arg0);
        contactsModule.Nc_CreatANewGroupArrowIcon.click();
        String actualTextNewGroup=contactsModule.Nc_NewCreatedGroup.getText();
        System.out.println("actualTextNewGroup = " + actualTextNewGroup);
        Assert.assertEquals(actualTextNewGroup,arg0);

    }
    @Then("user should able to add new Contacts from -Add contact- while clicking -...- icon")
    public void user_should_able_to_add_new_contacts_from_add_contact_while_clicking_icon() {
    contactsModule.Nc_Group22_3dots.click();

    WebElement n=contactsModule.Nc_Group22_3dots;
    Select select=new Select(n);
    select.selectByVisibleText("Add contacts");
    contactsModule.Nc_SearchContacts2Selection.click();
    contactsModule.Nc_SearchContacts_AddToGroupButton.click();




    }

    @Then("user should able  to see -Add new property- text on Contact Module page")
    public void userShouldAbleToSeeAddNewPropertyTextOnContactModulePage() {
        String actualText = contactsModule.Nc_AddNewProperty.getText();
        // System.out.println("actualText = " + actualText);
        String expectedText ="Add new property";
        Assert.assertEquals(expectedText, actualText);
    }

    @And("user should able to see -Choose property type- input span")
    public void userShouldAbleToSeeChoosePropertyTypeInputSpan() {
       contactsModule.Nc_AddPropertyTypeInput.isEnabled();


    }

    @And("user should able to see the drop down menu while clicking -Choose property type- span")
    public void userShouldAbleToSeeTheDropDownMenuWhileClickingChoosePropertyTypeSpan() throws InterruptedException {
       contactsModule.Nc_AllContacts.click();
       contactsModule.Nc_allContacts_3linesIcon.click();
       contactsModule.Nc_allContacts_firstUser.click();
       contactsModule.Nc_AddNewProperty.click();
       contactsModule.Nc_AddPropertyTypeInput.isDisplayed();
       Thread.sleep(2000);
       contactsModule.Nc_AddPropertyTypeInput.click();
        Thread.sleep(2000);
       // contactsModule.Nc_AddProperty_Birthday.click();


        //Select dropSelect = new Select(contactsModule.Nc_AddProperty_Birthday);
       // dropSelect.selectByVisibleText("Birthday");
    }

    @And("user should able to add a new property as {string} from dro[down menu")
    public void userShouldAbleToAddANewPropertyAsFromDroDownMenu(String arg0) throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10 );
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div/div[2]/section/div[6]/h3/div[2]")));
        contactsModule.Nc_AddNewProperty.sendKeys(arg0,Keys.ENTER);
        Thread.sleep(3000);
       // contactsModule.Nc_AddNewProperty.sendKeys(Keys.ENTER);
       // Thread.sleep(3000);


        }
}

 /*   WebDriverWait wait = new WebDriverWait(gmail, 10);
    WebElement element = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
gmail.findElement(By.id("Passwd")).sendKeys("xyz");*/
//Select drpCountry = new Select(driver.findElement(By.name("country")));
//drpCountry.selectByVisibleText("ANTARCTICA");