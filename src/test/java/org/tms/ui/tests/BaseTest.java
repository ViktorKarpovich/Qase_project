package org.tms.ui.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.tms.ui.driver.DriverSingleton;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void startBrowser() {
        driver = DriverSingleton.getDriver();
    }

    /*@AfterClass(alwaysRun = true)
    public void stopBrowser(){
        DriverSingleton.closeBrowser();
    }*/
}
