package com.demo.bankingproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    static String actualTitle;
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(SeleniumUtils.BASE_URL);
        driver.findElement(SeleniumUtils.username).clear();
        driver.findElement(SeleniumUtils.username).sendKeys(SeleniumUtils.USER_NAME);
        driver.findElement(SeleniumUtils.password).clear();
        driver.findElement(SeleniumUtils.password).sendKeys(SeleniumUtils.PASSWORD);
        driver.findElement(SeleniumUtils.submit).click();
        actualTitle = driver.getTitle();
        if(actualTitle.equalsIgnoreCase(SeleniumUtils.expectedTitle)){
            System.out.println("Test Case is passed");
        }
        else{
            System.out.println("Test case is failed");
        }
        driver.close();
    }
}