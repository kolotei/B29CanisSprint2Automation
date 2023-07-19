package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddLinkPage {
    public AddLinkPage(){
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
}
