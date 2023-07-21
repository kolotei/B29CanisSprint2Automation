package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.US170_CompanyStructurePage;
import com.sprint2Implementation.pages.LoginPage;
import com.sprint2Implementation.utilities.ConfigurationReader;
import com.sprint2Implementation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US170_CompanyStructureStepDefs {
    LoginPage loginPage = new LoginPage();
    US170_CompanyStructurePage strPage = new US170_CompanyStructurePage();
    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
    //Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enter username {string}")
    public void user_enter_username(String userName) {
        loginPage.userName.sendKeys(userName);
    }
    @When("user enter password {string}")
    public void user_enter_password(String password) {
        loginPage.password.sendKeys(password);
    }
    @When("user click in sign in button")
    public void user_click_in_sign_in_button() {
        loginPage.logInBtn.click();
    }

    @And("User go to Employee Page")
    public void userGoToEmployeePage() {
       // loginPage`.employeeLink.click();
    }
    @Then("user should be able to see Company Structure on the page")
    public void user_should_be_able_to_see_company_structure_on_the_page() {
       Assert.assertTrue("You are on the wrong page" ,strPage.companyStructDisplayed.isDisplayed());
    }


    @When("user click the {string} option")
    public void user_click_the_option(String addDep) {
        strPage.addDepBtn.click();
    }
    @When("user fill in the required department details")
    public void user_fill_in_the_required_department_details() {
    strPage.enterName. sendKeys("HR");

    }
    @When("user submit the form")
    public void user_submit_the_form() {

        strPage.clickAddButton.click();

    }
    @Then("user should see new department is added to the company structure")
    public void user_should_see_new_department_is_added_to_the_company_structure() {

    }


    @Then("user verify Add Department is not displayed")
    public void user_verify_add_department_is_not_displayed() {
       // loginPage.employeeLink.click();
        //Assert.assertTrue("Its is displayed" ,!strPage.addDepBtn.isDisplayed());
    }

}





