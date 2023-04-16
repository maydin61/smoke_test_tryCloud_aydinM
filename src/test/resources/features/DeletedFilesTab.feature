
Feature:As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.

  Background:
    Given User is on the dashboard page

  Scenario: User can see the most recent deleted file in the first line of the deleted file list
  when deleted files are ordered by newest to oldest
    When user clicks on -Files- button
    And user clicks on -Deleted files- button
    And user clicks on -Deleted- button
    Then user should see the most recent deleted file in the first line

  Scenario: User can order the all deleted files by newest to oldest or visa versa
    When user clicks on -Files- button
    And user clicks on -Deleted files- button
    And user clicks on -Deleted- button
    Then user should see the most recent deleted file in the first line
    And user clicks on -Deleted- button again
    Then user should see the oldest deleted file in the first line

  Scenario: User can order alphabetically all the deleted files based on their names
    When user clicks on -Files- button
    And user clicks on -Deleted files- button
    And user clicks on -Name- button
    Then user should see all the deleted files alphabetically ordered

  Scenario: User can delete any deleted file permanently by using the three dots icon in the file’s line
    When user clicks on -Files- button
    And user clicks on -Deleted files- button
    And user clicks on -Three dots- icon in any file line
    Then user should be able to click on -Delete permanently- button

  Scenario: User can restore any deleted file and see it again under the All Files tab
    When user clicks on -Files- button
    And user clicks on -Deleted files- button
    Then user selects a file
    And user clicks on -Restore- button
    Then user should be able to see the file under -All Files- tab
@
  Scenario: User can restore a file using the Actions button
    When user clicks on -Files- button
    And user clicks on -Deleted files- button
    Then user selects the first file
    And user clicks -Actions- button
    And user clicks on Restore button under Actions
    Then user should be able to see the file under -All Files- tab