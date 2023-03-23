@TCLOUD10-436
Feature: As a user, I should be able to log out.


  Background:
     Given User is on the dashboard page
@TCLOUD10-432
  Scenario: User can log out and ends up in login page
    When user clicks on -E- button
    And user clicks on -Logout- button
    Then user should be on the login page
@TCLOUD10-433
  Scenario: User can not go to home page again by clicking step back button after successfully logged out.
    When user clicks on -E- button
    And user clicks on -Logout- button
    And user clicks -Step Back- button
    Then user is still on login page