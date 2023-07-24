package com.sprint2Implementation.pages;

import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeePage {

    public EmployeePage(){
        PageFactory.initElements(Driver.getDriver(), this);
            }

    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeeBtn;

    @FindBy(xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> employeePageModules;

    //a[@class='main-buttons-item-link']

    @FindBy(xpath = "(//span[.='Company Structure'])[1]")
    public WebElement module1;
}
