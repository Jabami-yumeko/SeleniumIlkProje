package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASUS\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("https://int1.darkorbit.com/index.es?lang=tr");

        WebElement kullaniciAdi = driver.findElement(By.id("bgcdw_login_form_username"));
        kullaniciAdi.sendKeys("NoGameNoLife_");

        WebElement kullaniciSifre = driver.findElement(By.id("bgcdw_login_form_password"));
        kullaniciSifre.sendKeys("xwenes150620");






    }
}
