package com.qaprosoft.carina.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.pages.AolHomePage;
import com.qaprosoft.carina.demo.gui.pages.components.LeftNavMenuComponent;
import com.qaprosoft.carina.demo.gui.pages.components.TitleBarComponent;
import com.qaprosoft.carina.demo.gui.pages.AolSignInPage;

public class AolSampleTest extends AbstractTest {
	private static final Logger LOGGER = LogManager.getLogger(AolSampleTest.class);

	@Test(testName = "testLeftNavProfileButton", description = "Left Nav-> Profile Button -> SignInpage")
	public void testSignIn() {
		WebDriver driver = getDriver();
		AolHomePage homeLoginPage = new AolHomePage(driver);
		homeLoginPage.open();

		LeftNavMenuComponent leftNavMenu = new LeftNavMenuComponent(driver);
		leftNavMenu.getProfileLoginJoinButton().click();

		AolSignInPage signInPage = new AolSignInPage(driver);
		signInPage.isPageOpened();
        LOGGER.info("AolSignInPage opened successfully!");
        driver.quit();
	}
	
    @Test(testName = "testLeftNavMailButton", description = "Left Nav-> Mail Button -> SignInpage")
    public void testMailLink() {
        WebDriver driver = getDriver();
        AolHomePage homePage = new AolHomePage(driver);
        homePage.open();
        LeftNavMenuComponent leftNavMenuComponent = new LeftNavMenuComponent(driver);
        leftNavMenuComponent.getMailLink().click();
        AolSignInPage signInPage = homePage.getLeftNavMenuComponent().clickMailLink();
        signInPage.isPageOpened();
        LOGGER.info("AolSignInPage opened successfully!");
        driver.quit();
    }
    
    @Test(testName = "testTitleBarProfileButton", description = "Title Bar -> Profile Button -> SignIn page")
    public void testTitleBarProfileButton() {
        WebDriver driver = getDriver();
        AolHomePage homePage = new AolHomePage(driver);
        homePage.open();
        homePage.getTitleBarComponent().getProfileLoginJoinButton().click();
        AolSignInPage signInPage = new AolSignInPage(driver);
        signInPage.isPageOpened();
        LOGGER.info("AolSignInPage opened successfully!");
        driver.quit();
    }
    @Test(testName = "testTitleBarMailIcon", description = "Title Bar -> Mail Icon -> SignInpage")
    public void testTitleBarMailIcon() {
        WebDriver driver = getDriver();
        AolHomePage homePage = new AolHomePage(driver);
        homePage.open();
        homePage.getTitleBarComponent().getMailIcon().click();
        AolSignInPage signInPage = new AolSignInPage(driver);
        signInPage.isPageOpened();
        LOGGER.info("AolSignInPage opened successfully!");
        driver.quit();
    }

}