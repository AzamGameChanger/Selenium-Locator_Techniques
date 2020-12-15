package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a[title *= 'Sign']")).click();
        driver.findElement(By.xpath("//*[@id = 'login1']")).sendKeys("HelloXpath");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345");
        driver.findElement(By.xpath("//input[contains(@value,'Sign')]")).click();
    }
}
