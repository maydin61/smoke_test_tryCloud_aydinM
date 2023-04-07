
Feature: As a user, I should be able to create a new group and
          add any contact into a group under Contacts module

   Acceptance Criteria:

   User can create a new group under Contacts Module
   User can add any existing contact from the groups dropdown menu existing inside that specific contact’s own info menu
   User can see all the available groups name through the groups dropdown menu existing in the contact’s own info menu
   User can add a new property as “Birthday” to the contact’s info page from the “Add new property” dropdown menu
   Delete this line and write your own AC.

  Background:
    Given User is on the dashboard page
    When user should able to click to -Contacts icon- on dashboard page, then go Contacts module page


  Scenario Outline: AC01 User can create a new group under Contacts Module

    When user should able to click to -Contacts icon- on dashboard page, then go Contacts module page
    Then user should able to click to -New group- text or -plus sing- to creat a New group
    And Create a New group text input box should becomes visible
    And user should able to type a "<New group>" name in to input box and while clicking arrow icon creat a new group
    And user should able to add new Contacts from -Add contact- while clicking -...- icon

    Examples: New group names to add tryCloud, Contact Module
      | New group  |
    #  | Group22    |
      | Group_28   |
   #   | Group EU10 |



  Scenario: AC02 User can add any existing contact from the groups dropdown menu existing
                  inside that specific contact’s own info menu

    When the user clicks on the contacts page, the formed -New Group- 3 dots icon should able to open dropdown menu
    Then The usr should able to click - + Add contacts-
    And The user should able to see -Search Contacts- and -all contacts- listed
    And the user should be able to select -select Contacts-
    And the user should be able to click to -Add to group- button
    And all the selectted contacts should able to be selected and added to the group

  Scenario: AC03 User can see all the available groups name through the groups dropdown menu existing
  in the contact’s own info menu

   # When user should able to click to -Contacts icon- on dashboard page, then go Contacts module page
  #  Then user should able to -avaible group names- in -Groups Name- dropdown menu

  @aydin
  Scenario: AC04 User can add a new property as “Birthday” to the contact’s info page from the “Add new property” dropdown menu

   # When user should able to click to -Contacts icon- on dashboard page, then go Contacts module page
    Then user should able  to see -Add new property- text on Contact Module page
    And   user should able to see -Choose property type- input span
    And user should able to see the drop down menu while clicking -Choose property type- span
    And user should able to add a new property as "Birthday" from dro[down menu


  Scenario: AC05 Delete this line and write your own AC.

