package com.project.step_definitions;

import com.project.pages.US0012_FilePage;
import com.project.utilites.BrowserUtils;
import com.project.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class US0012_StepDefinitions {

    US0012_FilePage filePage = new US0012_FilePage();

    @When("user clicks {string} module")
    public void userClicksModule(String modul) {
        filePage.navigateModul(modul).click();
    }

    @And("user clicks Add to Favorites icon")
    public void userClicksAddToFavoritesIcon() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(2);
        for (int i = 0; i < 5; i++) {
            js.executeScript("window.scrollBy(0,250)");
        }
        BrowserUtils.waitFor(2);
        int index = filePage.getFileIndex("US-0012-1");
        BrowserUtils.waitFor(2);
        filePage.threeDot(index).click();
        BrowserUtils.waitFor(2);
        filePage.addToFavorites.click();

    }

    @And("user clicks favorites button")
    public void userClicksFavoritesButton() {
        filePage.favorites.click();
        Driver.getDriver().navigate().refresh();
    }

    @Then("user sees file in the favorites section")
    public void userSeesFileInTheFavoritesSection() {
        BrowserUtils.waitFor(2);

        Assert.assertEquals("US-0012-1", filePage.File1Fav.getText());
    }

    @And("user clicks Rename icon")
    public void userClicksRenameIcon() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(2);
        for (int i = 0; i < 5; i++) {
            js.executeScript("window.scrollBy(0,250)");
        }
        BrowserUtils.waitFor(2);
        int index = filePage.getFileIndex("US-0012-2");
        BrowserUtils.waitFor(2);
        filePage.threeDot(index).click();
        BrowserUtils.waitFor(2);
        filePage.rename.click();
    }

    @And("user enters file name RenameFile")
    public void userEntersFileNameRenameFile() {
        Driver.getDriver().switchTo().activeElement().sendKeys("RenameFile" + Keys.ENTER);
        BrowserUtils.waitFor(2);

    }

    @Then("user sees RenameFile file in the all files section")
    public void userSeesRenameFileFileInTheAllFilesSection() {

        BrowserUtils.waitFor(2);
        Assert.assertEquals("RenameFile", filePage.renameFile.getText());

    }


    @And("user clicks Details icon")
    public void userClicksDetailsIcon() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(2);
        for (int i = 0; i < 6; i++) {
            js.executeScript("window.scrollBy(0,250)");
        }
        BrowserUtils.waitFor(2);
        int index = filePage.getFileIndex("US-0012-3");
        BrowserUtils.waitFor(2);
        filePage.threeDot(index).click();
        BrowserUtils.waitFor(2);
        filePage.details.click();
    }

    @And("user clicks on comments section")
    public void userClicksOnCommentsSection() {
        BrowserUtils.waitFor(2);
        filePage.commentsTabView.click();
    }

    @And("user enter {string} into comment box")
    public void userEnterIntoCommentBox(String comment) {
        filePage.commentBox.sendKeys(comment);
    }

    @And("user clicks on submit button")
    public void userClicksOnSubmitButton() {
        filePage.commentSubmit.click();
    }

    @Then("user can see the comment in comments section")
    public void userCanSeeTheCommentInCommentsSection() {
        BrowserUtils.waitFor(2);
        Assert.assertEquals("comment", filePage.commentMessage.getText());
    }





}
