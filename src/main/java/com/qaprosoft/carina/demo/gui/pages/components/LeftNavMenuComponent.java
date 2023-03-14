package com.qaprosoft.carina.demo.gui.pages.components;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class LeftNavMenuComponent extends AbstractUIObject implements SearchContext{

    @FindBy(xpath = "//*[@class='user-profile-button']")
    private ExtendedWebElement profileLoginJoinButton;

    @FindBy(xpath = "//*[@title='Mail']")
    private ExtendedWebElement mailLink;

    public ExtendedWebElement getMailLink() {
		return mailLink;
	}

	public void setMailLink(ExtendedWebElement mailLink) {
		this.mailLink = mailLink;
	}

	public LeftNavMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

	public ExtendedWebElement getProfileLoginJoinButton() {
        return profileLoginJoinButton;
    }

    public boolean isPresent() {
        return profileLoginJoinButton.isElementPresent() && mailLink.isElementPresent();
    }

	@Override
	public List<WebElement> findElements(By by) {
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		return null;
	}
}