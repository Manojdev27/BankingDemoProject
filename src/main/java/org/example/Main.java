package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(" http://www.demo.guru99.com/V4/");
        driver.findElement(By.xpath("//input[@name = 'uid']")).sendKeys("mngr564516");
        driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys("tejUdEd");
        driver.findElement(By.xpath("//input[@name = 'btnLogin']")).click();
        driver.close();


    }
}