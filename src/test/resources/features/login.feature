Feature: As a user, I should be able to login.

  Background:
    Given User is on the login page.


  Scenario: User can login with valid credentials.
    When user enters valid username
    And user enters valid password
    And user clicks on Login button
    Then user should see the dashboard

  Scenario: User can login with valid credentials.
    When user enters valid username
    And user enters valid password
    And user hits ENTER key from keyboard
    Then user should see the dashboard
@wip
  Scenario Outline: User can not login with any invalid credentials
    When user enters invalid "<username>"
    And user enters valid password
    And user clicks on Login button
    Then user should see -Wrong username or password.-
  Examples:username values we are going to use in this scenario
           |username|
           |Employee1055|
           |Employee1145|
           |Employeeeee105|


  Scenario: User can not login with any invalid credentials
    When user enters valid username
    And user enters invalid password
    And user clicks on Login button
    Then user should see -Wrong username or password.-

  Scenario: User can not login with any invalid credentials
    When user enters invalid username
    And user enters invalid password
    And user clicks on Login button
    Then user should see -Wrong username or password.-

  Scenario: User can not login with any invalid credentials
    When user leaves username empty
    And user enters valid password
    And user clicks on Login button
    Then user should see -Please fill out this field- message
@wip
  Scenario: User can not login with any invalid credentials
    When user enters valid username
    And user leaves password empty
    And user clicks on Login button
    Then user should see -Please fill out this field- message