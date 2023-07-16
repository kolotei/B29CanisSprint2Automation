Feature: Login feature

  @HelpDeskUser
  Scenario Login as a helpDeskUser
    Given I am on the login page
    When I login as a helpDeskUser
    Then dashboard should be displayed


