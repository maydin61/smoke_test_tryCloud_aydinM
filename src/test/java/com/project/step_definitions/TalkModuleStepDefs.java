package com.project.step_definitions;

import com.project.pages.TalkModulePage;
import com.project.utilites.BrowserUtils;
import com.project.utilites.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TalkModuleStepDefs {
    TalkModulePage talkModulePage = new TalkModulePage();
    @When("user clicks talk module button")
    public void user_clicks_talk_module_button() {
        talkModulePage.talkButton.click();
    }
    @When("user clicks create conversation plus button")
    public void user_clicks_create_conversation_plus_button() {
        talkModulePage.creatConversationPlusIcon.click();
    }
    @When("user writes conversation name")
    public void user_writes_conversation_name() {
        talkModulePage.conversationNameInput.sendKeys("gossiping");
    }
    @When("user clicks add participant button")
    public void user_clicks_add_participant_button() {
        talkModulePage.addParticipantButton.click();
    }
    @When("user clicks create conversation button")
    public void user_clicks_create_conversation_button() {
        talkModulePage.addParticipantButton.click();
    }
    @Then("you created conversation text should be displayed on the left side of the page")
    public void you_created_conversation_text_should_be_displayed_on_the_left_side_of_the_page() {
        Assert.assertTrue(talkModulePage.youCreatedConversationText.isDisplayed());
    }

    @And("user chooses any created conversation")
    public void userClicksAnyCreatedConversation() {
        talkModulePage.alreadyCreatedConversation.click();
    }

    @And("user writes any participant {string}")
    public void userWritesAnyParticipant(String participantName) {
        talkModulePage.addParticipantInput.sendKeys(participantName);
    }



    @And("user adds that {string}")
    public void userAddsThat(String participant) {
        for (WebElement searchedParticipant : talkModulePage.searchedParticipants) {

            if (searchedParticipant.getText().equals(participant)) {
                searchedParticipant.click();
            }
        }
    }

    @Then("user should be able to see that {string} after adding")
    public void userShouldBeAbleToSeeThat(String addedParticipantName) {
        for (WebElement participantName : talkModulePage.addedParticipants) {
//            BrowserUtils.sleep(2);
//            ArrayList<String> names = new ArrayList<String>();
//            names.add(participantName.getText());
//
//            System.out.println(names);
        }
    }

    @And("user writes the {string} of conversations")
    public void userWritesTheOfConversations(String conversationName) {
        talkModulePage.conversationNameInput.sendKeys(conversationName);
    }



    @Then("all {string} should be displayed under the Talk module")
    public void allShouldBeDisplayedUnderTheTalkModule(String conversationList) {
        ArrayList<String> names = new ArrayList<>();
        for (WebElement createdConversation : talkModulePage.createdConversations) {
            names.add(createdConversation.getText());
            if (createdConversation.getText().equals(conversationList)){
                System.out.println(conversationList);
                System.out.println(createdConversation.getText());
            }
        }

    }

    @And("user clicks start call button")
    public void userClicksStartCallButton() {
        BrowserUtils.sleep(5);
        talkModulePage.startCallButton.click();
        BrowserUtils.sleep(5);
        Driver.getDriver().switchTo().alert().accept();
//        alert.accept();
    }

    @Then("user should see started call text")
    public void userShouldSeeStartedCallText() {
        System.out.println(talkModulePage.youStartedCallText);
        Assert.assertTrue(talkModulePage.youStartedCallText.isDisplayed());
    }

    @And("user clicks leave call button")
    public void userClicksLeaveCallButton() {
        BrowserUtils.sleep(5);
        talkModulePage.leaveCallButton.click();
    }

    @Then("user should see left call text")
    public void userShouldSeeLeftCallText() {
        System.out.println(talkModulePage.youLeftCallText);
        Assert.assertTrue(talkModulePage.youLeftCallText.isDisplayed());
    }

    @And("user click conversation setting button")
    public void userClickConversationSettingButton() {
        talkModulePage.conversationSettings.click();
    }

    @And("user clicks delete conversation button")
    public void userClicksDeleteConversationButton() {
        talkModulePage.deleteConversationButton.click();
    }

    @And("user clicks yes button and conversation should be deleted")
    public void userClicksYesButton() {
        talkModulePage.yesButton.click();
    }

    @Then("this conversation should be deleted")
    public void thisConversationShouldBeDeleted() {
//        System.out.println("deleted");
    }

    @And("user writes any message")
    public void userWritesAnyMessage() {
        talkModulePage.messageInput.sendKeys("Hello, how is going?");
    }

    @And("user sends message")
    public void userSendsMessage() {
        BrowserUtils.sleep(4);
        talkModulePage.sendMessageButton.click();
    }

    @Then("user should see that message in chat")
    public void userShouldSeeThatMessageInChat() {
        Assert.assertTrue(talkModulePage.messageInChat.isDisplayed());
    }
}
