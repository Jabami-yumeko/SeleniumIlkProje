package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASUS\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");

        String sayfaBasligi = driver.getTitle();

        if (sayfaBasligi.contains("video")){
            System.out.println("baslikta video kelimesi iceriyor");
        }else{
            System.out.println("baslikta video kelimesi icermiyor");
        }
        driver.close();
    }
}
