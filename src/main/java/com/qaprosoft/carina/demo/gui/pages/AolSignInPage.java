package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class AolSignInPage extends AbstractPage {

	@FindBy(xpath = "//strong[@class='challenge-heading' and contains(text(),'Sign')]")
	private ExtendedWebElement pageTitle;

	public AolSignInPage(WebDriver driver) {
		super(driver);
	}

	public ExtendedWebElement getPageTitle() {
		return pageTitle;
	}

	@Override
	public boolean isPageOpened() {
		return pageTitle.isPresent();
	}
}
