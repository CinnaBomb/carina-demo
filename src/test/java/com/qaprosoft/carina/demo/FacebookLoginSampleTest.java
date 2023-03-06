package com.qaprosoft.carina.demo;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.gui.pages.FacebookLoginPage;
import com.qaprosoft.carina.demo.gui.pages.FacebookMainActivityPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FacebookLoginSampleTest implements IAbstractTest {

	private static final Logger LOGGER = LogManager.getLogger(FacebookLoginSampleTest.class);

	@Test
	public void testLogin() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laura\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		loginPage.open();
		FacebookMainActivityPage facebookMainActivityPage = loginPage.login("Test", "Test");

		LOGGER.info("User successfully logged in to Facebook!");

		driver.quit();
	}
}
