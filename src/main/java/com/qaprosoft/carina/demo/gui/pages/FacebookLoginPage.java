package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;

public class FacebookLoginPage extends AbstractPage{

    private WebDriver driver;

    @FindBy(xpath = "//*[@id='email']")
    private WebElement emailOrPhoneInput;

    @FindBy(xpath = "//*[@id='pass']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@name='login']")
    private WebElement logInButton;

    @FindBy(xpath = "//a[text()='Forgot password?']")
    private WebElement forgotPasswordLink;

    @FindBy(xpath = "//a[@data-testid='open-registration-form-button']")
    private WebElement createNewAccountButton;

    @FindBy(xpath = "//a[text()='Create a Page']")
    private WebElement createAPageLink;

    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("facebook.com");
    }

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmailOrPhoneInput() {
		return emailOrPhoneInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getLogInButton() {
		return logInButton;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getCreateNewAccountButton() {
		return createNewAccountButton;
	}

	public WebElement getCreateAPageLink() {
		return createAPageLink;
	}
    
    
}