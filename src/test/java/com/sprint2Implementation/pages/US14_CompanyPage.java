package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US14_CompanyPage {

    public US14_CompanyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Company']")
    public WebElement companyBtn;
}
