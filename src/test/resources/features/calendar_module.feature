@wipHuseyin
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