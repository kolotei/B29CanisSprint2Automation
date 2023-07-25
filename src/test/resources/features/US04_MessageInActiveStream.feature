@US4

Feature: Sending message in Active Stream feature
  User Story:

  As a user, I should be able to send messages by clicking on Message tab under Activity Stream.

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: verify user gets error  message without filling the Message content  fields

    Given the user logged in as "hr"
    When user clicks  MESSAGE button
    And  user see message field collapse
    Then user clicks Send button without typing a message
    Then user get error message: The message title is not specified



  Scenario: verify user gets error  message after deleting Recipient
    Given the user logged in as "help desk"
    When user clicks  MESSAGE button
    And  user see message field collapse
    And  user delete the default recipients to  All employees
    Then user clicks Send button
    Then Then user get error message: Please specify at least one person.


  Scenario: verify user sees the message delivery should be to 'All employees' by default.
    Given the user logged in as "marketing"
    When  user clicks  MESSAGE button
    And user see message field collapse
    Then  user see delivery to All employees


  Scenario: verify user is able to cancel sending messages at any time before sending
    Given the user logged in as "hr"
    When user clicks  MESSAGE button
    And  user see message field collapse
    Then  user click Cancel









