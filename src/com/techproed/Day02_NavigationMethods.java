package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASUS\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver =new ChromeDriver();

        // Driver in fullscreen olmasini sagliyor
        webDriver.manage().window().maximize();

        //driver i google.com a gitmesini soyluyoruz

        webDriver.get("https://www.google.com/?hl=tr");

        //get komutu ile ayni islemi yapar
        webDriver.navigate().to("http://amazon.com");

        // navigate().forward() methodu geri geldiğimiz sayfaya gitmemizi sağlıyor
        // örnek : google -> amazona gittik -> amazondan google'a geri geldik
        // eğer forward yaparsak, amazona geri gideriz.
        webDriver.navigate().back();

        webDriver.navigate().forward();

        webDriver.navigate().refresh();

        webDriver.close();
    }
}
