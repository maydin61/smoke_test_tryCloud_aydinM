package com.project.step_definitions;

import com.project.pages.DeletedFilesTabPage;
import com.project.pages.LoginPage;
import com.project.utilites.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeletedFilesTab_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    DeletedFilesTabPage deletedFilesTabPage = new DeletedFilesTabPage();

    @When("user clicks on -Files- button")
    public void user_clicks_on_files_button() {
        loginPage.login();
        deletedFilesTabPage.filesButton.click();
    }
    @When("user clicks on -Deleted files- button")
    public void user_clicks_on_deleted_files_button() {
        deletedFilesTabPage.deletedFiles.click();
    }
    @When("user clicks on -Deleted- button")
    public void user_clicks_on_deleted_button() {
        BrowserUtils.waitForVisibility(deletedFilesTabPage.deletedButton,10);
        BrowserUtils.doubleClick(deletedFilesTabPage.deletedButton);
    }
    @Then("user should see the most recent deleted file in the first line")
    public void user_should_see_the_most_recent_deleted_file_in_the_first_line() {
        Assert.assertEquals("Readme\n.md",deletedFilesTabPage.recentDeletedFile.getText());
    }

}
