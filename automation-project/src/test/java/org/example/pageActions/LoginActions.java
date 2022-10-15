package org.example.pageActions;

import org.example.pageElements.LoginElements;
import org.example.stepDefinitions.CommonSteps;
import org.openqa.selenium.WebDriver;

public class LoginActions {
   private WebDriver driver ;

   public LoginActions(CommonSteps commonSteps){
       this.driver = commonSteps.getDriver();
       this.loginElements = new LoginElements(driver);
   }
   LoginElements loginElements;
    public void enterUserID(String userId)
    {loginElements.UserID.sendKeys(userId);}
    public void enterPassword(String password)
    {loginElements.Password.sendKeys(password);}
    public void clickOnLoginButton()
    {loginElements.LOGIN.click();}


}
