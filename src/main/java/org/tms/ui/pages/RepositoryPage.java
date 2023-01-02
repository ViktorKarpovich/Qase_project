package org.tms.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepositoryPage extends BasePage{

    private final static String NEW_SUITE_NAME = "Test Suite Name1";
    private final static String NEW_SUITE_DESCRIPTION = "Test Description1";
    private final static String NEW_SUITE_PRECONDITIONS = "Test suit preconditions1";
    private final static String NEW_TEST_CASE_TITLE = "Test title for test case";

    @FindBy(xpath = "//div[@class='dGJtKy']")
    public WebElement repositoryImage;
    @FindBy(xpath = "//span[contains(.,'Create new suite')]")
    public WebElement createNewSuiteButton;
    @FindBy(xpath = "//input[@id='name']")
    public WebElement suiteNameField;
    @FindBy(xpath = "//*[@id=\"descriptionGroup\"]/div[1]/div/div/div[2]/div/div[2]/div/div/p")
    public WebElement descriptionField;
    @FindBy(xpath = "//*[@id=\"preconditionsGroup\"]/div[1]/div/div/div[2]/div/div[2]/div/div/p")
    public WebElement preconditionsField;
    @FindBy(xpath = "//button[contains(.,'Import')]")
    public WebElement importButton;
    @FindBy(xpath = "//span[contains(.,'Suite was successfully created.')]")
    public WebElement textOfSuccessNotification;
    @FindBy(xpath = "//i[@class='far fa-trash']")
    public WebElement trashButton;
    @FindBy(xpath = "//span[contains(.,'Delete')]")
    public WebElement deleteButton;
    @FindBy(xpath = "//span[contains(.,'Suite was successfully deleted.')]")
    public WebElement textOfRemovingNotification;


    public void clickCreateNewSuiteButton(){
        createNewSuiteButton.click();
    }
    public RepositoryPage waitRepositoryLoaded(){
        waitVisibilityOf(repositoryImage);
        return this;
    }
    public void fillSuiteNameField(){
        suiteNameField.sendKeys(NEW_SUITE_NAME);
    }
    public void fillDescriptionField(){
        descriptionField.sendKeys(NEW_SUITE_DESCRIPTION);
    }
    public void fillPreconditionsField(){
        preconditionsField.sendKeys(NEW_SUITE_PRECONDITIONS);
    }
    public void clickImportButton(){
        importButton.click();
    }
    public RepositoryPage waitTextOfSuccessNotificationLoaded(){
        waitVisibilityOf(textOfSuccessNotification);
        return this;
    }
    public String getNameOfSuccessNotification(){
        return textOfSuccessNotification.getText();
    }
    public void clickTrashButton(){
        trashButton.click();
    }
    public RepositoryPage waitTrashButtonLoaded(){
        waitVisibilityOf(trashButton);
        return this;
    }
    public void clickDeleteButton(){
        deleteButton.click();
    }
    public RepositoryPage waitTextOfRemovingNotificationLoaded(){
        waitVisibilityOf(textOfRemovingNotification);
        return this;
    }
    public String getNameOfRemovingNotification(){
        return textOfRemovingNotification.getText();
    }

}
