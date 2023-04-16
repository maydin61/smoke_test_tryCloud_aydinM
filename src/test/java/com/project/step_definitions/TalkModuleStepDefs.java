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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

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

    @And("user writes any participant name")
    public void userWritesAnyParticipant() {
        talkModulePage.addParticipantInput.sendKeys("Employee33");
    }



    @And("user adds that participant")
    public void userAddsThat() {
        for (WebElement searchedParticipant : talkModulePage.searchedParticipants) {
            searchedParticipant.click();
        }
    }

    @Then("user should be able to see that participant name after adding")
    public void userShouldBeAbleToSeeThat() {
        ArrayList<String> employeeNames = new ArrayList<>();
        for (WebElement participantName : talkModulePage.addedParticipants) {
            employeeNames.add(participantName.getText());
        }
        Assert.assertTrue(employeeNames.contains("Employee33"));
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
        }
        System.out.println(names);
        BrowserUtils.sleep(4);
        Assert.assertTrue(names.contains(conversationList));

    }

    @And("user clicks start call button")
    public void userClicksStartCallButton() {
        BrowserUtils.sleep(5);
        talkModulePage.startCallButton.click();
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
        System.out.println(talkModulePage.messageInChat.getText());
        Assert.assertTrue(talkModulePage.messageInChat.getText().equals("Hello, how is going?"));

    }
}
