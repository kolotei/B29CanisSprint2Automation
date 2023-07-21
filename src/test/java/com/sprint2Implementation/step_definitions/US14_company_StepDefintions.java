package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.CompanyPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US14_company_StepDefintions {

    CompanyPage companyPage = new CompanyPage();

    @When("is on the company page")
    public void isOnTheCompanyPage() {
       companyPage.companyBtn.click();
    }



    @Then("user sees following modules on Company page")
    public void userSeesFollowingModulesOnCompanyPage(List<String> expectedModules) {

//            List<String> actualModules = new ArrayList<>();
//            for (WebElement eachModule : companyPage.menuBarBtns) {
//                actualModules.add(eachModule.getText());
//            }
//            Assert.assertEquals(expectedModules, actualModules);
        }
}
