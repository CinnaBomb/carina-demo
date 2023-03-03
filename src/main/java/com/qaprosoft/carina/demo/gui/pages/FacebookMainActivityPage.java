package com.qaprosoft.carina.demo.gui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookMainActivityPage {

    @FindBy(xpath = "//svg[contains(@aria-label, 'Your profile')]")
    private WebElement yourProfileIconButton;

    public FacebookMainActivityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getYourProfileIconButton() {
        return yourProfileIconButton;
    }
}
