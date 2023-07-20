package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.AddLinkPage;
import com.sprint2Implementation.utilities.BrowserUtils;
import com.sprint2Implementation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US06_AddLink_StepDefs {
    AddLinkPage addLinkPage = new AddLinkPage();
    @Given("user clicks Send message field")
    public void user_clicks_send_message_field() {
        addLinkPage.sendMsgField.click();
    }

    @Given("user clicks the Link icon")
    public void user_clicks_the_link_icon() {
        addLinkPage.linkIcon.click();
    }
    @Given("user enters text in the Link text field")
    public void user_enters_text_in_the_link_text_field() {

       // Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        addLinkPage.linkText.sendKeys("JavaPractice!!");
    }
    @Given("user enters URL address in the Link URL field")
    public void user_enters_url_address_in_the_link_url_field() {
        addLinkPage.linkURL.sendKeys("https://codingbat.com/java");
    }

    @Given("user clicks Save button")
    public void user_clicks_save_button() {
        addLinkPage.saveBtn.click();
    }

    @Given("user clicks SEND button")
    public void user_clicks_send_button() {
        addLinkPage.sendBtn.click();
        BrowserUtils.sleep(3);
    }
    @Then("user is able to see the message with the Link text in Activity Stream")
    public void user_is_able_to_see_the_message_with_the_link_text_in_activity_stream() {
        String expected = "JavaPractice!!";
        String actual = addLinkPage.message.getText();
        Assert.assertEquals(expected, actual);
    }





    @Given("user clicks on the attached link")
    public void user_clicks_on_the_attached_link() {
        addLinkPage.message.click();
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
