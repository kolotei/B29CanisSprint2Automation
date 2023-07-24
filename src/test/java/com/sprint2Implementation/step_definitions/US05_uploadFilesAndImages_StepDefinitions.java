package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.MessagePage;
import com.sprint2Implementation.utilities.BrowserUtils;
import com.sprint2Implementation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

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
        String projectPath = System.getProperty("user.dir");
        String pngFilePath = "src/test/resources/filesToUpload/Screen Shot 2023-07-20 at 12.54.20 PM.png";
        String pngFullPath = projectPath + "/" + pngFilePath;
        messagePage.UploadFileAndImageBtn.sendKeys(pngFullPath);
    }

    @And("user uploads .jpg .pdf .docx and .txt files")
    public void userUploadsJpgPdfDocxAndTxtFiles() {
        String projectPath = System.getProperty("user.dir");
        String pdfFilePath = "src/test/resources/filesToUpload/THE_PLATEAU_OF_LATENT_POTENTIAL.pdf";
        String pngFullPath = projectPath + "/" + pdfFilePath;
        String jpgFilePath = "src/test/resources/filesToUpload/VTDMV2.jpg";
        String jpgFullPath = projectPath + "/" + jpgFilePath;
        String docxFilePath = "src/test/resources/filesToUpload/Java_Interview_Questions_ALL (3).docx";
        String docxFullPath = projectPath + "/" + docxFilePath;
        String txtFilePath = "src/test/resources/filesToUpload/note.java";
        String txtFullPath = projectPath + "/" + txtFilePath;
        messagePage.UploadFileAndImageBtn.sendKeys(pngFullPath);
        messagePage.UploadFileAndImageBtn.sendKeys(jpgFullPath);
        messagePage.UploadFileAndImageBtn.sendKeys(docxFullPath);
        messagePage.UploadFileAndImageBtn.sendKeys(txtFullPath);


    }

    @Then("user should see file or image successfully uploaded to message as attachment")
    public void user_should_see_file_or_image_successfully_uploaded_to_message_as_attachment() {

        Assert.assertTrue(messagePage.uploadedFilesConfMessage.isDisplayed());
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
    }

    @Then("user should see the file is successfully removed from message")
    public void user_should_see_the_file_is_successfully_removed_from_message() {

      Assert.assertFalse(messagePage.uploadedFilesConfMessage.isDisplayed());

    }


}
