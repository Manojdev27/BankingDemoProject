package com.demo.bankingproject;

import org.openqa.selenium.By;

public class SeleniumUtils {

    public static By username = By.xpath("//input[@name = 'uid']");
    public static By password = By.xpath("//input[@name = 'password']");
    public static By submit = By.xpath("//input[@name = 'btnLogin']");
    public static final String USER_NAME = "mngr564516";
    public static final String PASSWORD = "tejUdEd";

    public static final String BASE_URL = "http://www.demo.guru99.com/V4/";

    public static String expectedTitle = "Guru99 Bank Manager HomePage";
}
