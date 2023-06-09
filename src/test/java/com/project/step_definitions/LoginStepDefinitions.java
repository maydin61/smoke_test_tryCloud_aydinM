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

import javax.crypto.spec.PSource;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page.")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }

    @When("user enters valid username")
    public void user_enters_valid_username() {
        loginPage.usernameInput.sendKeys("Employee95");
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
        Assert.assertEquals(expectedURL, actualURL);
    }

    @And("user hits ENTER key from keyboard")
    public void userHitsENTERKeyFromKeyboard() {
        loginPage.passwordInput.sendKeys(Keys.ENTER);
    }

    @When("user enters invalid {string}")
    public void userEntersInvalid(String string) {
        loginPage.usernameInput.sendKeys(string);
    }

    @Then("user should see -Wrong username or password.-")
    public void userShouldSeeWrongUsernameOrPassword() {
        Assert.assertTrue(loginPage.wrongMsg.isDisplayed());
    }

    @And("user enters invalid password")
    public void userEntersInvalidPassword() {
        loginPage.passwordInput.sendKeys("Employee1234");
    }

    @When("user enters invalid username")
    public void userEntersInvalidUsername() {
        loginPage.usernameInput.sendKeys("Employee1055");
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

    @When("user enters password")
    public void userEntersPassword() {
        loginPage.passwordInput.sendKeys("Employee1234");
    }

    @Then("user should see password in form of dots")
    public void userShouldSeePasswordInFormOfDots() {
        Assert.assertEquals("password", loginPage.passwordInput.getAttribute("type"));
    }

    @And("user clicks on EYE button")
    public void userClicksOnEYEButton() {
        loginPage.eyeButton.click();
    }

    @Then("user should see password explicitly")
    public void userShouldSeePasswordExplicitly() {
        Assert.assertEquals("text", loginPage.passwordInput.getAttribute("type"));
    }

    @When("user can see -Forgot password?-")
    public void userCanSeeForgotPassword() {
        Assert.assertTrue(loginPage.forgotPassword.isDisplayed());
    }

    @And("user clicks on -Forgot password?-")
    public void userClicksOnForgotPassword() {
        loginPage.forgotPassword.click();
    }

    @Then("user can see -Reset password-")
    public void userCanSeeResetPassword() {
        Assert.assertTrue(loginPage.resetPassword.isDisplayed());
    }

    @Then("user can see valid placeholders")
    public void userCanSeeValidPlaceholders() {
        Assert.assertEquals("Username or email", loginPage.usernameInput.getAttribute("placeholder"));
        Assert.assertEquals("Password", loginPage.passwordInput.getAttribute("placeholder"));
    }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {


    }

    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String arg0) {


    }

    @When("user login")
    public void userLogin() {
        loginPage.login();

    }

    @When("user input {string} and {string}")
    public void userInputAnd(String username, String password) throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        loginPage.usernameInput.sendKeys("Employee25");
        loginPage.passwordInput.sendKeys("Employee123");
        Thread.sleep(3000);

    }
}
