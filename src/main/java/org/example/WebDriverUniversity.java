package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverUniversity {

    WebDriver driver;

    By Menu1 = By.id("dropdowm-menu-1");

    By Menu2 = By.id("dropdowm-menu-2");

    By Menu3 = By.id("dropdowm-menu-3");

    By Box2 = By.xpath("//label[contains(text(),'Option 2')]");

    By Box3 = By.xpath("//label[contains(text(),'Option 3')]");

    By color = By.cssSelector("input[value='yellow']");

    public WebDriverUniversity(WebDriver driver){
        this.driver = driver;
    }

    public void dropDown() throws InterruptedException {
        // Thread.sleep(5000);
        Select M1 =new Select((new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(Menu1))));
        M1.selectByValue("python");
        Thread.sleep(200);
        Select M2 =new Select(driver.findElement(Menu2));
        M2.selectByValue("testng");
        Thread.sleep(200);
        Select M3 =new Select(driver.findElement(Menu3));
        M3.selectByValue("javascript");
        Thread.sleep(200);

    }

    public void checkBox() throws InterruptedException {
        driver.findElement(Box2).click();
        Thread.sleep(200);
        driver.findElement(Box3).click();
        driver.findElement(Box3).click();
        Thread.sleep(200);

    }

    public void radioButton() throws InterruptedException {
        driver.findElement(color).click();
        Thread.sleep(200);
    }


}