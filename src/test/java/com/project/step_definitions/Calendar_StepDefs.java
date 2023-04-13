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
import org.openqa.selenium.interactions.Actions;

import javax.swing.text.Utilities;

public class Calendar_StepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    CalendarModule calendarModule = new CalendarModule();


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






}
