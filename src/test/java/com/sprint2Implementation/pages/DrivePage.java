package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DrivePage {
    public DrivePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Drive']")
    public WebElement driveBtn;


    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> allModules;
}
