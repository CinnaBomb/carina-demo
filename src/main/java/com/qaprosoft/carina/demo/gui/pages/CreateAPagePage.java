package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

import org.openqa.selenium.support.FindBy;

public class CreateAPagePage extends AbstractPage{

    @FindBy(xpath = "//div[@data-testid='pageCreationHeaderBannerTitle']")
    private ExtendedWebElement createAPageHeader;

    public CreateAPagePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return createAPageHeader.isElementPresent();
    }

    public ExtendedWebElement getCreateAPageHeader() {
        return createAPageHeader;
    }
}

