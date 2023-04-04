@wip
Feature: As a user, I should be able to search file
  or contact from the Dashboard and see the photos under Photos Module

  Scenario Outline: User can search file typing its name through the magnifying glass
  icon inside any Module and see the details side page of the file when clicked on it.
    Given user is under the "<moduleName>" module
    When user clicks magnifying glass
    And user enters "<fileName>" file name
    And user clicks the file
    Then user should see the details side page of the file
    Examples:
      | moduleName | fileName |
      | dashboard  | talk     |
      | files      | talk     |
      | photos     | talk     |
      | activity   | talk     |
      | talk       | talk     |
      | mail       | talk     |
      | contacts   | talk     |
      | circles    | talk     |
      | calendar   | talk     |
      | deck       | talk     |
