package org.tms.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement password;

    @FindBy(xpath = "//button[@id='btnLogin']")
    private WebElement loginButton;

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage fillInEmailAddress(String addressEmail){
        emailAddress.clear();
        emailAddress.sendKeys(addressEmail);
        return this;
    }

    public LoginPage fillInPassword(String passWord){
        password.clear();
        password.sendKeys(passWord);
        return this;
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }
}
