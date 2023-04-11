Feature: Customise page

  Background: User
    When user input "username" and "Password"
    And user clicks on Login button

  @Status
  Scenario: user should be able to see status widgets and select any of them
    When user clicks on Customise button
    And user sees the widgets
    Then user clicks on the widgets names


  Scenario: user should be able to see the background images and select any of them
    When user clicks on Customise button
    And user sees the background images
    Then user selects the background images

#      | //button[@tabindex='0'][1]  |
#      | //button[@tabindex='0'][2]  |
#      | //button[@tabindex='0'][3]  |
#      | //button[@tabindex='0'][3]  |
#      | //button[@tabindex='0'][4]  |
#      | //button[@tabindex='0'][5]  |
#      | //button[@tabindex='0'][6]  |
#      | //button[@tabindex='0'][7]  |
#      | //button[@tabindex='0'][8]  |
#      | //button[@tabindex='0'][9]  |
#      | //button[@tabindex='0'][10] |
#      | //button[@tabindex='0'][11] |
#      | //button[@tabindex='0'][12] |
#      | //button[@tabindex='0'][13] |
#      | //button[@tabindex='0'][14] |
#      | //button[@tabindex='0'][15] |
#      | //button[@tabindex='0'][16] |
#      | //button[@tabindex='0'][17] |
#      | //button[@tabindex='0'][18] |

