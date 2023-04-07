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
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class FileModulStepDefinitions {

    FilePage filePage = new FilePage();


    @When("user clicks the {string} module")
    public void userClicksTheModule(String modulName) {

        filePage.navigateModul(modulName).click();


    }

    @When("user click the plus icon")
    public void user_click_the_plus_icon() {
        BrowserUtils.waitFor(3);
        filePage.plusIcon.click();

    }

    @When("user clicks upload file")
    public void user_clicks_upload_file() {

        filePage.uploadFileIcon.click();

    }

    @When("user selects any file")
    public void user_selects_any_file() throws AWTException {

        filePage.fileUpload("load");

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

        List<String> actualFolderList = BrowserUtils.getElementsText(filePage.folderlist);
        System.out.println(actualFolderList);

        if(actualFolderList.contains("load\n" +
                ".txt")){

            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }


    }


      @Then("the user delete uploaded file")
    public void the_user_delete_uploaded_file() {


            }


    @When("user clicks New folder file")
    public void user_clicks_new_folder_file() {

        filePage.newFolderSelect.click();

    }
    @Then("click arrow icon")
    public void click_arrow_icon() {
        filePage.arrowIconClick.click();

    }

    @Then("user see New folder file")
    public void user_see_new_folder_file() {

        //System.out.println("filePage.newFolderLocate.getText() = " + filePage.newFolderLocate.getText());
        BrowserUtils.waitFor(2);

        List<String> actualFolderList = BrowserUtils.getElementsText(filePage.folderlist);

        if(actualFolderList.contains("New folder")){

                Assert.assertTrue(true);
            }else{
                Assert.assertTrue(false);
            }



    }

    @When("user clicks New text document")
    public void user_clicks_new_text_document() {


       filePage.newTextDocument1.click();



    }
    @Then("user move or copy the document into the any folder")
    public void user_move_or_copy_the_document_into_the_any_folder() {
        BrowserUtils.waitFor(3);
        filePage.closeIcon.click();
        BrowserUtils.waitFor(3);
        filePage.threeDot.click();
        filePage.moveOrCopyButton.click();
        filePage.chooseTargetfolder.click();
        filePage.moveToTalkButton.click();

    }
    @Then("user see the item in the selected folder")
    public void user_see_the_item_in_the_selected_folder() {

        Assert.assertEquals("New text document",filePage.newTextDocument2.getText());

    }

    @Then("the user delete selected file")
    public void the_user_delete_selected_file() {

        filePage.threeDotDocument.click();
//        filePage.deleteFileButton.click();

    }

    @Then("user sees no file into the folder")
    public void user_sees_no_file_into_the_folder() {
        BrowserUtils.waitFor(3);
        Assert.assertEquals("No files in here",filePage.NoFilesText.getText());
    }


    @Then("user sees the number of the file and folder")
    public void user_sees_the_number_of_the_file_and_folder() {
        BrowserUtils.waitFor(3);
        Assert.assertEquals("2 folders and 1 file", filePage.NumberOfFile.getText());
        System.out.println("filePage.NumberOfFile.getText() = " + filePage.NumberOfFile.getText());

        filePage.closeIcon.click();
        BrowserUtils.waitFor(3);


    }

    @Then("user clicks the add to favorites icon")
    public void user_clicks_the_add_to_favorites_icon() {
        BrowserUtils.waitFor(2);
       filePage.threeDotDocument.click();
       filePage.addToFavorites.click();

    }

    @Then("user selects favorites button")
    public void user_selects_favorites_button() {

        filePage.favoritesMenu.click();

    }
    @Then("user sees folder in the favorites section")
    public void user_sees_folder_in_the_favorites_section() {

        Assert.assertEquals("Talk", filePage.talkFolder.getText());

    }


    @Then("the user delete {string} uploaded file")
    public void theUserDeleteUploadedFile(String file) {
        BrowserUtils.waitFor(3);

        List<String> actualFolderList = BrowserUtils.getElementsText(filePage.folderlist);
        int count = 1;

        for (int i = 0; i < actualFolderList.size(); i++) {

            if(actualFolderList.equals(file)) {

                count++;
                System.out.println("count = " + count);
                break;
            }

        }


        filePage.threeDotMethod(count).click();

//            filePage.threeDotDocument.click();
        filePage.deleteFileButton.click();
    }
}

