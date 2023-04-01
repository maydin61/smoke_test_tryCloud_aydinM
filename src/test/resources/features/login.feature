
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

  Scenario: User can not login with any invalid credentials
    When user enters valid username
    And user leaves password empty
    And user clicks on Login button
    Then user should see -Please fill out this field- message

  Scenario Outline: User can not login with any invalid credentials
    When user enters invalid "<username>"
    And user enters valid password
    And user clicks on Login button
    Then user should see -Wrong username or password.-
    Examples:username values we are going to use in this scenario
      |username|
      |employee105|
      |EmployEe105|
      |EMPLOYEE105|

  Scenario: User can see the password in a form of dots by default
    When user enters password
    Then user should see password in form of dots

  Scenario: User can see the password explicitly if needed
    When user enters password
    And user clicks on EYE button
    Then user should see password explicitly

  Scenario: User can see the "Forgot password?" link on the login page and can see the "Reset password" button
  on the next page after clicking on forget password link
    When user can see -Forgot password?-
    And user clicks on -Forgot password?-
    Then user can see -Reset password-

  Scenario: User can see valid placeholders on Username and Password fields
    Then user can see valid placeholders