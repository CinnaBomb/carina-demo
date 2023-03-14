package com.qaprosoft.carina.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.demo.gui.pages.AolAccountCreationPage;
import com.qaprosoft.carina.demo.gui.pages.AolHomePage;
import com.qaprosoft.carina.demo.gui.pages.components.LeftNavMenuComponent;
import com.qaprosoft.carina.demo.gui.pages.components.TitleBarComponent;
import com.qaprosoft.carina.demo.gui.pages.AolSignInPage;

public class AolSampleTest extends AbstractTest {
	private static final Logger LOGGER = LogManager.getLogger(AolSampleTest.class);

	@Test(testName = "testLeftNavProfileButton", description = "Left Nav-> Profile Button -> SignInpage")
	public void testSignIn() {
		AolHomePage homeLoginPage = new AolHomePage(getDriver());
		homeLoginPage.open();
		LeftNavMenuComponent leftNavMenu = new LeftNavMenuComponent(getDriver(), homeLoginPage.getLeftNavMenuComponent());
		leftNavMenu.getProfileLoginJoinButton().click();
		AolSignInPage signInPage = new AolSignInPage(getDriver());
		Assert.assertTrue(signInPage.isPageOpened(), "AolSignInPage is not opened.");
        LOGGER.info("AolSignInPage opened successfully.");
	}
	
    @Test(testName = "testLeftNavMailButton", description = "Left Nav-> Mail Button -> SignInpage")
    public void testMailLink() {
        AolHomePage homeLoginPage = new AolHomePage(getDriver());
        homeLoginPage.open();
        LeftNavMenuComponent leftNavMenuComponent = new LeftNavMenuComponent(getDriver(), homeLoginPage.getLeftNavMenuComponent());
        leftNavMenuComponent.getMailLink().click();
        AolSignInPage signInPage  = new AolSignInPage(getDriver());
        Assert.assertTrue(signInPage.isPageOpened(), "AolSignInPage not opened.");
        LOGGER.info("AolSignInPage opened successfully.");
    }
    
    @Test(testName = "testTitleBarProfileButton", description = "Title Bar -> Profile Button -> SignIn page")
    public void testTitleBarProfileButton() {
        AolHomePage homeLoginPage = new AolHomePage(getDriver());
        homeLoginPage.open();
        TitleBarComponent titleBarComponent = new TitleBarComponent(getDriver(), homeLoginPage.getTitleBarComponent());
        titleBarComponent.getProfileLoginJoinButton().click();
        AolSignInPage signInPage = new AolSignInPage(getDriver());
        Assert.assertTrue(signInPage.isPageOpened(), "AolSignInPage not opened.");
        LOGGER.info("AolSignInPage opened successfully.");
    }
    
    @Test(testName = "testTitleBarMailIcon", description = "Title Bar -> Mail Icon -> SignInpage")
    public void testTitleBarMailIcon() {
        AolHomePage homeLoginPage = new AolHomePage(getDriver());
        homeLoginPage.open();
        homeLoginPage.getTitleBarComponent().getMailIcon().click();
        AolSignInPage signInPage = new AolSignInPage(getDriver());
        Assert.assertTrue(signInPage.isPageOpened(), "AolSignInPage not opened.");
        LOGGER.info("AolSignInPage opened successfully.");
    }
    
    @Test(testName = "testCreateAnAccountButton", description = "Create an Account Button leads to Account Creation Page")
    public void testCreateAnAccountButton() {
    	AolSignInPage signInPage = new AolSignInPage(getDriver());
    	signInPage.getCreateAnAccountButton().click();
    	AolAccountCreationPage accountCreationPage = new AolAccountCreationPage(getDriver());
    	Assert.assertTrue(accountCreationPage.isPageOpened(), "AolAccountCreationPage is not opened");
        LOGGER.info("AolAccountCreationPage is opened");
    }
    
    @Test(testName = "testAccountCreationContinueButtonWithNoFieldsFilledIn", description = "Account Creation Page -> Don't fill in any fields -> Click continue")
    public void testAccountCreationContinueButtonWithNoFieldsFilledIn() {
    	AolAccountCreationPage accountCreationPage = new AolAccountCreationPage(getDriver());
    	accountCreationPage.open();
    	accountCreationPage.getContinueButton().click();
    	Assert.assertTrue(accountCreationPage.isPageOpened(), "Account creation is successful with missing fields.");
        LOGGER.info("AolAccountCreationPage stays open when fields are missing");
    }
    
}