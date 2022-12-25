package org.tms.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.ui.driver.DriverSingleton;

import java.time.Duration;

public abstract class BasePage {

    private static final long WAIT_TIMEOUT_SECONDS = 1000;
    protected WebDriver driver = DriverSingleton.getDriver();

    protected BasePage(){
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitVisibilityOf(WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.visibilityOf(element));
    }
}


