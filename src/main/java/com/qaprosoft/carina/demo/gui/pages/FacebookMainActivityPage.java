package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class FacebookMainActivityPage extends AbstractPage{

    @FindBy(xpath = "//svg[contains(@aria-label, 'Your profile')]")
    private ExtendedWebElement yourProfileIconButton;

    public FacebookMainActivityPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ExtendedWebElement getYourProfileIconButton() {
        return yourProfileIconButton;
    }

    @Override
    public boolean isPageOpened() {
        return yourProfileIconButton.isElementPresent();
    }
}
