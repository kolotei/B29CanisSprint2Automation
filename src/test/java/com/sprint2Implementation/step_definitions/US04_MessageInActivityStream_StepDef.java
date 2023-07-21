package com.sprint2Implementation.step_definitions;
import com.sprint2Implementation.pages.LoginPage;
import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import com.sprint2Implementation.pages.MessageInActiveStreamPage;
import com.sprint2Implementation.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class US04_MessageInActivityStream_StepDef {

 MessageInActiveStreamPage MessageInActivityStream = new MessageInActiveStreamPage();
 LoginPage LoginPage = new LoginPage();



    @When("user navigate to {string}")
    public void user_navigate_to(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
 @Given("user logged in as {string}")
    public void user_logged_in_as(String string) {
     LoginPage.userName.sendKeys(ConfigurationReader.getProperty("marketing_username"));
     LoginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
     LoginPage.logInBtn.click();

    }

    @When("user clicks on MESSAGE button")
    public void user_clicks_on_message_button() {
        MessageInActivityStream.MessageBtn.click();

    }
    @When("user see message field collapse")
    public void user_see_message_field_collapse() {

    }
    @Then("user clicks Send button without typing a message")
    public void user_clicks_send_button_without_typing_a_message() {
    MessageInActivityStream.SendBtn.click();

    }
   @Then("user get error message: The message title is not specified")
   public void user_get_error_message_the_message_title_is_not_specified() {
        MessageInActivityStream.MessageError.isDisplayed();

   }
   @Then("user type a message in Message field")
   public void user_type_a_message_in_message_field() {

    }
   @Then("user delete the default recipients to  All employees")
   public void user_delete_the_default_recipients_to_all_employees() {
        MessageInActivityStream.AllEmployeesDelBtn.click();


    }
    @Then("user click SEND button")
    public void user_click_send_button() {
        MessageInActivityStream.SendBtn.click();

    }
    @Then("user get error message: Please specify at least one person.")
    public void user_get_error_message_please_specify_at_least_one_person() {
        MessageInActivityStream.SpecifyPersonMessageError.isDisplayed();


    }
    @Then("user see default settings appeared on the page")
    public void user_see_default_settings_appeared_on_the_page() {

    }
    @Then("user see message displayed under Activity Stream")
    public void user_see_message_displayed_under_activity_stream() {


    }
    @When("user click MESSAGE tab")
    public void user_click_message_tab() {
        MessageInActivityStream.MessageBtn.click();

    }
    @Then("user see delivery to All employees")
    public void user_see_delivery_to_all_employees() {


    }
    @When("user type a Message")
    public void user_type_a_message() {
        //iframe .switchTo()
        MessageInActivityStream.MessageInputBox.click();
        MessageInActivityStream.MessageInputBox.sendKeys("Hello" );

    }
    @Then("user click Cancel")
    public void user_click_cancel() {
        MessageInActivityStream.CancelBtn.click();

    }
    @Then("user sees message Canceled to send.")
    public void user_sees_message_canceled_to_send() {

    }
}
