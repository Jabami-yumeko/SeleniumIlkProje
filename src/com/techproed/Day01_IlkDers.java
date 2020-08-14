package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        // Java projemize, chromedriver i tanittik
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASUS\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        //Selenium ile ilgili ilk kodumuz.
        //WebDriver nesnesi olusturarak, chrome driver i kullanabilir hale getirdik.

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://google.com");

        // driverimizda acik olan pencereyi kapatir
        // webDriver.close();

        // driver imi komple kapatiyor
        // webDriver.quit();

    }
}
