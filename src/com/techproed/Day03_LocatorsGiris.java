package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASUS\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        // Web sayfasindaki tum elemanlar -> WebElement

        // WebElement imizi id kullanarak bulduk
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        // WebElement imize tikladik
        signInLink.click();


        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");

        // sign in butonunu buluyoruz
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();

        String title = driver.getTitle();
        if (title.equals("Address Book")){
            System.out.println("TEST PASS");
        }else{
            System.out.println("TEST FAIL");
        }

    }
}
