package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\ASUS\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://amazon.com");
        String sayfaBasligi = driver.getTitle();

        // contains methodu, bir yazinin icerisinde bir kelime grubunun gecip gecmedigini kontrol eder

        if(sayfaBasligi.contains("Books")){
            System.out.println("Car kelimesi Iceriyor : " + sayfaBasligi);
        }else{
            System.out.println("Car kelimesi Icermiyor." + sayfaBasligi);
        }
        driver.quit();

    }
}
