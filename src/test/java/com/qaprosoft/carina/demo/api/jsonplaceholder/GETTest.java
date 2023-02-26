package com.qaprosoft.carina.demo.api.jsonplaceholder;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.webdriver.IDriverPool;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.foundation.webdriver.locator.LocatorType;
import com.qaprosoft.carina.core.foundation.webdriver.locator.ExtendedElementLocator;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class GETTest implements IAbstractTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(GETTest.class);
/*
    @Test(description = "Test GET endpoint of JSONPlaceholder API")
    @MethodOwner(owner = "Laura")
    public void testGetJsonPlaceholderTodo() throws IOException {
        GetTodoMethod api = new GetTodoMethod();
        api.expectResponseStatus(200);
        api.callAPI();
        String response = api.getResponseBody();
        LOGGER.info(response);
    }
*/
}
