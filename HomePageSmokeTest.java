package com.cynbit.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomePageSmokeTest {
    private WebDriver driver;
    private final String baseUrl = "https://www.cynbit.in/";

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Remove headless mode if you want to watch the browser.
        options.addArguments("--headless=new", "--window-size=1440,1000");
        driver = new ChromeDriver(options); // Selenium Manager resolves driver where network permits.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void homePageLoadsWithExpectedTitle() {
        driver.get(baseUrl);
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("cynbit"),
                "Page title should identify Cynbit.");
        Assert.assertTrue(driver.findElements(By.tagName("body")).size() > 0,
                "Page body should be present.");
    }

    @Test
    public void primaryNavigationLinksArePresent() {
        driver.get(baseUrl);
        List<WebElement> links = driver.findElements(By.cssSelector("a[href]"));
        Assert.assertTrue(links.size() > 0, "Expected navigable links on home page.");
        // This is a presence smoke check, not a full broken-link validation.
    }

    @Test
    public void keyRoutesReturnNonErrorPages() {
        String[] paths = {"/story", "/team", "/careers", "/services", "/products",
                "/case-studies", "/bitelevate", "/blog", "/contact"};
        for (String path : paths) {
            driver.get(baseUrl + path.substring(1));
            Assert.assertTrue(driver.findElements(By.tagName("body")).size() > 0,
                    "Body should load for route: " + path);
            Assert.assertFalse(driver.getTitle().toLowerCase().contains("404"),
                    "Route should not show a 404 title: " + path);
        }
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
