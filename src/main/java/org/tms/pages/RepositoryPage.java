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
    @FindBy(xpath = "//input[@id='name']")
    public WebElement suiteNameField;
    @FindBy(xpath = "//*[@id=\"descriptionGroup\"]/div[1]/div/div/div[2]/div/div[2]/div/div/p")
    private WebElement descriptionField;
    @FindBy(xpath = "//*[@id=\"preconditionsGroup\"]/div[1]/div/div/div[2]/div/div[2]/div/div/p")
    private WebElement preconditionsField;
    @FindBy(xpath = "//button[contains(.,'Import')]")
    private WebElement importButton;
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
        waitVisibilityOf(repositoryImage);
        createNewSuiteButton.click();
    }

    @Step("Step 4, filling the 'Suite name' field and submitting form")
    public void fillSuiteNameField(){
        suiteNameField.sendKeys(NEW_SUITE_NAME);
    }
    @Step("Step 2, filling the 'Description' field")
    public void fillDescriptionField(){
        descriptionField.sendKeys(NEW_SUITE_DESCRIPTION);
    }
    @Step("Step 3, filling the 'Preconditions' field")
    public void fillPreconditionsField(){
        preconditionsField.sendKeys(NEW_SUITE_PRECONDITIONS);
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
