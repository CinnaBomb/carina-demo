package com.qaprosoft.carina.demo.gui.pages.components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class TitleBarComponent extends AbstractUIObject implements SearchContext {

    @FindBy(xpath = "//input[@id='header-form-search-input']")
    private ExtendedWebElement searchTextInput;

    @FindBy(xpath = "//button[@id='header-form-search-button']")
    private ExtendedWebElement searchIconButton;

    @FindBy(xpath = "//div[contains(@class, 'aol-support-button')]")
    private ExtendedWebElement phoneIconButton;

    @FindBy(xpath = "//a[@class='profile-button']/span[contains(text(),'Login / Join')]")
    private ExtendedWebElement profileLoginJoinButton;

    @FindBy(xpath = "//*[@title='mail icon']")
    private ExtendedWebElement mailIcon;

    public TitleBarComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getProfileLoginJoinButton() {
        return profileLoginJoinButton;
    }

    public ExtendedWebElement getMailIcon() {
        return mailIcon;
    }

    public boolean isPresent() {
        return searchTextInput.isPresent() &&
                searchIconButton.isPresent() &&
                phoneIconButton.isPresent() &&
                profileLoginJoinButton.isPresent() &&
                mailIcon.isPresent();
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
