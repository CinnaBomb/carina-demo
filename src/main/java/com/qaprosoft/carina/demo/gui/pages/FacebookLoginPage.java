package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.Configuration;

public class FacebookLoginPage extends AbstractPage {

	@FindBy(id="email")
	private ExtendedWebElement emailOrPhoneInput;

	@FindBy(id="pass")
	private ExtendedWebElement passwordInput;

	@FindBy(name="login")
	private ExtendedWebElement logInButton;

	@FindBy(linkText="Forgot password?")
	private ExtendedWebElement forgotPasswordLink;

	@FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
	private ExtendedWebElement createNewAccountButton;

	@FindBy(linkText="Create a Page")
	private ExtendedWebElement createAPageLink;

	public FacebookLoginPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL(Configuration.getEnvArg("base"));
	}

	public FacebookMainActivityPage login(String login, String password) {
		emailOrPhoneInput.click();
		emailOrPhoneInput.type(login);
		passwordInput.click();
		passwordInput.type(password);
		logInButton.click();
		return new FacebookMainActivityPage(getDriver());
	}

	@Override
	public boolean isPageOpened() {
		return emailOrPhoneInput.isPresent() && logInButton.isPresent();
	}

	public FindYourAccountPage clickForgotPasswordLink() {
		forgotPasswordLink.click();
		return new FindYourAccountPage(getDriver());
	}

	public CreateAPagePage clickCreateAPageLink() {
		createAPageLink.click();
		return new CreateAPagePage(getDriver());
	}

}
