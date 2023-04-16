@US-0012
Feature: As a user, I should be able to add a file to favorites,
  rename any file and give some comments on any file.
  Background:
    Given User is on the dashboard page

  Scenario: User can add any file to favorites from its own three dots menu
    When user clicks "Files" module
    And user clicks Add to Favorites icon
    And user clicks favorites button
    Then user sees file in the favorites section


  Scenario: User can rename any file from its own three dots menu
    When user clicks "Files" module
    And user clicks Rename icon
    And user enters file name RenameFile
    Then user sees RenameFile file in the all files section


  Scenario: User can put some comments on any file from the file details menu opened right side
    When user clicks "Files" module
    And user clicks Details icon
    And user clicks on comments section
    And user enter "comment" into comment box
    And user clicks on submit button
    Then user can see the comment in comments section


  Scenario: User can delete the comments made on any file from the the file details menu opened rigth side

    When user clicks "Files" module
    And user clicks Details icon
    And user clicks on comments section
    And user clicks three dots on comment
    And user deletes comment

