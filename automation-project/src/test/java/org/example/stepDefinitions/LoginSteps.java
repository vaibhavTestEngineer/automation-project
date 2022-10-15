package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.LoginActions;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    WebDriver driver;
    LoginActions loginActions;
    public LoginSteps(CommonSteps commonSteps, LoginActions loginActions) {
        this.driver = commonSteps.getDriver();
        this.loginActions = loginActions;
    }




    @When("Enter I enter {string}, {string} and click on login")
    public void enter_i_enter_and_click_on_login(String username, String password) {
        System.out.println("My username is: " + username);
        System.out.println("My poassword is :" + password);
        loginActions.enterUserID(username);
        loginActions.enterPassword(password);
        loginActions.clickOnLoginButton();

    }
    @Then("Login should be successful")
    public void login_should_be_successful() {
        System.out.println("Login should be successful");
    }


}
