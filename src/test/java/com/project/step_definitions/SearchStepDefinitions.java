package com.project.step_definitions;

import com.project.pages.DashboardPage;
import com.project.pages.FilesPage;
import com.project.pages.LoginPage;
import com.project.utilites.BrowserUtils;
import com.project.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchStepDefinitions {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    FilesPage filesPage = new FilesPage();

    @Given("user is under the {string} module")
    public void user_is_under_the_module(String moduleName) {
        loginPage.login();
        Driver.getDriver().navigate().to("https://qa.trycloud.net/index.php/apps/" + moduleName + "/");

    }
    @When("user clicks magnifying glass")
    public void user_clicks_magnifying_glass() {
        BrowserUtils.waitFor(5);
        dashboardPage.magnifyingGlass.click();
    }
    @When("user enters {string} file name")
    public void user_enters_file_name(String fileName) {
        dashboardPage.searchBox.sendKeys(fileName + Keys.ENTER);
    }
    @When("user clicks the file")
    public void user_clicks_the_file() {
        BrowserUtils.waitForVisibility(dashboardPage.file, 10);
        dashboardPage.file.click();
    }
    @Then("user should see the details side page of the file")
    public void user_should_see_the_details_side_page_of_the_file() {
        Assert.assertTrue(filesPage.sideBar.isDisplayed());
    }
}
