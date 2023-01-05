package org.tms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.tms.driver.DriverSingleton;

import java.time.Duration;
import java.util.List;

public abstract class BasePage {

    private static final long WAIT_TIMEOUT_SECONDS = 3000;
    protected WebDriver driver = DriverSingleton.getInstance().getDriver();

    protected BasePage(){
        PageFactory.initElements(driver, this);
    }

    protected WebElement waitVisibilityOf(WebElement element) {
        return new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement waitClickableOf(WebElement element) {
        return (WebElement) new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(ExpectedConditions.elementToBeClickable(element));
    }


}


