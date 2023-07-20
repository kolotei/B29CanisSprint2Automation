Feature: Company Page access functionality

  Background: User is already on the homepage
    Given user is already on the homepage

    Scenario: Company page module verification
      Given user is on the company page
      Then user should see all modules displayed as expected

