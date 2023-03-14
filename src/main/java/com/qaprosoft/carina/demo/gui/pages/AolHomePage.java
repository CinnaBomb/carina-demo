package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pages.components.LeftNavMenuComponent;
import com.qaprosoft.carina.demo.gui.pages.components.TitleBarComponent;
import com.zebrunner.carina.utils.Configuration;

public class AolHomePage extends AbstractPage {

	@FindBy(xpath = "//div[@class='title-bar']")
	private TitleBarComponent titleBarComponent;
	
	@FindBy(id="header-lnav")
	private LeftNavMenuComponent leftNavMenuComponent;

	public AolHomePage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL(Configuration.getEnvArg("base"));
	}

	public TitleBarComponent getTitleBarComponent() {
		return titleBarComponent;
	}

	public LeftNavMenuComponent getLeftNavMenuComponent() {
		return leftNavMenuComponent;
	}

	@Override
	public boolean isPageOpened() {
		return titleBarComponent.isPresent() && leftNavMenuComponent.isPresent();
	}

}
