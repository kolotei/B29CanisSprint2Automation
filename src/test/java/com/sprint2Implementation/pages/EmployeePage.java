package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage {

    public EmployeePage(){
        PageFactory.initElements(Driver.getDriver(), this);
            }

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeeBtn;

    @FindBy(xpath = "//a[@class='main-buttons-item-link']")
    public WebElement employeePageTitle;

}
