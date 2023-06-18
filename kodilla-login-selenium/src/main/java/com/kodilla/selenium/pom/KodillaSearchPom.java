package com.kodilla.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaSearchPom {
    @FindBy(id = "searchField")
    private WebElement searchField;

    @FindBy(xpath = "//button[contains(text(), 'Search')]")
    private WebElement searchButton;

    WebDriver driver;

    public KodillaSearchPom() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        PageFactory.initElements(driver, this);

        driver.navigate().to("https://kodilla.com/pl/test/store");
    }

    public int searchAndGetResultsCount(String phrase) {
        searchField.sendKeys(phrase);
        searchButton.click();
        return getResultsCount();
    }

    private int getResultsCount() {
        // TODO: Implement the logic to retrieve and return the results count from the page
        return 0;
    }

    public void close() {
        driver.close();
    }
}
