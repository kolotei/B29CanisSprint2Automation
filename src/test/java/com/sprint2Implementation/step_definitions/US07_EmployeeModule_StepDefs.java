package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.EmployeePage;
import com.sprint2Implementation.utilities.BrowserUtils;
import com.sprint2Implementation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US07_EmployeeModule_StepDefs {
    EmployeePage employeePage = new EmployeePage();

    @When("user clicks on Employee module")
    public void user_clicks_on_employee_module() {

        employeePage.employeeBtn.click();
    }

    @Then("user is able to see expected modules on the Employee page")
    public void user_is_able_to_see_expected_modules_on_the_employee_page(List<String> expectedModules) {

        List<String> actualModules = new ArrayList<>();
        Driver.getDriver().manage().window().setSize(new Dimension(1920, 1080));

        for (WebElement eachModule : employeePage.employeePageModules) {
            actualModules.add(eachModule.getText());
        }
        System.out.println(actualModules);
        Assert.assertEquals(expectedModules, actualModules);
    }

    @Then("user is able to see Company Structure by default")
    public void user_is_able_to_see_company_structure_by_default() {

        Assert.assertEquals("Company Structure", employeePage.module1.getText());

    }
}
