package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.DrivePage;
import com.sprint2Implementation.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Drive_StepDefinitions {
    DrivePage drivePage = new DrivePage();
    @Given("user clicks the Drive button")
    public void user_clicks_the_drive_button() {
       drivePage.driveBtn.click();
    }
    @Then("user can see the following modules on the Drive page")
    public void user_can_see_the_following_modules_on_the_drive_page(List<String> modules) {

        BrowserUtils.sleep(3);
        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : drivePage.allModules) {
            actualModules.add(eachModule.getText());
        }

        Assert.assertEquals(modules, actualModules);
    }
}
