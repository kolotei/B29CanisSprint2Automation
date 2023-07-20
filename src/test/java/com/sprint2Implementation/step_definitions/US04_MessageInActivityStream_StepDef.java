package com.sprint2Implementation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US04_MessageInActivityStream_StepDef {

 US04_MessageInActivityStream_StepDef US04 = new US04_MessageInActivityStream_StepDef();

    LoginStepDefs loginStepDefs = new LoginStepDefs();

    @Given("user logged in as {string}")
    public void user_logged_in_as(String string) {

    }
    @Given("user see the following module on the Main Page")
    public void user_see_the_following_module_on_the_main_page(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }
    @When("user clicks on MESSAGE button")
    public void user_clicks_on_message_button() {

    }
    @When("user see message field collapse")
    public void user_see_message_field_collapse() {

    }
    @Then("user clicks Send button without typing a message")
    public void user_clicks_send_button_without_typing_a_message() {

    }
    @Then("user get error message {string}")
    public void user_get_error_message(String string) {

    }
    @Then("user type a message in {string}")
    public void user_type_a_message_in(String string) {

    }
    @Then("user delete the default recipients to {string}")
    public void user_delete_the_default_recipients_to(String string) {

    }
    @Then("user click SEND button")
    public void user_click_send_button() {

    }
    @Then("user see messages {string}")
    public void user_see_messages(String string) {

    }
    @Then("user see default settings appeared on the page")
    public void user_see_default_settings_appeared_on_the_page() {

    }
    @Then("user see message displayed under Activity Stream")
    public void user_see_message_displayed_under_activity_stream() {

    }
    @When("user click MESSAGE tab")
    public void user_click_message_tab() {

    }
    @Then("user see delivery to All employees")
    public void user_see_delivery_to_all_employees() {

    }
    @When("user type a Message")
    public void user_type_a_message() {

    }
    @Then("user click Cancel")
    public void user_click_cancel() {

    }
    @Then("user sees message Canceled to send.")
    public void user_sees_message_canceled_to_send() {

    }
}
