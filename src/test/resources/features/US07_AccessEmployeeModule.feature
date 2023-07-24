@US07
Feature: NextBase CRM Employees module functionality
  User Story: As a user, I want to access the Employees page.

  Background: User is already on the log in page
    Given the user is on the login page

  Scenario: Users should be able to see 8 modules on the Employee page
    Given the user logged in as "hr"
    When user clicks on Employee module
    Then user is able to see expected modules on the Employee page

  Scenario: Users should be able to see Company Structure by default on the Employee page
    Given the user logged in as "hr"
    When user clicks on Employee module
    Then user is able to see Company Structure by default