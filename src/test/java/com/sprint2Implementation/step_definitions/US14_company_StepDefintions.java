package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.US14_CompanyPage;
import com.sprint2Implementation.utilities.ConfigurationReader;
import com.sprint2Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US14_company_StepDefintions {

    US14_CompanyPage companyPage = new US14_CompanyPage();
    LoginStepDefs loginStepDefs = new LoginStepDefs();

    @Given("user is on the company page")
    public void user_is_on_the_company_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginStepDefs.the_user_logged_in_with_username_as_and_password_as("hr11@cybertekschool.com", "UserUser");
        companyPage.companyBtn.click();

    }

    @Then("user should see all modules displayed as expected")
    public void user_should_see_all_modules_displayed_as_expected() {

    }

}
