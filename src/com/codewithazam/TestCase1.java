package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

    public static void main(String[] args) {
	// write your code here
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.cssSelector("#email")).sendKeys("Hello");
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
        driver.findElement(By.name("login")).click();

    }
}
