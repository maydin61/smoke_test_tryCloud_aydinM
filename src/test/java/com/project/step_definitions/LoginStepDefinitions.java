package com.project.step_definitions;

import com.project.pages.LoginPage;
import com.project.utilites.utilities.ConfigurationReader;
import com.project.utilites.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page.")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
        loginPage.usernameInput.sendKeys("Employee105");
    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        loginPage.passwordInput.sendKeys("Employee123");
    }
    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.logInButton.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        String expectedURL = "https://qa.trycloud.net/index.php/apps/dashboard/";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }

}
