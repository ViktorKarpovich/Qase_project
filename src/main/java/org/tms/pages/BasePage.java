package org.tms.pages;

import org.openqa.selenium.WebDriver;
import org.tms.driver.DriverSingleton;

public abstract class BasePage {

    protected WebDriver driver = DriverSingleton.getDriver();
}
