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
      | dashboard  | 123      |
      | files      | wer      |
      | photos     | jj       |
      | activity   | kk       |
      | talk       | 123      |
      | mail       | talk     |
      | contacts   | fghjk    |
      | circles    | 11       |
      | calendar   | ii       |
      | deck       | aa       |


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

  Scenario Outline: User can navigate to the Dashboard page whenever clicking the TryCloud icon
  at the top left corner on the page
    Given user is under the "<moduleName>" module
    And user clicks the Trycloud icon
    Then user should be on the Dashboard page
    Examples:
      | moduleName |
      | dashboard  |
      | files      |
      | photos     |
      | activity   |
      | talk       |
      | mail       |
      | contacts   |
      | circles    |
      | calendar   |
      | deck       |
  @wip
    Scenario: User can also see the images files under the Photos module when uploaded them
      Given user is under the Files module
      When user clicks plus button
      And user clicks upload a file button
      Then user passes the path of the image


    Scenario Outline: User should be able to easily modify their search query as needed,
    and the system should update the results accordingly
      When user clicks magnifying glass
      And enters a "<search query1>" search query
      Then user clicks delete button
      And enters a new "<search query2>" search query
      Then user should see the last search query
      Examples:
        | search query1 | search query2 |
        | Akos          | Nati          |
        | talk          | readme        |
        | Huseyin       |               |
        | 123           | wer           |
        | ii            | Dursun        |
        | 11            |               |

