@B29G10-241
Feature: As a user, I should be able to upload files and pictures while sending appreciation

User story: User should be able to upload files and pictures.
(Supported file formats .pdf, .txt, .jpeg, .png, .docx)

Acceptance Criteria:
AC1. User should be able to insert the files and images into the text
AC2. User should be able to remove files and images at any time before sending.

Background: User logged in as HR
Given the user is on the login page
	
	@B29G10-238
	Scenario Outline: User should be able to insert the files and images into the text
		When the user logged in as "<user name>"
		    And User navigate to ActiveStream
		    And User navigates to Appreciation message box
		    And User click on File upload option
		    And User uploads files into the message
		      | src/test/resources/fileToUpload/CalendarPNG.png   |
		      | src/test/resources/fileToUpload/PictureJPEG.jpg   |
		      | src/test/resources/fileToUpload/TestFileDOCX.docx |
		      | src/test/resources/fileToUpload/TestFilePDF.pdf   |
		      | src/test/resources/fileToUpload/TestFileTXT.txt   |
		    Then User inserts files into the body of the message
		
		    Examples:
		    |user name         |
		    |hr                |
		    |help desk         |
		    |marketing         |	

	@B29G10-240
	Scenario Outline: User should be able to remove files and images at any time before sending.
		And the user logged in as "<user name>"
		    And User navigate to ActiveStream
		    And User navigates to Appreciation message box
		    Then User click on File upload option
		    When User uploads files into the message
		      | src/test/resources/fileToUpload/CalendarPNG.png   |
		      #| src/test/resources/fileToUpload/PictureJPEG.jpg   |
		      #| src/test/resources/fileToUpload/TestFileDOCX.docx |
		      #| src/test/resources/fileToUpload/TestFilePDF.pdf   |
		      #| src/test/resources/fileToUpload/TestFileTXT.txt   |
		    Then User delete file from `Attached files` section
		
		    Examples:
		      |user name         |
		      |hr                |
		      |help desk         |
		      |marketing         |