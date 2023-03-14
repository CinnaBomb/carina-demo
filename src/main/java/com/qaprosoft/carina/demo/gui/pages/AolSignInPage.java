package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class AolSignInPage extends AbstractPage {

	@FindBy(xpath = "//strong[@class='challenge-heading' and contains(text(),'Sign')]")
	private ExtendedWebElement pageTitle;
	
	@FindBy(id="createacc")
	private ExtendedWebElement createAnAccountButton;

	public AolSignInPage(WebDriver driver) {
		super(driver);
	}

	@Override
	public boolean isPageOpened() {
		return pageTitle.isPresent();
	}

	public ExtendedWebElement getCreateAnAccountButton() {
		return createAnAccountButton;
	}

}
