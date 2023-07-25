package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.EmployeesPage;
import com.sprint2Implementation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US07_EmployeesModule_StepDefs {
    EmployeesPage employeesPage = new EmployeesPage();

    @When("user clicks on Employee module")
    public void user_clicks_on_employee_module() {

        employeesPage.employeesBtn.click();
    }

    @Then("user is able to see expected modules on the Employee page")
    public void user_is_able_to_see_expected_modules_on_the_employee_page(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<>();
        Driver.getDriver().manage().window().setSize(new Dimension(1920, 1080));

        for (WebElement eachModule : employeesPage.employeesPageModules) {
            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(expectedModules, actualModules);
    }

    @Then("user is able to see Company Structure by default")
    public void user_is_able_to_see_company_structure_by_default() {

        Assert.assertEquals("Company Structure", employeesPage.module1.getText());

    }
}
