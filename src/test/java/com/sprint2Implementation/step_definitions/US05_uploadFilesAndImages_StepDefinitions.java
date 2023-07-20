package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.US05_MessagePage;
import com.sprint2Implementation.utilities.ConfigurationReader;
import com.sprint2Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

public class US05_uploadFilesAndImages_StepDefinitions {
    US05_MessagePage messagePage = new US05_MessagePage();
    LoginStepDefs loginStepDefs = new LoginStepDefs();
    @Given("user is already on the homepage")
    public void user_is_already_on_the_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginStepDefs.the_user_logged_in_with_username_as_and_password_as("hr11@cybertekschool.com", "UserUser");
    }
    @When("user opens a new message")
    public void user_opens_a_new_message() {
        messagePage.messageBtn.click();
    }
    @When("user clicks to upload files icon")
    public void user_clicks_to_upload_files_icon() {
        messagePage.uploadFileBtn.click();
    }
    @When("user clicks to upload files and images button")
    public void user_clicks_to_upload_files_and_images_button() {
    //TODO FIGURE OUT IF WE NEED ROBOT FOR THIS AND NEXT STEP
        messagePage.UploadFileAndImageBtn.sendKeys("/Users/maggie/Downloads/Day 12 Class Notes.txt");
    }
    @When("user selects desired file or image to upload")
    public void user_selects_desired_file_or_image_to_upload() throws AWTException {
//TODO FIGURE OUT IF WE NEED ROBOT FOR THIS AND ABOVE STEP
        Robot robot = new Robot();

    }
    @Then("user should see file or image successfully uploaded to message as attachment")
    public void user_should_see_file_or_image_successfully_uploaded_to_message_as_attachment() {

    }

    @When("user uploads a file or image")
    public void user_uploads_a_file_or_image() {

    }

    @When("user clicks to insert file or image into text")
    public void user_clicks_to_insert_file_or_image_into_text() {
    messagePage.insertInTextBtn.click();
    }
    @Then("user should see that file or image is successfully moved into text field")
    public void user_should_see_that_file_or_image_is_successfully_moved_into_text_field() {

    }

    @When("user clicks remove file or image icon")
    public void user_clicks_remove_file_or_image_icon() {
    messagePage.deleteFileBtn.click();
    }
    @Then("user should see the file is successfully removed from message")
    public void user_should_see_the_file_is_successfully_removed_from_message() {

    }

}
