package com.qaprosoft.carina.demo;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FacebookLoginSampleTest {

    private static final Logger LOGGER = LogManager.getLogger(FacebookLoginSampleTest.class);

    @Test
    public void testLogin() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        WebElement emailOrPhoneInput = driver.findElement(By.xpath("//*[@id='email']"));
        emailOrPhoneInput.sendKeys("testuser@example.com");

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id='pass']"));
        passwordInput.sendKeys("password123");

        WebElement logInButton = driver.findElement(By.xpath("//button[@name='login']"));
        logInButton.click();

        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        	 LOGGER.error(e);
        }

        // Verify that the user is logged in
        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        LOGGER.info("User successfully logged in to Facebook!");

        driver.quit();
    }
}
