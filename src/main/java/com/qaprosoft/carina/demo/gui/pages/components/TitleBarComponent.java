package com.qaprosoft.carina.demo.gui.pages.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class TitleBarComponent extends AbstractPage {

    @FindBy(xpath = "//div[@class='title-bar']//input[@id='header-form-search-input']")
    private ExtendedWebElement searchTextInput;

    @FindBy(xpath = "//div[@class='title-bar']//button[@id='header-form-search-button']")
    private ExtendedWebElement searchIconButton;

    @FindBy(xpath = "//div[@class='title-bar']//div[contains(@class, 'aol-support-button')]")
    private ExtendedWebElement phoneIconButton;

    @FindBy(xpath = "//div[@class='title-bar']//a[@class='profile-button']/span[contains(text(),'Login / Join')]")
    private ExtendedWebElement profileLoginJoinButton;

    @FindBy(xpath = "//div[@class='title-bar']//*[@title='mail icon']")
    private ExtendedWebElement mailIcon;

    public TitleBarComponent(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getSearchTextInput() {
        return searchTextInput;
    }

    public ExtendedWebElement getSearchIconButton() {
        return searchIconButton;
    }

    public ExtendedWebElement getPhoneIconButton() {
        return phoneIconButton;
    }

    public ExtendedWebElement getProfileLoginJoinButton() {
        return profileLoginJoinButton;
    }

    public ExtendedWebElement getMailIcon() {
        return mailIcon;
    }

    public boolean isPresent() {
        return getSearchTextInput().isElementPresent() &&
                getSearchIconButton().isElementPresent() &&
                getPhoneIconButton().isElementPresent() &&
                getProfileLoginJoinButton().isElementPresent() &&
                getMailIcon().isElementPresent();
    }


}
