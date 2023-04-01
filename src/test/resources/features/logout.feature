
Feature: As a user, I should be able to log out.


  Background:
     Given User is on the dashboard page

  Scenario: User can log out and ends up in login page
    When user clicks on -E- button
    And user clicks on -Logout- button
    Then user should be on the login page

  Scenario: User can not go to home page again by clicking step back button after successfully logged out.
    When user clicks on -E- button
    And user clicks on -Logout- button
    And user clicks -Step Back- button
    Then user is still on login page