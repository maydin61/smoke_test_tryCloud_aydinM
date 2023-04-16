Feature: talk module feature for try cloud project

  Background:
    Given User is on the dashboard page


  Scenario:User can create a new conversation
    When user clicks talk module button
    And user clicks create conversation plus button
    And user writes conversation name
    And user clicks add participant button
    And user clicks create conversation button
    Then you created conversation text should be displayed on the left side of the page


  Scenario Outline:User can add any selected participant to any conversation
    When user clicks talk module button
    And  user chooses any created conversation
    And user writes any participant "<name>"
    And user adds that "<participant>"
    Then user should be able to see that "<participant name>" after adding
#    it works even in negative scenario

    Examples:
      | name       | participant | participant name |
      | Employee73 | Employee73  | Employee73       |
      | Employee54 | Employee54  | Employee54       |
      | Employee1  | Employee1   | Employee61     |

  @talk
  Scenario Outline:Display all conversation list under the Talk module
    When user clicks talk module button
    And user clicks create conversation plus button
    And user writes the "<name>" of conversations
    And user clicks add participant button
    And user clicks create conversation button
    Then all "<conversations_list>" should be displayed under the Talk module
#    it works in all cases((((

    Examples:
      | name        | conversations_list |
      | gossip      | gossip             |
      | birthday    | birthday           |
      | examination | examination        |


#    it works manually
  Scenario: User can start a call with any participant and leave the call
    When user clicks talk module button
    And user chooses any created conversation
    And user clicks start call button
    Then user should see started call text
#    need to allow camera and microphone
    And user clicks leave call button
    Then user should see left call text


  Scenario: User can delete a conversation
    When user clicks talk module button
    And user chooses any created conversation
    And user click conversation setting button
    And user clicks delete conversation button
    And user clicks yes button and conversation should be deleted
#    Then this conversation should be deleted
#    it works but how can I verify it was deleted in the last step?

  Scenario: User can send a message in any conversation
    When user clicks talk module button
    And user chooses any created conversation
    And user writes any message
    And user sends message
    Then user should see that message in chat
#   last TC