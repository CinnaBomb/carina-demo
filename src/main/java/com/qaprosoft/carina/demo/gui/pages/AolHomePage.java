package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pages.components.LeftNavMenuComponent;
import com.qaprosoft.carina.demo.gui.pages.components.TitleBarComponent;

public class AolHomePage extends AbstractPage {

	private WebDriver driver;

	private TitleBarComponent titleBarComponent;
	private LeftNavMenuComponent leftNavMenuComponent;

	public AolHomePage(WebDriver driver) {
		super(driver);
		titleBarComponent = new TitleBarComponent(driver);
		leftNavMenuComponent = new LeftNavMenuComponent(driver);
		setPageURL("aol.com");
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
