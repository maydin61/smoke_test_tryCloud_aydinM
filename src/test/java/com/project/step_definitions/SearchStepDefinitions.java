package com.project.step_definitions;

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

    @Given("user is on Dashboard page")
    public void userIsOnDashboardPage() {
        loginPage.login();
    }

    @When("user clicks contacts icon")
    public void userClicksContactsIcon() {
        rightHeaderElements.contactsIcon.click();
    }

    @And("types {string}")
    public void typesNames(String names) {
        rightHeaderElements.contactsInput.sendKeys(names + Keys.ENTER);
    }

    @Then("user can see that specific contact")
    public void userCanSeeThatSpecificContact() {

    }
}
