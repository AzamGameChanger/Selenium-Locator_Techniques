package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\geckodriver.exe");
        WebDriver webDriver =  new FirefoxDriver();
        webDriver.get("https://login.salesforce.com/");
        webDriver.findElement(By.xpath("//*[@id='username']")).sendKeys("Hello");
        webDriver.findElement(By.cssSelector("#password")).sendKeys("12345");
        webDriver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(webDriver.findElement(By.cssSelector("#error")).getText());

    }
}
