Feature: Company Page access functionality

  Background: User is already on the login page
    Given user is on the login page

    Scenario: Company page module verification
      Given the user logged in as "hr"
      When is on the company page
      Then user should see all modules displayed as expected

