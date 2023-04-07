package com.project.step_definitions;

import com.project.pages.PhotosPage;
import com.project.pages.RightHeaderElements;
import com.project.pages.FilesPage;
import com.project.pages.LoginPage;
import com.project.utilites.BrowserUtils;
import com.project.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchStepDefinitions {

    LoginPage loginPage = new LoginPage();

    RightHeaderElements rightHeaderElements = new RightHeaderElements();

    FilesPage filesPage = new FilesPage();

    PhotosPage photosPage = new PhotosPage();

    @Given("user is under the {string} module")
    public void user_is_under_the_module(String moduleName) {
        Driver.getDriver().navigate().to("https://qa.trycloud.net/index.php/apps/" + moduleName + "/");

    }
    @When("user clicks magnifying glass")
    public void user_clicks_magnifying_glass() {
        BrowserUtils.waitFor(5);
        rightHeaderElements.magnifyingGlass.click();
    }
    @When("user enters {string} file name")
    public void user_enters_file_name(String fileName) {
        rightHeaderElements.searchBox.sendKeys(fileName + Keys.ENTER);
    }
    @When("user clicks the file")
    public void user_clicks_the_file() {
        BrowserUtils.waitForVisibility(rightHeaderElements.file, 10);
        rightHeaderElements.file.click();
    }
    @Then("user should see the details side page of the file")
    public void user_should_see_the_details_side_page_of_the_file() {
        Assert.assertTrue(filesPage.sideBar.isDisplayed());
    }

    @When("user clicks contacts icon")
    public void userClicksContactsIcon() {

        BrowserUtils.waitForClickablility(rightHeaderElements.contactsIcon,3);
        rightHeaderElements.contactsIcon.click();
    }

    @And("types {string}")
    public void typesNames(String names) {
        rightHeaderElements.contactsInput.sendKeys(names + Keys.ENTER);
    }

    @Then("user can see that specific contact")
    public void userCanSeeThatSpecificContact() {
        Assert.assertTrue(rightHeaderElements.specificContact.isDisplayed());
    }

    @And("user clicks the Trycloud icon")
    public void userClicksTheTrycloudIcon() {
        rightHeaderElements.tryCloudIcon.click();
    }

    @Then("user should be on the Dashboard page")
    public void userShouldBeOnTheDashboardPage() {
        Assert.assertEquals("https://qa.trycloud.net/index.php/apps/dashboard/", Driver.getDriver().getCurrentUrl());
    }
}
