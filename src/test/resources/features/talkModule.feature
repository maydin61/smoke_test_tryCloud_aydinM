@TCLOUD10-549
Feature: talk module feature for try cloud project

  Background:
    Given User is on the dashboard page

  @TCLOUD10-543
  Scenario:User can create a new conversation
    When user clicks talk module button
    And user clicks create conversation plus button
    And user writes conversation name
    And user clicks add participant button
    And user clicks create conversation button
    Then you created conversation text should be displayed on the left side of the page

  @TCLOUD10-544
  Scenario: User can add any selected participant to any conversation
    When user clicks talk module button
    And  user chooses any created conversation
    And user writes any participant name
    And user adds that participant
    Then user should be able to see that participant name after adding

  @TCLOUD10-545
  Scenario Outline:Display all conversation list under the Talk module
    When user clicks talk module button
    And user clicks create conversation plus button
    And user writes the "<name>" of conversations
    And user clicks add participant button
    And user clicks create conversation button
    Then all "<conversations_list>" should be displayed under the Talk module

    Examples:
      | name  | conversations_list |
      | conv1 | conv1              |
      | conv2 | conv2              |
      | conv3 | conv3              |

  @TCLOUD10-546
  Scenario: User can start a call with any participant and leave the call
    When user clicks talk module button
    And user chooses any created conversation
    And user clicks start call button
    Then user should see started call text
    And user clicks leave call button
    Then user should see left call text

  @TCLOUD10-547
  Scenario: User can delete a conversation
    When user clicks talk module button
    And user chooses any created conversation
    And user click conversation setting button
    And user clicks delete conversation button
    And user clicks yes button and conversation should be deleted

  @TCLOUD10-548
  Scenario: User can send a message in any conversation
    When user clicks talk module button
    And user chooses any created conversation
    And user writes any message
    And user sends message
    Then user should see that message in chat
