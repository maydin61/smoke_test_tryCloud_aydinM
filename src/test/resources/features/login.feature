Feature: As a user, I should be able to login.

  Background:
    Given User is on the login page.

  @wip
  Scenario: User can login with valid credentials.
    When user enters valid username
    And user enters valid password
    And user clicks on Login button
    Then user should see the dashboard