
Feature: As a user, I should be able to search file
  or contact from the Dashboard and see the photos under Photos Module

Background:
  Given User is on the dashboard page

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
      | files      | wer      |
      | photos     | jj       |
      | activity   | kk       |
      | talk       | 123      |
      | mail       | talk     |
      | contacts   | fghjk    |
      | circles    | 11       |
      | calendar   | ii       |
      | deck       | aa        |


  Scenario Outline: User can search contacts by clicking on the contacts icon and typing its name
    When user clicks contacts icon
    And types "<names>"
    Then user can see that specific contact
    Examples:
      | names   |
      | Nati    |
      | Akos    |
      | Huseyin |
      | Dursun  |
  @wip
  Scenario Outline: User can also see the images files under the Photos module when uploaded them
    When user navigates to Files module
    And user clicks plus button
    And user clicks upload a file option
    And user enters the "<path>" of a photo
    Then user navigates to Photos module
    And user should see the image file uploaded
    Examples:
      | path                              |
      | C:\Users\Nati\Downloads\CATS!.jpg |
      | C:\Users\Nati\Downloads\cats2.jpg |
      | C:\Users\Nati\Downloads\cats3.jpg |
      | C:\Users\Nati\Downloads\cats4.jpg |