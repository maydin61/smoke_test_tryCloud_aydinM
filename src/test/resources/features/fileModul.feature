Feature: As a user, I should be able to login.

  Background:
    Given User is on the dashboard page

@tab
  Scenario: User can upload a file
    When user clicks the "files" module
    And user click the plus icon
    And user clicks upload file
    And user selects any file
    Then user hit the open button


