package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Ebay {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.pl");


        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button#gdpr-banner-accept")));

        WebElement category = driver.findElement(By.cssSelector("select#gh-cat"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(9);

        WebElement searchField = driver.findElement(By.cssSelector("#gh-ac"));
        searchField.sendKeys("mavic mini");

        WebElement searchButton = driver.findElement(By.cssSelector("#gh-btn"));
        searchButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#srp-river-results > ul")));

        List<WebElement> productCards = driver.findElements(By.cssSelector("#srp-river-results > ul"));
        for (WebElement card : productCards) {
            System.out.println(card.getText());
            System.out.println("-----------------------------------");
        }

    }
}
