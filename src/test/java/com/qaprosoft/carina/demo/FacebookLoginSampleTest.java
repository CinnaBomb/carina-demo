package com.qaprosoft.carina.demo;

import org.openqa.selenium.WebDriver;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import org.testng.asserts.SoftAssert;

import com.qaprosoft.carina.demo.gui.pages.CreateAPagePage;
import com.qaprosoft.carina.demo.gui.pages.FacebookLoginPage;
import com.qaprosoft.carina.demo.gui.pages.FacebookMainActivityPage;
import com.qaprosoft.carina.demo.gui.pages.FindYourAccountPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class FacebookLoginSampleTest extends AbstractTest {
	private static final Logger LOGGER = LogManager.getLogger(FacebookLoginSampleTest.class);

	@Test(testName = "testLogin", description = "Test Facebook login with valid credentials")
	public void testLogin() {
		WebDriver driver = getDriver();
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		loginPage.open();
		FacebookMainActivityPage facebookMainActivityPage = loginPage.login("GoodLoginUsername", "GoodPassword");
		facebookMainActivityPage.isPageOpened();
		LOGGER.info("User successfully logged in to Facebook.");
		driver.quit();
	}

	@Test(testName = "testIncorrectLogin", description = "Test Facebook login with incorrect credentials")
	public void testIncorrectLogin() {
		WebDriver driver = getDriver();
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		loginPage.open();
		loginPage.login("BadUsername", "IncorrectPassword");
		loginPage.isPageOpened();
		LOGGER.info("User was not able to login with incorrect credentials.");
		driver.quit();
	}

	@Test
	public void testForgotPassword() {
		WebDriver driver = getDriver();
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		loginPage.open();
		FindYourAccountPage findYourAccountPage = loginPage.clickForgotPasswordLink();
		findYourAccountPage.isPageOpened();
		LOGGER.info("Find Your Account page opened successfully.");
		driver.quit();
	}

	@Test(testName = "testCreateAPage", description = "Test clicking the Create a Page link and opening the CreateAPagePage")
	public void testCreateAPage() {
		WebDriver driver = getDriver();
		FacebookLoginPage loginPage = new FacebookLoginPage(driver);
		loginPage.open();
		CreateAPagePage createAPagePage = loginPage.clickCreateAPageLink();
		createAPagePage.isPageOpened();
		LOGGER.info("Create A Page Page opened successfully.");
		driver.quit();
	}

}
