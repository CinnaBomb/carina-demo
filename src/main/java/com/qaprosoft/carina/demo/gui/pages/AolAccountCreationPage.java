package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class AolAccountCreationPage  extends AbstractPage {
	
	private ExtendedWebElement continueButton;
	
	public AolAccountCreationPage(WebDriver driver) {
		super(driver);
	}

	public ExtendedWebElement getContinueButton() {
		return continueButton;
	}
	
	@Override
	public boolean isPageOpened() {
		return continueButton.isPresent();
	}
}
