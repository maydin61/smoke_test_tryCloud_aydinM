package com.project.step_definitions;

import com.project.pages.DeletedFilesTabPage;
import com.project.utilites.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeletedFilesTab_StepDefinitions {
    DeletedFilesTabPage deletedFilesTabPage = new DeletedFilesTabPage();

    @When("user clicks on -Files- button")
    public void user_clicks_on_files_button() {
        deletedFilesTabPage.filesButton.click();
    }
    @When("user clicks on -Deleted files- button")
    public void user_clicks_on_deleted_files_button() {
        deletedFilesTabPage.deletedFiles.click();
        DeletedFilesTabPage.expectedTime=DeletedFilesTabPage.closestTime();
    }

    @When("user clicks on -Deleted- button")
    public void user_clicks_on_deleted_button() {
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

}
