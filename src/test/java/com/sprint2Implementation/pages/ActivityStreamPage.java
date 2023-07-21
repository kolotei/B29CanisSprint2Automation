package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage {
    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "microoPostFormLHE_blogPostForm_inner")
    public WebElement sendMsgField;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkIcon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;


    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURL;

    @FindBy(id = "undefined")
    public WebElement saveBtn;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(xpath = "//a[@href='https://codingbat.com/java']")
    public WebElement message;

    @FindBy(id = "feed-add-post-form-tab")
    public WebElement topOptions;

    @FindBy(id = "feed-add-post-form-link-more")
    public WebElement MORE;


    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> MOREoptions;
}
