@us9
Feature: user should be able to access the Drive page

  Background: User is already in the log in page
    Given the user is on the login page

    Scenario: Verify users view the options on Activity stream page
      Given the user logged in as "hr"
      Then user can view the following options on Activity stream page
    |MESSAGE|
    |TASK   |
    |EVENT  |
    |POLL   |
    |MORE   |

      Scenario: Verify users view the 4 options under the MORE tab
        Given the user logged in as "hr"
        When user clicks the MORE tab
        Then user can view the following options under the MORE tab:
      |File|
      |Appreciation|
      |Announcement|
      |Workflow    |