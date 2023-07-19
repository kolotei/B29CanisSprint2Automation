package com.sprint2Implementation.step_definitions;

import com.sprint2Implementation.pages.LoginPage;
import com.sprint2Implementation.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("hr")){
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("password");
        }else if(userType.equalsIgnoreCase("help desk")){
            username = ConfigurationReader.getProperty("helpdesk_username");
            password = ConfigurationReader.getProperty("password");
        }else if(userType.equalsIgnoreCase("marketing")){
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }





}
