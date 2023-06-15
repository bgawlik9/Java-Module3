package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.pl");


        WebElement category = driver.findElement(By.xpath("//*[@id=\"gh-cat-box\"]/select"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(9);

        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"gh-ac-box2\"]/input"));
        searchField.sendKeys("mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();


    }
}
