package com.project.step_definitions;

import com.project.pages.ContactsModule;
import com.project.pages.LoginPage;
import com.project.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContanctModule_StepDefinition {

    ContactsModule contactsModule = new ContactsModule();
    LoginPage loginPage = new LoginPage();




    @When("user should able to click to Contacts icon on dashboard page, then go Contacts module page")
    public void userShouldAbleToClickToContactsIconOnDashboardPageThenGoContactsModulePage() {
       /*
       Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.logInButton.click();
        */

        contactsModule.contactsIcon.click();
    }

    @Then("user should able to click to New group text or plus sing to creat a New group")
    public void userShouldAbleToClickToNewGroupTextOrPlusSingToCreatANewGroup() {
       // contactsModule.newGroupSpan.isEnabled();
        contactsModule.newGroupSpan.click();
       // contactsModule.creatANewGroupInput.isDisplayed();

    }

    @And("Create a New group text input box should becomes visible")
    public void createANewGroupTextInputBoxShouldBecomesVisible() throws InterruptedException {

        Thread.sleep(2000);
        contactsModule.creatANewGroupInput.isDisplayed();
    }

    @And("user should able to type a {string} name in to input box and while clicking arrow icon creat a new group")
    public void userShouldAbleToTypeANameInToInputBoxAndWhileClickingArrowIconCreatANewGroup(String arg0) {

        contactsModule.creatANewGroupInput.sendKeys(arg0);
        contactsModule.createANewGroupArrowButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Group22']")));

        //contactsModule.plusSignNewGroupButton.sendKeys("Group EU20");
       // contactsModule.createANewGroupArrowButton.click();
    }
}
