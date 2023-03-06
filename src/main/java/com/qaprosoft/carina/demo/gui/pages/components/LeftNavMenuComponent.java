package com.qaprosoft.carina.demo.gui.pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pages.AolSignInPage;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class LeftNavMenuComponent extends AbstractPage {

    @FindBy(xpath = "//*[@class='user-profile-button']")
    private ExtendedWebElement profileLoginJoinButton;

    @FindBy(xpath = "//*[@title='Mail']")
    private ExtendedWebElement mailLink;

    public LeftNavMenuComponent(WebDriver driver) {
    	super(driver);
	}

	public ExtendedWebElement getProfileLoginJoinButton() {
        return profileLoginJoinButton;
    }

    public ExtendedWebElement getMailLink() {
        return mailLink;
    }

    public boolean isPresent() {
        return profileLoginJoinButton.isElementPresent() && mailLink.isElementPresent();
    }

	public AolSignInPage clickMailLink() {
		// TODO Auto-generated method stub
		return null;
	}

}