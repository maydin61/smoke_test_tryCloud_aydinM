package com.project.pages;

import com.project.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TalkModulePage {
    public TalkModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement talkButton;

    @FindBy(xpath = "//button[@aria-label='Create a new group conversation']")
    public WebElement creatConversationPlusIcon;

    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement conversationNameInput;

    @FindBy(xpath ="//button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticipantButton;

    @FindBy(xpath = "//input[@placeholder='Search conversations or users']")
    public WebElement searchConversationInput;

    @FindBy(xpath = "//input[@placeholder='Search participants']")
    public WebElement searchParticipantsInput;

    @FindBy(xpath = "//div[@class='modal-container']//span")
    public List<WebElement> searchedParticipantNames;
    @FindBy(xpath = "//input[@placeholder='Add participants to the conversation']")
    public WebElement addParticipantInput;

    @FindBy(xpath = "//div[@class='acli__content']//span[@class='acli__content__line-one__title']")
    public List<WebElement> createdConversations;

    @FindBy(xpath = "//div[.='You created the conversation']")
    public WebElement youCreatedConversationText;
     String employeeName;

    @FindBy(xpath = "//div[text()='You added ']//h6")
    public List<WebElement> addedParticipants;

    @FindBy(xpath = "//a[@class='acli']/..")
    public WebElement alreadyCreatedConversation;

    @FindBy(xpath = "//div[text()='You added ']")
    public WebElement youAddedText;

    @FindBy(xpath = "//div[text()='You removed ']//h6")
    public List<WebElement> removedParticipants;
    @FindBy(xpath = "//span[@class='participant-row__user-name']")
    public List<WebElement> searchedParticipants;
    @FindBy(xpath = "//li[@class='participant-row offline']")
    public WebElement alreadyAddedParticipant;

    @FindBy(xpath = "//span[@class='icon icon-start-call']/..")
    public WebElement startCallButton;

    @FindBy(xpath = "//span[@class='icon icon-leave-call']/..")
    public WebElement leaveCallButton;

    @FindBy(xpath = "//div[.='You started a call']")
    public WebElement youStartedCallText;

    @FindBy(xpath = "//div[.='You left the call']")
    public WebElement youLeftCallText;

    @FindBy(xpath = "//video[@class='video video--fit']")
    public WebElement videoCamera;
    @FindBy(xpath = "//button[@aria-label='Conversation settings']")
    public WebElement conversationSettings;

    @FindBy(xpath = "//span[.='Delete conversation']/..")
    public WebElement deleteConversationButton;

    @FindBy(xpath = "//button[.='Yes']")
    public WebElement yesButton;

    @FindBy(xpath = "//h2[.='Delete conversation ']")
    public WebElement deleteConversationText;

    @FindBy(xpath = "//div[@placeholder='Write message, @ to mention someone …']")
    public WebElement messageInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//div[@class='rich-text--wrapper']")
    public WebElement messageInChat;


}
