package org.tms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepositoryPage extends BasePage{

    private String newSuiteName = "Test Suite Name1";
    private String newSuiteDescription = "Test Description1";
    private String newSuitePreconditions = "Test suit preconditions1";

    @FindBy(xpath = "//div[@class='dGJtKy']")
    public WebElement repositoryImage;

    @FindBy(xpath = "//span[contains(.,'Create new suite')]")
    public WebElement createNewSuiteButton;

    public void clickCreateNewSuiteButton(){
        createNewSuiteButton.click();
    }

    public RepositoryPage waitRepositoryLoaded(){
        waitVisibilityOf(repositoryImage);
        return this;
    }

    @FindBy(xpath = "//a[contains(.,'Create new case')]")
    public WebElement createNewCaseButton;

    public void clickCreateNewCaseButton(){
        createNewSuiteButton.click();
    }

    @FindBy(xpath = "//input[@id='name']")
    public WebElement suiteNameField;

    public void fillSuiteNameField(){
        suiteNameField.sendKeys(newSuiteName);
    }

    @FindBy(xpath = "//*[@id=\"descriptionGroup\"]/div[1]/div/div/div[2]/div/div[2]/div/div/p")
    public WebElement descriptionField;

    public void fillDescriptionField(){
        descriptionField.sendKeys(newSuiteDescription);
    }

    @FindBy(xpath = "//*[@id=\"preconditionsGroup\"]/div[1]/div/div/div[2]/div/div[2]/div/div/p")
    public WebElement preconditionsField;

    public void fillPreconditionsField(){
        preconditionsField.sendKeys(newSuitePreconditions);
    }

    @FindBy(xpath = "//button[contains(.,'Import')]")
    public WebElement importButton;

    public void clickImportButton(){
        importButton.click();
    }

    @FindBy(xpath = "//span[contains(.,'Suite was successfully created.')]")
    public WebElement textOfSuccessNotification;

    public RepositoryPage waitTextOfSuccessNotificationLoaded(){
        waitVisibilityOf(textOfSuccessNotification);
        return this;
    }
    public String getNameOfSuccessNotification(){
        return textOfSuccessNotification.getText();
    }

    @FindBy(xpath = "//i[@class='far fa-trash']")
    public WebElement trashButton;

    public void clickTrashButton(){
        trashButton.click();
    }

    public RepositoryPage waitTrashButtonLoaded(){
        waitVisibilityOf(trashButton);
        return this;
    }

    @FindBy(xpath = "//span[contains(.,'Delete')]")
    public WebElement deleteButton;

    public void clickDeleteButton(){
        deleteButton.click();
    }

    @FindBy(xpath = "//span[contains(.,'Suite was successfully deleted.')]")
    public WebElement textOfRemovingNotification;

    public RepositoryPage waitTextOfRemovingNotificationLoaded(){
        waitVisibilityOf(textOfRemovingNotification);
        return this;
    }
    public String getNameOfRemovingNotification(){
        return textOfRemovingNotification.getText();
    }





}
