package org.example.stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {
    private WebDriver driver;

    public  WebDriver getDriver(){return driver;}

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Given("I Open application url in browser")
    public void i_open_application_url_in_browser() {
        System.out.println("I Open application url in browser");
        driver.get("https://demo.guru99.com/V1/");
    }
  //  @Before
   // public  void  tearDown() throws InterruptedException {
     //   driver.quit();
       // Thread.sleep(3000);
   // }
}
