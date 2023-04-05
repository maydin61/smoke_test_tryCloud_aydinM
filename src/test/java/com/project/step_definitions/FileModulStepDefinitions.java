package com.project.step_definitions;

import com.project.pages.DeletedFilesTabPage;
import com.project.pages.FilePage;
import com.project.utilites.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FileModulStepDefinitions {

    FilePage filePage = new FilePage();

    @When("user clicks the {string} module")
    public void userClicksTheModule(String modulName) {

        filePage.navigateModul(modulName).click();





    }
    @When("user click the plus icon")
    public void user_click_the_plus_icon() {

    }
    @When("user clicks upload file")
    public void user_clicks_upload_file() {

    }
    @When("user selects any file")
    public void user_selects_any_file() {

    }
    @Then("user hit the open button")
    public void user_hit_the_open_button() {

    }



}
