
Feature: NextBase CRM upload files and images as messages functionality
  Agile story: As a user, I should be able ot upload files and pictures as messages

  Background: User is already in the log in page
    Given the user is on the login page
  @wip
  Scenario: Upload file and pictures to message functionality
  Given the user logged in as "hr"
    When user opens a new message
    And user clicks to upload files icon
    And user uploads desired file or image
    And user uploads .jpg .pdf .docx and .txt files
    Then user should see file or image successfully uploaded to message as attachment

@wip
  Scenario: Insert files and images into message text field functionality
    Given the user logged in as "hr"
    When user opens a new message
    And user clicks to upload files icon
    And user uploads desired file or image
    And user clicks to insert file or image into text
    Then user should see that file or image is successfully moved into text field

@wip
    Scenario: Remove files and images from message before sending
      Given the user logged in as "hr"
      When user opens a new message
      And user clicks to upload files icon
      And user uploads desired file or image
      And user clicks remove file or image icon
      Then user should see the file is successfully removed from message


