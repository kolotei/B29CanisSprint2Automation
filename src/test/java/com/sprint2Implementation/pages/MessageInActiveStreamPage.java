package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageInActiveStreamPage {
    public MessageInActiveStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//*[@id=\"feed-add-post-form-tab-message\"]/span")
    public WebElement MessageBtn;

    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public WebElement SendBtn;

    @FindBy(xpath = "//*[@id=\"feed-add-post-destination-item\"]/span")
    public WebElement AllEmployeesBtn;


    @FindBy(xpath = "//*[@id=\"blog-submit-button-cancel\"]/text()")
    public WebElement CancelBtn;

    @FindBy(xpath = "//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe")

    public WebElement MessageInputBox;





}
