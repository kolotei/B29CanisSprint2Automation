@company
Feature:Company Structure functionality
	User Story As a user, I should be able to use functions on Company Structure under Employee menu.

	Background: User is already on the log in page
		Given the user is on the login page

	Scenario: All user types can display company structure
		Given the user logged in as "hr"
		And User go to Employee Page
		Then user should be able to see Company Structure on the page

	Scenario: HR user adds a department to the company structure
		Given the user logged in as "hr"
		When user click the "Add Department" option
		And user fill in the required department details
		And user submit the form
		Then user should see new department is added to the company structure


	Scenario: Helpdesk user does not have "Add Department" option
		Given the user logged in as "help desk"
		Then user verify Add Department is not displayed

	Scenario: Marketing user does not have "Add Department" option
		Given the user logged in as "marketing"
		Then user verify Add Department is not displayed
	

