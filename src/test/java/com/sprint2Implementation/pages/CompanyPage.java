package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

    public CompanyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Company']")
    public WebElement companyBtn;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']")
    public WebElement menuBarBtns;
}
