package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASUS\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        String facebookTitle = driver.getTitle();
        if (facebookTitle.toLowerCase().contains("facebook")){
            System.out.println("True");
        }else {
            System.out.println(facebookTitle);
        }
        String facebookUrl = driver.getCurrentUrl();
        if (facebookUrl.toLowerCase().contains("facebook")){
            System.out.println("True");
        }else {
            System.out.println(facebookUrl);
        }
        driver.navigate().to("https://www.walmart.com/");

        String warmartTitle = driver.getTitle();
        if (warmartTitle.toLowerCase().contains("Walmart.com")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();


    }
}
