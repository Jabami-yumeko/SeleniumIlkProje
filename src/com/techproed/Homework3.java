package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework3 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASUS\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        WebElement english = driver.findElement(By.linkText("English"));
        english.click();

        WebElement aramaKutusu = driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("Asus Gaming laptop");
        aramaKutusu.submit();

        WebElement shopping = driver.findElement(By.partialLinkText("Shopping"));
        shopping.click();

        driver.navigate().back();

        WebElement images = driver.findElement(By.partialLinkText("Images"));
        images.click();


    }
}
