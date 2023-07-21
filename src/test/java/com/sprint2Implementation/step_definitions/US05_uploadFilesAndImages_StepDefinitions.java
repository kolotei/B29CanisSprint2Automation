package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.MessagePage;
import com.sprint2Implementation.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US05_uploadFilesAndImages_StepDefinitions {
    MessagePage messagePage = new MessagePage();

    //START SCENARIO 1

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

        //TODO ASK AARON ABOUT PARAMETERIZING THESE WITH A SEPARATE FILE
        messagePage.UploadFileAndImageBtn.sendKeys("/Users/maggie/Desktop/Screen Shot 2023-07-18 at 11.50.20 AM.png");
    }

    @And("user uploads .jpg .pdf .docx and .txt files")
    public void userUploadsJpgPdfDocxAndTxtFiles() {

        //TODO ASK AARON ABOUT PARAMETERIZING THESE WITH A SEPARATE FILE
        messagePage.UploadFileAndImageBtn.sendKeys("/Users/maggie/Downloads/Java_Interview_Questions_ALL (3).docx");
        messagePage.UploadFileAndImageBtn.sendKeys("/Users/maggie/Downloads/THE_PLATEAU_OF_LATENT_POTENTIAL.pdf");
        messagePage.UploadFileAndImageBtn.sendKeys("/Users/maggie/Downloads/VTDMV2.jpg");
        messagePage.UploadFileAndImageBtn.sendKeys("/Users/maggie/Desktop/Java Class Materials/Day 16_ Loops Continued/day16 class notes.txt");
    }

    @Then("user should see file or image successfully uploaded to message as attachment")
    public void user_should_see_file_or_image_successfully_uploaded_to_message_as_attachment() {

        Assert.assertTrue(messagePage.uploadedFile.isDisplayed());
    }


    //START SCENARIO 2

    @When("user clicks to insert file or image into text")
    public void user_clicks_to_insert_file_or_image_into_text() {
    messagePage.insertInTextBtn.click();
    }

    @Then("user should see that file or image is successfully moved into text field")
    public void user_should_see_that_file_or_image_is_successfully_moved_into_text_field() {

        String expected = "In text";
        String actual = messagePage.inTextMessage.getText();
        Assert.assertEquals(expected, actual);
    }


    //START SCENARIO 3

    @When("user clicks remove file or image icon")
    public void user_clicks_remove_file_or_image_icon() {
    messagePage.deleteUploadBtn.click();
    BrowserUtils.sleep(3);
    }

    @Then("user should see the file is successfully removed from message")
    public void user_should_see_the_file_is_successfully_removed_from_message() {

        //Assert.assertFalse(messagePage.uploadedFile.isDisplayed());

    }


}
