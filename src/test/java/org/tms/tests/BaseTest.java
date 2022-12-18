package org.tms.tests;

import net.bytebuddy.utility.nullability.AlwaysNull;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.tms.driver.DriverSingleton;

import java.sql.Driver;

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
