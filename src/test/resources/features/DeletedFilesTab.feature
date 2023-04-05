
Feature:As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.

  Background:
    Given User is on the dashboard page

  Scenario: User can see the most recent deleted file in the first line of the deleted file list
  when deleted files are ordered by newest to oldest
    When user clicks on -Files- button
    And user clicks on -Deleted files- button
    And user clicks on -Deleted- button
    Then user should see the most recent deleted file in the first line
  @wip
  Scenario: User can order the all deleted files by newest to oldest or visa versa
    When user clicks on -Files- button
    And user clicks on -Deleted files- button
    And user clicks on -Deleted- button
    Then user should see the most recent deleted file in the first line
    And user clicks on -Name- button
    Then user should see the oldest deleted file in the first line