Feature: Customise page

  Background: User
    When user input "username" and "Password"
    And user clicks on Login button

  @Status
  Scenario: user should be able to see status widgets and select any of them
    When user clicks on Customise button
    And user sees the widgets
    Then user clicks on the widgets names

  @Background
  Scenario: user should be able to see the background images and select any of them
    When user clicks on Customise button
    And user sees the background images
    Then user selects the background images

