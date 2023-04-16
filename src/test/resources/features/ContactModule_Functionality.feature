@TCLOUD10-520
Feature: As a user, I should be able to create a new group and
          add any contact into a group under Contacts module

   Acceptance Criteria:

          1-User can create a new group under Contacts Module
          2-User can add any existing contact from the groups dropdown menu existing inside that specific contact’s own info menu
          3-User can see all the available groups name through the groups dropdown menu existing in the contact’s own info menu
          4-User can add a new property as “Birthday” to the contact’s info page from the “Add new property” dropdown menu
          5-Add the person to my Contact list as a new user with the required personal information

  Background:
    Given User is on the dashboard page
    When user should able to click to -Contacts icon- on dashboard page, then go Contacts module page

  @TCLOUD10-515
  Scenario Outline: AC01- User can create a new group under Contacts Module

    When user should able to click to -Contacts icon- on dashboard page, then go Contacts module page
    Then user should able to click to -New group- text or -plus sing- to creat a New group
    And Create a New group text input box should becomes visible
    And user should able to type a "<New group>" name in to input box and while clicking arrow icon creat a new group
  #  And user should able to add new Contacts from -Add contact- while clicking -...- icon

    Examples: New group names to add tryCloud, Contact Module
      | New group  |
     #| Group_28   |
     #| Group EU10 |
      | Group22    |

  @TCLOUD10-516
  Scenario: AC02- User can add any existing contact from the groups dropdown menu existing
                  inside that specific contact own info menu
    When the user can add a new contact to his or her group selected
    Then The user should able to click - + Add contacts-
    And The user should able to see -Search Contacts- and -all contacts- listed
    And the user should be able to click to -Add to group- button any contacts to add its own info menu

  @TCLOUD10-517
  Scenario: AC03- User can see all the available groups name through the groups dropdown menu existing
                  in the contact’s own info menu

    When the user clicks to plus button
    Then the user can see "Creat a new group" text in the box
    And the user can enter new group name "Group EU10" in to the box
    And the user can click all contacts button
    Then the user can click any contact and add it to "Group EU10" group
    And the user should able to see the all group names


  @TCLOUD10-518
  Scenario: AC04 User can add a new property as “Birthday” to the contact’s info page from the “Add new property” dropdown menu

    # When user should able to click to -Contacts icon- on dashboard page, then go Contacts module page
    Then user should able  to see -Add new property- text on Contact Module page
    And  user should able to see -Choose property type- input span
    And user should able to see the drop down menu while clicking -Choose property type- span
    And user should able to add a new property as "Birthday" from dro[down menu


  @TCLOUD10-519
  Scenario: AC05- Add the person to my -Contact- list as a new user with the required personal information

    Given the user can see on contact page -New Contact- text
    Then the user can input -full name- of new contact
    And the user can add -Company-
    And the user can add -Title-
    And the user can add -work- -Phone-
    And the user can add -Home- -Post office box-
    And the user can add -Home- -Address-
    And the user can add -Home- -Extended address-
    And the user can add -Home- -Postal code-
    And the user can add -Home- -City-
    And the user can add -Home- -State or Province-
    And the user can add -Home- -Country-