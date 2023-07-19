
Feature: NextBase CRM upload files and images as messages functionality
  Agile story: As a user, I should be able ot upload files and pictures as messages

  Background: User is already on the homepage
    Given user is already on the homepage
@wip
  Scenario: Upload file and pictures to message functionality
    When user opens a new message
    And user clicks to upload files icon
    And user clicks to upload files and images button
    And user selects desired file or image to upload
    Then user should see file or image successfully uploaded to message as attachment


  Scenario: Insert files and images into message text field functionality
    When user uploads a file or image
    And user clicks to insert file or image into text
    Then user should see that file or image is successfully moved into text field


    Scenario: Remove files and images from message before sending
      When user uploads a file or image
      And user clicks remove file or image icon
      Then user should see the file is successfully removed from message


