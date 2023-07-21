Feature: Sending message in Active Stream feature
  User Story:

  As a user, I should be able to send messages by clicking on Message tab under Activity Stream.

  Background: User is already in the log in page
    Given the user is on the login page
@TC1D
    Scenario: verify user should be able send a message by filling in the mandatory fields 'Message content & 'Recipient'
   When user navigate to "url"
      Given user logged in as "marketing"
      When user clicks on MESSAGE button
      And  user see message field collapse
      Then user clicks Send button without typing a message
      Then user get error message: The message title is not specified
      And  user type a message in Message field
      And  user delete the default recipients to  All employees
      Then user click SEND button
      Then user get error message: Please specify at least one person.
      And  user see default settings appeared on the page
      Then user click SEND button
      And  user see message displayed under Activity Stream

  @TC2
  Scenario: verify user sees the message delivery should be to 'All employees' by default.
    Given user logged in as "helpdesk"
    When  user click MESSAGE tab
    Then  user see delivery to All employees


    @TC3
    Scenario: verify user is able to cancel sending messages at any time before sending
      Given user logged in as "hr"
      When  user click MESSAGE tab
      And   user type a Message
      Then  user click Cancel
      And   user sees message Canceled to send.








