package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverUniversityTest {

    WebDriver driver;

    @Test
    public void WebsiteTesting() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.manage().window().maximize();

        WebDriverUniversity test = new WebDriverUniversity(driver);
        test.dropDown();
        test.checkBox();
        test.radioButton();


    }

}