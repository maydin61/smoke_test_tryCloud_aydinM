
Feature: Calendar Module Functionality

  User story: As a user, I should be able to see Daily-Weekly-Monthly calendar view
  and create a new event under the Calendar module


  Background:
    Given user already logged in and on the calendar module


  Scenario Outline: User can display daily,Weekly and Monthly calendar view
    When user clicks view menu square on the left side
    Then user clicks "<calendar view type>" on the left
    Then user see "<calendar view type's name>" in the URL

    Examples:
      | calendar view type | calendar view type's name |
      | Day                | Day                       |
      | Week               | Week                      |
      | Month              | Month                     |



  @wipHuseyin
  Scenario: User can create a new event under the Calendar module
  and see it on the related day through the Monthly Calendar view

    When user clicks new event button
    Then user enters event title
    And user clicks save button
    Then user clicks view menu square on the left side
    And user clicks Monthly view option
    Then user verify that event created

  @wipHuseyin
  Scenario: User can delete any event through the Monthly Calendar view
  by clicking on the event and then using “more” option

    When user clicks new event button
    Then user enters new event title
    And user clicks save button
    Then user clicks view menu square on the left side
    And user clicks Monthly view option
    Then user clicks on new created event
    And user clicks on more button
    Then user clicks on menu icon
    Then user clicks on delete button
    Then user verify that event deleted from calendar



