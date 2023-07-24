package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.AppreciationPage;
import com.sprint2Implementation.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;

public class US174_Appriciation_Upload {

    AppreciationPage appreciationPage = new AppreciationPage();

    @And("User navigate to ActiveStream")
    public void userNavigateToActiveStream() {
        appreciationPage.activeStreamModule.click();
    }
    @And("User navigates to Appreciation message box")
    public void userNavigatesToAppreciationMessageBox() {
        appreciationPage.moreOptionMessage.click();
        appreciationPage.appreciationMessage.click();
    }

    @Then("User click on File upload option")
    public void userClickOnFileUploadOption() {
        appreciationPage.uploadFileInAppreciation.click();;
    }

    @When("User uploads files into the message")
    public void user_uploads_files_into_the_message(List<String> filesPath) {

        String projectPath = System.getProperty("user.dir");

        /**
         * Below we will insert each file using project path plus file path inside the project
         * Therefore creating dynamic full local pathway for the files we are working with
         */
        for (String eachFilePath : filesPath) {
            appreciationPage.uploadSection.sendKeys(projectPath + "/" + eachFilePath);
        }
        appreciationPage.insertFiles();
    }

    @Then("User inserts files into the body of the message")
    public void userInsertsFilesIntoTheBodyOfTheMessage() {

    }


    @Then("User delete file from `Attached files` section")
    public void userDeleteFileFromSection() {
        appreciationPage.deleteFile();
    }
}
