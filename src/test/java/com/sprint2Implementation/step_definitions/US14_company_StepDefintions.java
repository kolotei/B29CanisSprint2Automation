package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.CompanyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US14_company_StepDefintions {

    CompanyPage companyPage = new CompanyPage();

    @When("is on the company page")
    public void isOnTheCompanyPage() {
       companyPage.companyBtn.click();
    }

    @Then("user should see all modules displayed as expected")
    public void user_should_see_all_modules_displayed_as_expected() {

    }

}
