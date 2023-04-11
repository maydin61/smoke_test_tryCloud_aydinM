package com.project.step_definitions;

import com.project.pages.CustomisePage;
import com.project.utilites.ConfigurationReader;
import com.project.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CustomiseStepDefinitions {

CustomisePage customisePage = new CustomisePage();


    @When("user clicks on Customise button")
    public void user_clicks_on_customise_button() {
        customisePage.customiseButton.click();

    }
    @When("user sees the widgets")
    public void user_sees_the_widgets() {
       String actualTitle = customisePage.widgetNames.getText();
        String expectedTitle = "Edit widgets";
        Assert.assertEquals(expectedTitle,actualTitle);

    }


    @Then("user should be able to see the widgets selected")
    public void userShouldBeAbleToSeeTheWidgetsSelected() {
        customisePage.statusButton.isSelected();
        Assert.assertTrue(  customisePage.statusButton.isSelected());


    }
       @And("user clicks on the widgets names")
    public void userClicksOnTheWidgetsNames() {
        customisePage.statusCheckbox.click();
        customisePage.statusButton.isSelected();

        customisePage.weatherCheckbox.click();
        customisePage.weatherCheckbox.isSelected();

        customisePage.recommendedCheck.click();
        customisePage.recommendedCheck.isSelected();

        customisePage.talkCheck.click();
        customisePage.talkCheck.isSelected();

        customisePage.importantCheck.click();
        customisePage.importantCheck.isSelected();

        customisePage.upcomingEventCheck.click();
        customisePage.upcomingEventCheck.isSelected();

        customisePage.upcomingCardsCheck.click();
        customisePage.upcomingCardsCheck.isSelected();

        customisePage.unreadMailCheck.click();
        customisePage.unreadMailCheck.isSelected();

        customisePage.recentCheck.click();
        customisePage.recentCheck.isSelected();
    }

       }








