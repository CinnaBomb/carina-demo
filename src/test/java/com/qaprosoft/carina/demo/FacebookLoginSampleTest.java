package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.pages.CreateAPagePage;
import com.qaprosoft.carina.demo.gui.pages.FacebookLoginPage;
import com.qaprosoft.carina.demo.gui.pages.FacebookMainActivityPage;
import com.qaprosoft.carina.demo.gui.pages.FindYourAccountPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookLoginSampleTest extends AbstractTest {
	private static final Logger LOGGER = LogManager.getLogger(FacebookLoginSampleTest.class);

	@Test(testName = "testLogin", description = "Test Facebook login with valid credentials")
	public void testLogin() {
		FacebookLoginPage loginPage = new FacebookLoginPage(getDriver());
		loginPage.open();
		FacebookMainActivityPage facebookMainActivityPage = loginPage.login("GoodLoginUsername", "GoodPassword");
		Assert.assertTrue(facebookMainActivityPage.isPageOpened(), "User was not logged into facebook.");
		LOGGER.info("User successfully logged in to Facebook.");
	}

	@Test(testName = "testIncorrectPasswordLogin", description = "Test Facebook login with incorrect credentials")
	public void testIncorrectLogin() {
		FacebookLoginPage loginPage = new FacebookLoginPage(getDriver());
		loginPage.open();
		loginPage.login("BadLoginUsername", "IncorrectPassword");
		Assert.assertTrue(loginPage.isPageOpened(), "User was able to login with incorrect credentials");
		LOGGER.info("User was unable to login due to incorrect credentials.");
	}

	@Test
	public void testForgotPassword() {
		FacebookLoginPage loginPage = new FacebookLoginPage(getDriver());
		loginPage.open();
		FindYourAccountPage findYourAccountPage = loginPage.clickForgotPasswordLink();
		Assert.assertTrue(findYourAccountPage.isPageOpened(), "Find Your Account Page is not opened");
		LOGGER.info("Find Your Account page opened successfully.");
	}

	@Test(testName = "testCreateAPage", description = "Test clicking the Create a Page link and opening the CreateAPagePage")
	public void testCreateAPage() {
		FacebookLoginPage loginPage = new FacebookLoginPage(getDriver());
		loginPage.open();
		CreateAPagePage createAPagePage = loginPage.clickCreateAPageLink();
		 Assert.assertTrue(createAPagePage.isPageOpened(), "Create A Page Page is not opened!");
		 LOGGER.info("Create A Page Page opened successfully.");
	}

}
