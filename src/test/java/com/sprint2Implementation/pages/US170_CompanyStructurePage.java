package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US170_CompanyStructurePage {
    public US170_CompanyStructurePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement companyStructDisplayed;

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepBtn;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement enterName;

    @FindBy(xpath ="//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement clickAddButton;

    @FindBy(xpath ="//a[@title='HR']")
    public WebElement hrHeader;



}
