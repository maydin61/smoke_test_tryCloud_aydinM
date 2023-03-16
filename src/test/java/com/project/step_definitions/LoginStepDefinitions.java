package com.project.step_definitions;

import com.project.pages.LoginPage;
import com.project.utilites.ConfigurationReader;
import com.project.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

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

    @And("user hits ENTER key from keyboard")
    public void userHitsENTERKeyFromKeyboard() {
        loginPage.passwordInput.sendKeys(Keys.ENTER);
    }

    @When("user enters invalid username")
    public void userEntersInvalidUsername() {
        loginPage.usernameInput.sendKeys("Employee1055");
    }

    @Then("user should see -Wrong username or password.-")
    public void userShouldSeeWrongUsernameOrPassword() {
        Assert.assertTrue(loginPage.wrongMsg.isDisplayed());
    }

    @And("user enters invalid password")
    public void userEntersInvalidPassword() {
        loginPage.passwordInput.sendKeys("Employee1234");
    }

    @When("user leaves username empty")
    public void userLeavesUsernameEmpty() {
    }

    @Then("user should see -Please fill out this field- message")
    public void userShouldSeePleaseFillOutThisFieldMessage() {
        if (loginPage.usernameInput.getAttribute("required").equals("required")) {
            Assert.assertEquals(loginPage.usernameInput.getAttribute("validationMessage"), "Please fill out this field.");
        }
        if (loginPage.passwordInput.getAttribute("required").equals("required")) {
            Assert.assertEquals(loginPage.passwordInput.getAttribute("validationMessage"), "Please fill out this field.");
        }
    }

    @And("user leaves password empty")
    public void userLeavesPasswordEmpty() {
    }
}
