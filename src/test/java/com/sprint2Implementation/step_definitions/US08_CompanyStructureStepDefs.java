package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.US08_CompanyStructurePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US08_CompanyStructureStepDefs {

    US08_CompanyStructurePage comp_strPage = new US08_CompanyStructurePage();

    @And("User go to Employee Page")
    public void userGoToEmployeePage() {

        comp_strPage.employeeLink.click();
    }
    @Then("user should be able to see Company Structure on the page")
    public void user_should_be_able_to_see_company_structure_on_the_page() {
       Assert.assertTrue("You are on the wrong page" ,comp_strPage.companyStructDisplayed.isDisplayed());
    }


    @When("user click the {string} option")
    public void user_click_the_option(String addDep) {
        comp_strPage.addDepBtn.click();
    }
    @When("user fill in the required department details")
    public void user_fill_in_the_required_department_details() {
    comp_strPage.enterName. sendKeys("HR");

    }
    @When("user submit the form")
    public void user_submit_the_form() {

        comp_strPage.clickAddButton.click();

    }
    @Then("user should see new department is added to the company structure")
    public void user_should_see_new_department_is_added_to_the_company_structure() {
        Assert.assertTrue("Hr department is not visible" ,comp_strPage.hrHeader.isDisplayed());

    }


    @Then("user verify Add Department is not displayed")
    public void user_verify_add_department_is_not_displayed() {
      comp_strPage.employeeLink.click();
        Assert.assertTrue("Its is displayed" ,!comp_strPage.addDepBtn.isDisplayed());
    }


}





