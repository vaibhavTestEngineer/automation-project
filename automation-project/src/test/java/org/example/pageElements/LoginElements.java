package org.example.pageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {
    WebDriver driver ;
    @FindBy(name = "uid")
    public WebElement UserID;

    @FindBy(name = "password")
    public WebElement Password;

    @FindBy(name = "btnLogin")
    public  WebElement LOGIN;

    public LoginElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
}
