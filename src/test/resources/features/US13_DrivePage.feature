@us13
Feature: user should be able to access the Drive page

  Background: User is already in the log in page
    Given the user is on the login page

    Scenario: Verify the users view the 6 modules on the Drive page
      Given the user logged in as "hr"
      When user clicks the Drive button
      Then user can see the following modules on the Drive page
    |My Drive|
    |All Documents|
    |Company Drive|
    |Sales and Marketing|
    |Top Management's documents|
    |Drive Cleanup|