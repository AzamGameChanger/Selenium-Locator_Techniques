package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.cssSelector("input[name = 'name']")).sendKeys("Azam");
        driver.findElement(By.xpath("//*[@name = 'email']")).sendKeys("ibragimov.azamkhuja@inbox.ru");
        driver.findElement(By.cssSelector("input[id *= 'Password']")).sendKeys("987654321");
        driver.findElement(By.xpath("//input[@type = 'checkbox']")).click();
        driver.findElement(By.cssSelector("#exampleFormControlSelect1")).click();

    }
}
