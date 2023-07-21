package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.MessagePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_uploadFilesAndImages_StepDefinitions {
    MessagePage messagePage = new MessagePage();

    @When("user opens a new message")
    public void user_opens_a_new_message() {
        messagePage.messageBtn.click();
    }
    @When("user clicks to upload files icon")
    public void user_clicks_to_upload_files_icon() {
        messagePage.uploadFileBtn.click();
    }

    @And("user uploads desired file or image")
    public void userUploadsDesiredFileOrImage() {
        messagePage.UploadFileAndImageBtn.sendKeys("/Users/maggie/Desktop/Screen Shot 2023-07-18 at 11.50.20 AM.png");

    }

    @Then("user should see file or image successfully uploaded to message as attachment")
    public void user_should_see_file_or_image_successfully_uploaded_to_message_as_attachment() {

        Assert.assertTrue("test", !messagePage.deleteFileBtn.isDisplayed());
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

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
    }


}
