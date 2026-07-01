package crc_dev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class crc_dev {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Maximize Browser
        driver.manage().window().maximize();

        // Open Myntra Website
        driver.get("https://www.myntra.com");

        // Wait for page to load
        Thread.sleep(3000);

        // Enter product name in search box
        driver.findElement(By.className("desktop-searchBar"))
              .sendKeys("Shoes");

        Thread.sleep(2000);

        // Click Search Button
        driver.findElement(By.className("desktop-submit"))
              .click();

        Thread.sleep(5000);

        // Print Page Title
        System.out.println("Page Title : " + driver.getTitle());

        // Print Current URL
        System.out.println("Current URL : " + driver.getCurrentUrl());
        
        Thread.sleep(5000);
        // Close Browser
        driver.quit();
    }
   
		

	}

