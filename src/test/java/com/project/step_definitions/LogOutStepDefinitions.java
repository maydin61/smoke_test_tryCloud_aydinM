package com.project.step_definitions;

import com.project.pages.LogOutPage;
import com.project.pages.LoginPage;
import com.project.utilites.ConfigurationReader;
import com.project.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogOutStepDefinitions {

    LogOutPage logOutPage = new LogOutPage();
    LoginPage loginPage = new LoginPage();

    @Given("User is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        loginPage.usernameInput.sendKeys("Employee105");
        loginPage.passwordInput.sendKeys("Employee123");
        loginPage.logInButton.click();
    }
    @When("user clicks on -E- button")
    public void user_clicks_on_e_button() {
       logOutPage.EButton.click();
    }
    @When("user clicks on -Logout- button")
    public void user_clicks_on_logout_button() {
       logOutPage.logoutButton.click();
    }
    @Then("user should be on the login page")
    public void user_should_be_on_the_login_page() {
        String expectedURL = "https://qa.trycloud.net/index.php/login?clear=1";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }

    @And("user clicks -Step Back- button")
    public void userClicksStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("user is still on login page")
    public void userIsStillOnLoginPage() {
        String expectedURL = "https://qa.trycloud.net/index.php/login?redirect_url=/index.php/apps/dashboard/";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }


}
