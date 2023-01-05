package org.tms.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepositoryPage extends BasePage{

    private final static String NEW_SUITE_NAME = "Test Suite Name1";
    private final static String NEW_SUITE_DESCRIPTION = "Test Description1";
    private final static String NEW_SUITE_PRECONDITIONS = "Test suit preconditions1";

    @FindBy(xpath = "//div[@class='dGJtKy']")
    private WebElement repositoryImage;
    @FindBy(xpath = "//span[contains(.,'Create new suite')]")
    private WebElement createNewSuiteButton;
    @FindBy(xpath = "//input[@id='title']")
    public WebElement suiteNameField;
    @FindBy(xpath = "//span[contains(.,'Suite was successfully created.')]")
    private WebElement textOfSuccessNotification;
    @FindBy(xpath = "//i[@class='far fa-trash']")
    private WebElement trashButton;
    @FindBy(xpath = "//span[contains(.,'Delete')]")
    private WebElement deleteButton;
    @FindBy(xpath = "//span[contains(.,'Suite was successfully deleted.')]")
    private WebElement textOfRemovingNotification;


    @Step("Step 1, clicking the 'Create new suite' button")
    public void clickCreateNewSuiteButton(){
        waitVisibilityOf(createNewSuiteButton).click();
    }

    @Step("Step 2, filling the 'Suite name' field and submitting form")
    public void fillSuiteNameField(){
        waitVisibilityOf(suiteNameField);
        suiteNameField.sendKeys(NEW_SUITE_NAME);
    }

    public void waitMessageLoaded(){
        waitVisibilityOf(textOfSuccessNotification);
    }
    public String getNameOfSuccessNotification(){
        return textOfSuccessNotification.getText();
    }
    @Step("Step 1, clicking the 'Trash' button")
    public void clickTrashButton(){
        waitVisibilityOf(trashButton);
        trashButton.click();
    }
    @Step("Step 2, clicking the 'Delete' button")
    public void clickDeleteButton(){
        deleteButton.click();
        waitVisibilityOf(textOfRemovingNotification);
    }
    public String getNameOfRemovingNotification(){
        return textOfRemovingNotification.getText();
    }

}
