package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageInActiveStreamPage extends BasePage{
    public MessageInActiveStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-message\"]/span")
    public WebElement MessageBtn;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public WebElement SendBtn;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span/span[2]")
    public WebElement AllEmployeesDelBtn;


    @FindBy(xpath = "//*[@id='blog-submit-button-cancel']")
    public WebElement CancelBtn;

    @FindBy(xpath = "//*[@id=\"divoPostFormLHE_blogPostForm\"]/div[3]/div[1]/div[2]/input")

    public WebElement MessageInputBox;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div/span[2]")

    public WebElement MessageError;

    @FindBy(xpath = "//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div/span[2]")

    public WebElement SpecifyPersonMessageError;

    @FindBy(xpath = "//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe")

    public WebElement iframe;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span/span[1]")
    public WebElement AllEmployeesBtn;






}
