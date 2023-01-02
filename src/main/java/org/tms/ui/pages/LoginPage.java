package org.tms.ui.pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.tms.ui.utils.TestListener;

@Log4j2
public class LoginPage extends BasePage{
    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='btnLogin']")
    private WebElement loginButton;


    @Step("Step 1, opening login page")
    public LoginPage openPage(String url) {
        log.info("Step 1, opening login page");
        driver.get(url);
        TestListener.takeScreenshot();
        return this;
    }
    @Step("Step 2, filling email address field")
    public LoginPage fillInEmailAddress(String addressEmail){
        emailAddress.clear();
        log.info("Step 2, filling email address field");
        emailAddress.sendKeys(addressEmail);
        TestListener.takeScreenshot();
        return this;
    }
    @Step("Step 3, filling password field")
    public LoginPage fillInPassword(String passWord){
        password.clear();
        log.info("Step 3, filling password field");
        password.sendKeys(passWord);
        TestListener.takeScreenshot();
        return this;
    }
    @Step("Step 4, click on login button")
    public void clickOnLoginButton(){
        log.info("Step 4, click on login button");
        loginButton.click();
    }
}
