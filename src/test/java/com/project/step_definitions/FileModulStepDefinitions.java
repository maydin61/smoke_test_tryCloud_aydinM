package com.project.step_definitions;

import com.project.pages.DeletedFilesTabPage;
import com.project.pages.FilePage;
import com.project.utilites.BrowserUtils;
import com.project.utilites.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FileModulStepDefinitions {

    FilePage filePage = new FilePage();

    @When("user clicks the {string} module")
    public void userClicksTheModule(String modulName) {

        filePage.navigateModul(modulName).click();





    }
    @When("user click the plus icon")
    public void user_click_the_plus_icon() {

        filePage.plusIcon.click();

    }
    @When("user clicks upload file")
    public void user_clicks_upload_file() {

        filePage.uploadFileIcon.click();

    }
    @When("user selects any file")
    public void user_selects_any_file() throws AWTException {

        filePage.fileUpload("LoadFile");

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_L);
//        robot.keyPress(KeyEvent.VK_O);
//        robot.keyPress(KeyEvent.VK_G);
//
//        robot.keyPress(KeyEvent.VK_ENTER);
    }

    @Then("user see uploaded file")
    public void user_see_uploaded_file() {
        BrowserUtils.waitFor(2);
        System.out.println("filePage.actualUploadedFile.getText() = " + filePage.actualUploadedFile.getText());
        Assert.assertEquals("LoadFile\n" +
                ".txt",filePage.actualUploadedFile.getText());
    }



}
