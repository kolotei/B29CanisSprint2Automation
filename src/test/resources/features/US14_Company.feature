Feature: Company Page access functionality

  Background: User is already on the login page
    Given the user is on the login page

  Scenario: Company page module verification
    Given the user logged in as "hr"
    When is on the company page
    Then user sees following modules on Company page
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)  |
      | More                 |