package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.CompanyPage;
import com.sprint2Implementation.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US14_company_StepDefintions {

    CompanyPage companyPage = new CompanyPage();

    @When("is on the company page")
    public void isOnTheCompanyPage() {
       companyPage.companyBtn.click();
    }


    @Then("user sees all modules on Company page")
    public void userSeesAllModulesOnCompanyPage(List<String> expected) {

            List<WebElement> tabsName = Driver.getDriver().findElements(By.xpath("//a[@class='main-buttons-item-link']//span[@class='main-buttons-item-text-title']"));
            List<String> tabsNameString = new ArrayList<>();
            for(WebElement e : tabsName) {
                tabsNameString.add(e.getText());
            }
//            List<String> actual = new ArrayList<>();
//            for (WebElement each : companyPage.menuBarBtns) {
//                actualModules.add(each.getText());
//            }
//            Assert.assertEquals(expected, actual);
        }
        }