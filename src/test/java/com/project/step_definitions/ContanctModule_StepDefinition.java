package com.project.step_definitions;

import com.project.pages.ContactsModule;
import com.project.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


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
        Assert.assertEquals(actualTextNewGroup,"Group EU10");

    }
    @Then("user should able to add new Contacts from -Add contact- while clicking -...- icon")
    public void user_should_able_to_add_new_contacts_from_add_contact_while_clicking_icon() {
        contactsModule.Nc_Group_EU10_3dots_2ndInGroup_List.click();

        WebElement n=contactsModule.Nc_Group_EU10_3dots_2ndInGroup_List;
        Select select=new Select(n);
        select.selectByVisibleText("Add contacts");
        contactsModule.Nc_SearchContacts2Selection.click();
        contactsModule.Nc_SearchContacts_AddToGroupButton.click();

    }

    @Then("user should able  to see -Add new property- text on Contact Module page")
    public void userShouldAbleToSeeAddNewPropertyTextOnContactModulePage() {
        String actualText =contactsModule.Nc_AddNewPropertyText.getText();
        System.out.println("actualText = " + actualText);
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

        contactsModule.Nc_AddPropertyTypeInput.isDisplayed();
        Thread.sleep(2000);
        contactsModule.Nc_AddPropertyTypeInput.click();
        Thread.sleep(2000);
       }

    @And("user should able to add a new property as {string} from dro[down menu")
    public void userShouldAbleToAddANewPropertyAsFromDroDownMenu(String arg0) throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10 );
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div/div[2]/section/div[6]/h3/div[2]")));
        contactsModule.Nc_AddPropertyTypeInput.sendKeys(arg0,Keys.ENTER);
        Thread.sleep(3000);

    }

    @Then("The user should able to click - + Add contacts-")
    public void theUserShouldAbleToClickAddContacts() {
        contactsModule.Nc_AllContacts.isEnabled();

    }

    @And("The user should able to see -Search Contacts- and -all contacts- listed")
    public void theUserShouldAbleToSeeSearchContactsAndAllContactsListed() {
        contactsModule.Nc_AllContacts.isDisplayed();
    }

    @And("the user should be able to click to -Add to group- button any contacts to add its own info menu")
    public void theUserShouldBeAbleToClickToAddToGroupButtonAnyContactsToAddItsOwnInfoMenu() {

        contactsModule.Nc_group3DotsButton.isEnabled();
        contactsModule.Nc_plusSingAddContacts_group.isDisplayed();
    }

    @When("the user can add a new contact to his or her group selected")
    public void theUserCanAddANewContactToHisOrHerTheGroupSelected() throws InterruptedException {

        contactsModule.Nc_Group_EU10_3dots_2ndInGroup_List.click();
        Thread.sleep(1500);
        contactsModule.Nc_plusSingAddContacts_group.click();
        Thread.sleep(1500);
        contactsModule.Nc_SearchContacts2Selection.click();
        Thread.sleep(1500);
        contactsModule.Nc_SearchContacts_AddToGroupButton.click();
    }

    // # 3 codes

    @When("the user clicks to plus button")
    public void theUserClicksToPlusButton() {
        contactsModule.Nc_plusSingNewGroup.click();

    }

    @Then("the user can see {string} text in the box")
    public void theUserCanSeeTextInTheBox(String arg0) {
        contactsModule.Nc_creatANewGroupText.isDisplayed();
       // String expectedText=arg0;

    }

    @And("the user can enter new group name {string} in to the box")
    public void theUserCanEnterNewGroupNameInToTheBox(String arg0) {
        contactsModule.Nc_CreatANewGroupInput.sendKeys(arg0);
        contactsModule.Nc_CreatANewGroupArrowIcon.click();
        contactsModule.Nc_Group_EU10_3dots_2ndInGroup_List.click();

        contactsModule.Nc_plusSingAddContacts_group.click();
        contactsModule.Nc_SearchContacts2Selection.click();
        contactsModule.Nc_SearchContacts_AddToGroupButton.click();
    }

    @And("the user can click all contacts button")
    public void theUserCanClickAllContactsButton() {
        contactsModule.Nc_AllContacts.isEnabled();
    }

    @Then("the user can click any contact and add it to {string} group")
    public void theUserCanClickAnyContactAndAddItToGroup(String arg0) {
        contactsModule.Nc_Group_EU10_3dots_2ndInGroup_List.click();
        contactsModule.NewContact_plusNewContact.click();
        contactsModule.Nc_SearchContacts2Selection.click();
        contactsModule.Nc_SearchContacts_AddToGroupButton.click();

    }
}

