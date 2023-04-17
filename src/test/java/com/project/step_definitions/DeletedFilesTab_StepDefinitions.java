package com.project.step_definitions;

import com.project.pages.DeletedFilesTabPage;
import com.project.utilites.BrowserUtils;
import com.project.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DeletedFilesTab_StepDefinitions {
    DeletedFilesTabPage deletedFilesTabPage = new DeletedFilesTabPage();

    @When("user clicks on -Files- button")
    public void user_clicks_on_files_button() {
        deletedFilesTabPage.filesButton.click();
    }
    @When("user clicks on -Deleted files- button")
    public void user_clicks_on_deleted_files_button() {
        deletedFilesTabPage.deletedFiles.click();

    }

    @When("user clicks on -Deleted- button")
    public void user_clicks_on_deleted_button() {
        DeletedFilesTabPage.expectedTime=DeletedFilesTabPage.closestTime();
        BrowserUtils.waitForVisibility(deletedFilesTabPage.deletedButton,10);
        BrowserUtils.doubleClick(deletedFilesTabPage.deletedButton);
    }
    @Then("user should see the most recent deleted file in the first line")
    public void user_should_see_the_most_recent_deleted_file_in_the_first_line() {
        Assert.assertEquals(DeletedFilesTabPage.expectedTime,deletedFilesTabPage.recentDeletedFileTime.getAttribute("data-original-title"));
    }

    @And("user clicks on -Deleted- button again")
    public void userClicksOnDeletedButtonAgain() {
        deletedFilesTabPage.deletedButton.click();
        DeletedFilesTabPage.expectedLatestTime=DeletedFilesTabPage.latestTime();
    }

    @Then("user should see the oldest deleted file in the first line")
    public void userShouldSeeTheOldestDeletedFileInTheFirstLine() {
        Assert.assertEquals(DeletedFilesTabPage.expectedLatestTime,deletedFilesTabPage.oldestDeletedFile.getAttribute("data-original-title"));
    }

    @And("user clicks on -Name- button")
    public void userClicksOnNameButton() {
        DeletedFilesTabPage.firstINAlphabet=DeletedFilesTabPage.orderByAlphabet();
        deletedFilesTabPage.sortByName.click();
    }

    @Then("user should see all the deleted files alphabetically ordered")
    public void userShouldSeeAllTheDeletedFilesAlphabeticallyOrdered() {
        Assert.assertEquals(DeletedFilesTabPage.firstINAlphabet,deletedFilesTabPage.firstFile.getAttribute("data-original-title"));
    }

    @And("user clicks on -Three dots- icon in any file line")
    public void userClicksOnThreeDotsIconInAnyFileLine() {
        deletedFilesTabPage.threeDots.click();
    }

    @Then("user should be able to click on -Delete permanently- button")
    public void userShouldBeAbleToClickOnDeletePermanentlyButton() {
        deletedFilesTabPage.deletePermanentlyButton.click();
    }

    @Then("user selects a file")
    public void userSelectsAFile() {
        DeletedFilesTabPage.restoredFileName=deletedFilesTabPage.firstFile.getAttribute("data-original-title");
    }

    @And("user clicks on -Restore- button")
    public void userClicksOnRestoreButton() {
        deletedFilesTabPage.restoreButton.click();
    }

    @Then("user should be able to see the file under -All Files- tab")
    public void userShouldBeAbleToSeeTheFileUnderAllFilesTab() {
        deletedFilesTabPage.filesButton.click();
        DeletedFilesTabPage.scrollDown();
        Driver.getDriver().findElement(By.xpath("//span[.='"+DeletedFilesTabPage.restoredFileName+"']")).isDisplayed();
    }

    @Then("user selects the first file")
    public void userSelectsTheFirstFile() {
        DeletedFilesTabPage.restoredFileName=deletedFilesTabPage.firstFile.getAttribute("data-original-title");
        DeletedFilesTabPage.IDForXpath=deletedFilesTabPage.elementForID.getAttribute("data-id");
        deletedFilesTabPage.firstSelectButton=Driver.getDriver().findElement(By.xpath("//label[@for='select-trashbin-"+DeletedFilesTabPage.IDForXpath+"']"));
        deletedFilesTabPage.firstSelectButton.click();
    }

    @And("user clicks -Actions- button")
    public void userClicksActionsButton() {
        deletedFilesTabPage.actionsButton.click();
    }


    @And("user clicks on Restore button under Actions")
    public void userClicksOnRestoreButtonUnderActions() {
        deletedFilesTabPage.actionsRestoreButton.click();
    }
}
