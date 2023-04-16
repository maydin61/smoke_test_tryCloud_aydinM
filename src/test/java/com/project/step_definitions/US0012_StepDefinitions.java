package com.project.step_definitions;

import com.project.pages.US0012_FilePage;
import com.project.utilites.BrowserUtils;
import com.project.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US0012_StepDefinitions {

    US0012_FilePage filePage = new US0012_FilePage();

    @When("user clicks {string} module")
    public void userClicksModule(String modul) {
        filePage.navigateModul(modul).click();
    }

    @And("user clicks Add to Favorites icon")
    public void userClicksAddToFavoritesIcon() {
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
    }

    @Then("user sees file in the favorites section")
    public void userSeesFileInTheFavoritesSection() {
        System.out.println(filePage.file1.getText());

        //Assert.assertEquals("US-0012-1", filePage.file1.getText());
    }

}
