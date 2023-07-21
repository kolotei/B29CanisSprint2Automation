package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.ActivityStreamPage;
import com.sprint2Implementation.utilities.BrowserUtils;
import com.sprint2Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US06_AddLink_StepDefs {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    @Given("user clicks Send message field")
    public void user_clicks_send_message_field() {
        activityStreamPage.sendMsgField.click();
    }

    @Given("user clicks the Link icon")
    public void user_clicks_the_link_icon() {
        activityStreamPage.linkIcon.click();
    }
    @Given("user enters text in the Link text field")
    public void user_enters_text_in_the_link_text_field() {

       // Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        activityStreamPage.linkText.sendKeys("CodingBat");
    }
    @Given("user enters URL address in the Link URL field")
    public void user_enters_url_address_in_the_link_url_field() {
        activityStreamPage.linkURL.sendKeys("https://codingbat.com/java");
    }

    @Given("user clicks Save button")
    public void user_clicks_save_button() {
        activityStreamPage.saveBtn.click();
    }

    @Given("user clicks SEND button")
    public void user_clicks_send_button() {
        activityStreamPage.sendBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("user is able to see the message with the Link text in Activity Stream")
    public void user_is_able_to_see_the_message_with_the_link_text_in_activity_stream() {
        String expected = "CodingBat";
        String actual = activityStreamPage.message.getText();
        Assert.assertEquals(expected, actual);
    }





    @Given("user clicks on the attached link")
    public void user_clicks_on_the_attached_link() {
        activityStreamPage.message.click();
        BrowserUtils.sleep(3);
    }
    @Then("user navigate to the correct URL")
    public void user_navigate_to_the_correct_url() {

        for (String eachHandle : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(eachHandle);
            if (eachHandle.contains("codingbat"))
                break;
        }

        String expected = "https://codingbat.com/java";
        String actual = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expected, actual);
    }


    @Then("the correct URL is opening in a new tab")
    public void theCorrectURLIsOpeningInANewTab() {
        String windowHandle1 = Driver.getDriver().getWindowHandle();
        for (String eachHandle : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(eachHandle);
            if (eachHandle.contains("codingbat"))
                break;
        }

        String windowHandle2 = Driver.getDriver().getWindowHandle();

        Assert.assertFalse(windowHandle2.equals(windowHandle1));
    }
}
