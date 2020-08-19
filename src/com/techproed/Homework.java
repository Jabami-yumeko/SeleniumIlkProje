package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASUS\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        String facebookTitle = driver.getTitle();

        if (facebookTitle.contains("facebook")){
            System.out.println("Page title = facebook");
        }else{
            System.out.println("Actual title = facebook");
        }

        String facebookUrl = driver.getCurrentUrl();

        if (facebookUrl.contains("facebook")){
            System.out.println("This url is contains 'facebook'");
        }else{
            System.out.println("Actual Url contains = facebook");
        }
        driver.navigate().to("https://www.walmart.com/");
        String walmartTitle = driver.getTitle();

        if (walmartTitle.toLowerCase().contains("Walmart.com")){
            System.out.println("This title contains = Walmart.com");
        }else {
            System.out.println("does not contains 'Walmart.com'");
        }
        driver.navigate().back();

        driver.navigate().refresh();

        driver.quit();


    }
}
