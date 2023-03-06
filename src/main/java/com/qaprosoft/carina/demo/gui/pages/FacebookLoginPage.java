package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class FacebookLoginPage extends AbstractPage{

    private WebDriver driver;

    @FindBy(xpath = "//*[@id='email']")
    private ExtendedWebElement emailOrPhoneInput;

    @FindBy(xpath = "//*[@id='pass']")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//button[@name='login']")
    private ExtendedWebElement logInButton;

    @FindBy(xpath = "//a[text()='Forgot password?']")
    private ExtendedWebElement forgotPasswordLink;

    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    private ExtendedWebElement createNewAccountButton;

    @FindBy(xpath = "//a[text()='Create a Page']")
    private ExtendedWebElement createAPageLink;

    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("facebook.com");
    }
    
    public FacebookMainActivityPage login(String login, String password) {
    	emailOrPhoneInput.click();
    	emailOrPhoneInput.getElement().sendKeys(login);
    	passwordInput.click();
    	passwordInput.getElement().sendKeys(password);
    	logInButton.click();
        FacebookMainActivityPage facebookMainActivityPage = new FacebookMainActivityPage(driver);
        facebookMainActivityPage.isPageOpened();
    	return facebookMainActivityPage;
    }

    @Override
    public boolean isPageOpened() {
        return emailOrPhoneInput.isPresent() && logInButton.isPresent();
    }
}
