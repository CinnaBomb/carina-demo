package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class FindYourAccountPage extends AbstractPage {

    @FindBy(xpath = "//h2[text()=\"Find your account\"]")
    private ExtendedWebElement pageTitle;

    public FindYourAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return pageTitle.isElementPresent();
    }

}
