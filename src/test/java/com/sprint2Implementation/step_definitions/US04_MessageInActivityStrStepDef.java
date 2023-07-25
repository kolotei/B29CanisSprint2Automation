package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.MessageInActiveStreamPage;
import com.sprint2Implementation.utilities.BrowserUtils;
import com.sprint2Implementation.utilities.ConfigurationReader;
import com.sprint2Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US04_MessageInActivityStrStepDef {
    MessageInActiveStreamPage messageInActiveStreamPage = new MessageInActiveStreamPage();



    @When("user clicks  MESSAGE button")
    public void user_clicks_message_button() {
        messageInActiveStreamPage.MessageBtn.click();

    }
    @When("user see message field collapse")
    public void user_see_message_field_collapse() {

    }
    @Then("user clicks Send button without typing a message")
    public void user_clicks_send_button_without_typing_a_message() {
        messageInActiveStreamPage.SendBtn.click();

    }
    @Then("user get error message: The message title is not specified")
    public void user_get_error_message_the_message_title_is_not_specified() {
     String expected = "The message title is not specified";
     String actual = messageInActiveStreamPage.MessageError.getText();
        Assert.assertEquals(expected, actual);
    }

    @When("user delete the default recipients to  All employees")
    public void user_delete_the_default_recipients_to_all_employees() {
        messageInActiveStreamPage.AllEmployeesDelBtn.click();

    }
    @Then("user clicks Send button")
    public void user_clicks_send_button() {
 messageInActiveStreamPage.SendBtn.click();
    }

    @Then("Then user get error message: Please specify at least one person.")
    public void then_user_get_error_message_please_specify_at_least_one_person(){
        String expected = "Please specify at least one person.";
        String actual = messageInActiveStreamPage.SpecifyPersonMessageError.getText();
        Assert.assertEquals(expected, actual);


    }

    @Then("user see delivery to All employees")
    public void user_see_delivery_to_all_employees() {

      Assert.assertTrue(messageInActiveStreamPage.AllEmployeesBtn.isDisplayed());
    }


    @Then("user click Cancel")
    public void user_click_cancel() {
        messageInActiveStreamPage.CancelBtn.click();

    }

}
