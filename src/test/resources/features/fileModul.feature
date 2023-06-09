Feature: As a user, I should be able to login.

  Background:
    Given User is on the dashboard page


  Scenario: User can upload a file
    When user clicks the "files" module
    And user click the plus icon
    And user clicks upload file
    And user selects any file
    Then user see uploaded file
    Then the user delete "load" uploaded file


  Scenario: User can create a new folder
    When user clicks the "files" module
    And user click the plus icon
    And user clicks New folder file
    Then click arrow icon
    Then user see New folder file
    Then the user delete "New folder" uploaded file


  Scenario: User can move or copy any selected item to any folder
    When user clicks the "files" module
    And user click the plus icon
    And user clicks New text document
    Then click arrow icon
    And user move or copy the document into the any folder
    Then user see the item in the selected folder
    Then the user delete "New text" uploaded file


  Scenario: User can delete any selected item from its three dots menu
    When user clicks the "files" module
    And user click the plus icon
    And user clicks New folder file
    Then click arrow icon
    Then user see New folder file
    Then the user delete "New folder" uploaded file
    Then user cannot sees deleted items

  Scenario:   User can see the total number of files and folders under the files list table
    When user clicks the "files" module
    And user click the plus icon
    And user clicks New folder file
    Then click arrow icon
    And user click the plus icon
    And user clicks New text document
    Then click arrow icon
    And user sees the number of the file and folder
    Then the user delete "New text" uploaded file
    Then the user delete "New folder" uploaded file




  Scenario: User can add any file in favorites folder as a favorite.
    When user clicks the "files" module
    Then user clicks the add to favorites icon
    Then user selects favorites button
    And user sees folder in the favorites section


















