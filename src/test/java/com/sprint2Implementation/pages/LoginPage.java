package com.sprint2Implementation.pages;


import com.sprint2Implementation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//input[@type='text']")
    public WebElement userName;

    @FindBy(xpath="//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement logInBtn;



    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        logInBtn.click();
        // verification that we logged
    }

}
