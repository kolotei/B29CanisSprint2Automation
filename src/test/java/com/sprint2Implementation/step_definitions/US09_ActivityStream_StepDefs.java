package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.ActivityStreamPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US09_ActivityStream_StepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    @Then("user can view the following options on Activity stream page")
    public void user_can_view_the_following_options_on_activity_stream_page(List<String> expectedModules) {
        List<String> actualModules = new ArrayList<>();
        for (WebElement eachModule : activityStreamPage.topOptions) {
            actualModules.add(eachModule.getText());
        }
        Assert.assertEquals(expectedModules, actualModules);
    }


    @When("user clicks the MORE tab")
    public void userClicksTheMORETab() {
        activityStreamPage.MORE.click();
    }

    @Then("user can view the following options under the MORE tab:")
    public void userCanViewTheFollowingOptionsUnderTheMORETab(List<String> expectedOptions) {

        List<String> actualOptions = new ArrayList<>();

        for (WebElement eachOption : activityStreamPage.MOREoptions) {
            actualOptions.add(eachOption.getText());
        }

        Assert.assertEquals(expectedOptions, actualOptions);

    }
}
