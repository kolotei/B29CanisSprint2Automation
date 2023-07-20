@Company
Feature:Company Structure functionality
	User Story As a user, I should be able to use functions on Company Structure under Employee menu.

	Scenario: All user types can display company structure
		Given user is on the homepage
		When user enter username "helpdesk27@cybertekschool.com"
		And user enter password "UserUser"
		And user click in sign in button
		And User go to Employee Page
		Then user should be able to see Company Structure on the page

	Scenario: HR user adds a department to the company structure
		Given user is on the homepage
		When user enter username "hr67@cybertekschool.com"
		And user enter password "UserUser"
		When user click the "Add Department" option
		And user fill in the required department details
		And user submit the form
		Then user should see new department is added to the company structure


	Scenario: Helpdesk user does not have "Add Department" option
		When user enter username "helpdesk27@cybertekschool.com"
		And user enter password "UserUser"
		And user click in sign in button
		Then user verify Add Department is not displayed

	Scenario: Marketing user does not have "Add Department" option
		When user enter username "helpdesk27@cybertekschool.com"
		And user enter password "UserUser"
		And user click in sign in button
		Then user verify Add Department is not displayed
	

