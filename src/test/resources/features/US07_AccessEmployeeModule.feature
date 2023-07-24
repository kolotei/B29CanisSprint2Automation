@US07
Feature:  US-7 As a user, I want to access the Employees page.

  Background: User logs in with valid credentials
    Given the user is on the login page
    Given the user logged in as "hr"

  Scenario: Users should be able to see 8 modules on the Employee page
    When user clicks on Employee module
    Then user is able to see expected modules on the Employee page
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

  Scenario: Users should be able to see Company Structure by default on the Employee page
    When user clicks on Employee module
    Then user is able to see Company Structure by default