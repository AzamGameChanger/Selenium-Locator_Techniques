package com.codewithazam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseParentChildTraverse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        //driver.findElement(By.xpath("//div/div[3]/div[2]/span/a")).click();
        driver.findElement(By.xpath("//div[@class='container']/div/div/div/ul/li[2]")).click();


    }
}
