package com.project.step_definitions;

import com.project.pages.CalendarModule;
import com.project.pages.DashboardPage;
import com.project.pages.LoginPage;
import com.project.utilites.BrowserUtils;
import com.project.utilites.ConfigurationReader;
import com.project.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import javax.swing.text.Utilities;

public class Calendar_StepDefs {

    public static final String eventTitleForDeleteFeature= "New event Title ready for delete function";
    String eventTitleForCreatingEvent = "New event Created";

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    CalendarModule calendarModule = new CalendarModule();


    //==================================== TC1 TC2 TC3 ======================================================


    @Given("user already logged in and on the calendar module")
    public void user_already_logged_in_and_on_the_calendar_module() {

        loginPage.login();
        dashboardPage.calendarModuleIcon.click();

    }

    @When("user clicks view menu square on the left side")
    public void user_clicks_view_type_square_on_the_left_side() {

        calendarModule.calendarViewMenu.click();
    }



    @Then("user clicks {string} on the left")
    public void user_clicks_on_the_left(String viewType) {

        if (viewType.equalsIgnoreCase("Day")){
            calendarModule.dailyCalendarViewIcon.click();
        }

        if (viewType.equalsIgnoreCase("Week")){
            calendarModule.weeklyCalendarViewIcon.click();
        }

        if (viewType.equalsIgnoreCase("Month")){
            calendarModule.monthlyCalendarViewIcon.click();
        }

    }
    @Then("user see {string} in the URL")
    public void user_see_in_the_url(String viewTypeName) {
        if (viewTypeName.equalsIgnoreCase("Day")){
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Day"));
        }

        if (viewTypeName.equalsIgnoreCase("Week")){
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Week"));
        }

        if (viewTypeName.equalsIgnoreCase("Month")){
            Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Month"));
        }

    }

//==================================== TC4 ======================================================

    @When("user clicks new event button")
    public void user_clicks_new_event_button() {
        calendarModule.newEventButton.click();
    }
    @Then("user enters event title")
    public void user_enters_event_title() {
        calendarModule.eventTitleInputBox.sendKeys(eventTitleForCreatingEvent);
    }
    @Then("user clicks save button")
    public void user_clicks_save_button() {
        calendarModule.saveButton.click();
    }
    @Then("user clicks Monthly view option")
    public void user_clicks_monthly_view_option() {
        calendarModule.monthlyCalendarViewIcon.click();
    }


    @Then("user verify that event created")
    public void user_verify_that_event_created() {
        BrowserUtils.sleep(1);
        String bodyText = Driver.getDriver().findElement(By.tagName("body")).getText(); // getting all body text
        Assert.assertTrue("Text not found!", bodyText.contains(eventTitleForCreatingEvent)); // checking if event exist or not
    }

//==================================== TC5 ======================================================



    @Then("user clicks on new created event")
    public void user_clicks_on_new_created_event() {
        calendarModule.newCreatedEvent.click();
    }
    @Then("user clicks on more button")
    public void user_clicks_on_more_button() {
        calendarModule.moreButton.click();
    }
    @Then("user clicks on menu icon")
    public void user_clicks_on_menu_icon() {
        calendarModule.menuIcon.click();
    }
    @Then("user clicks on delete button")
    public void user_clicks_on_delete_button() {
        calendarModule.deleteButton.click();
    }
    @Then("user verify that event deleted from calendar")
    public void user_verify_that_event_deleted_from_calendar() {
        BrowserUtils.sleep(1);
        String bodyText = Driver.getDriver().findElement(By.tagName("body")).getText(); // getting all body text
        Assert.assertFalse("Text is found!", bodyText.contains(eventTitleForDeleteFeature)); // checking if event exist or not
    }


    @Then("user enters new event title")
    public void userEntersEventNewTitle() {
        calendarModule.eventTitleInputBox.sendKeys(eventTitleForDeleteFeature);
    }
}
