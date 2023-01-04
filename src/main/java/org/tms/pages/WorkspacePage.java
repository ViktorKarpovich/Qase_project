package org.tms.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkspacePage extends BasePage{
    private static final String ROLE_TITLE_OF_NEW_USER = "vtest12";
    private static final String GROUP_TITLE_NEW_GROUP = "Test group title1";
    private static final String GROUP_DESCRIPTION_NEW_GROUP = "Test group description";

    @FindBy(xpath = "//div[@class='team-member-name-block']")
    private WebElement userSection;
    @FindBy(xpath = "//a[@class='btn btn-dropdown']")
    private WebElement dropdownUserSettingsButton;
    @FindBy(xpath = "//a[@class='action-settings']")
    private WebElement editProfileButton;
    @FindBy(xpath = "//h2[contains(text(), 'Profile settings')]")
    private WebElement profileSettingsText;
    @FindBy(id = "inputRole")
    private WebElement positionTitleField;
    @FindBy(xpath = "//button[contains(text(), 'Update settings')]")
    private WebElement updateSettingsButton;
    @FindBy(xpath = "//span[contains(.,'Profile data was successfully updated.')]")
    private WebElement textOfSuccessNotification;
    @FindBy(xpath = "//span[contains(.,'Groups')]")
    private WebElement groupsTab;
    @FindBy(xpath = "//a[@data-qase-test='create-new-group-button']")
    private WebElement createNewGroupButton;
    @FindBy(id = "inputTitle")
    private WebElement groupTitleField;
    @FindBy(id = "inputDescription")
    private WebElement descriptionOfNewGroup;
    @FindBy(xpath = "//button[contains(.,'Create')]")
    private WebElement createGroupButton;
    @FindBy(xpath = "//span[contains(.,'Group was created successfully!')]")
    private WebElement textOfSuccessGroupCreation;
    @FindBy(xpath = "//a[@class='btn btn-dropdown']")
    private WebElement optionsButtonOfGroup;
    @FindBy(xpath = "//a[contains(.,'Delete')]")
    private WebElement deleteButton;
    @FindBy(xpath = "//button[@data-qase-test='group-delete-confirm-button']")
    private WebElement deleteGroupButton;
    @FindBy(xpath = "//span[contains(.,'was deleted successfully!')]")
    private WebElement textOfSuccessGroupDeletion;

    @Step("Step 1, clicking 'User settings' dropdown")
    public void clickDropdownUserSettingButton(){
        waitVisibilityOf(userSection);
        dropdownUserSettingsButton.click();
    }

    @Step("Step 2, clicking 'Edit profile' button")
    public void clickEditProfileButton(){
        editProfileButton.click();
    }

    @Step("Step 3, filling the 'Position title' field")
    public void fillPositionsTitleField(){
        waitVisibilityOf(profileSettingsText);
        positionTitleField.clear();
        positionTitleField.sendKeys(ROLE_TITLE_OF_NEW_USER);
    }

    @Step("Step 4, clicking the 'Settings' button")
    public void clickUpdateSettingsButton(){
        updateSettingsButton.click();
        waitVisibilityOf(textOfSuccessNotification);
    }

    public String getTextOfSuccessNotification(){
        return textOfSuccessNotification.getText();
    }
    @Step("Step 1, clicking the 'Groups' tab")
    public void clickGroupsTab(){
        groupsTab.click();
    }

    @Step("Step 2, clicking the 'Create new group' button")
    public void clickCreateNewGroupButton(){
        waitVisibilityOf(createNewGroupButton);
        createNewGroupButton.click();
    }

    @Step("Step 3, filling the 'Group title' field")
    public void fillGroupTitleField(){
        waitVisibilityOf(groupTitleField);
        groupTitleField.sendKeys(GROUP_TITLE_NEW_GROUP);
    }

    @Step("Step 4, filling the 'Description' field for creation new group")
    public void fillDescriptionOfNewGroup(){
        descriptionOfNewGroup.sendKeys(GROUP_DESCRIPTION_NEW_GROUP);
    }

    @Step("Step 5, clicking the 'Create' button to create a new group")
    public void clickCreateGroupButton(){
        createGroupButton.click();
        waitVisibilityOf(textOfSuccessGroupCreation);
    }

    public String getTextOfSuccessGroupCreation(){
        return textOfSuccessGroupCreation.getText();
    }

    @Step("Step 2, clicking 'Options' button to see options available for an existing group")
    public void clickOptionsButtonOfGroup(){
        waitVisibilityOf(optionsButtonOfGroup);
        optionsButtonOfGroup.click();
    }

    @Step("Step 3, clicking the 'Delete' button to delete group test")
    public void clickDeleteButton(){
        waitVisibilityOf(deleteButton);
        deleteButton.click();
    }

    @Step("Step 4, clicking 'Delete Group' button")
    public void clickDeleteGroupButton(){
        waitVisibilityOf(deleteGroupButton);
        deleteGroupButton.click();
        waitVisibilityOf(textOfSuccessGroupDeletion);

    }

    public String getTextOfSuccessGroupDeletion(){
        return textOfSuccessGroupDeletion.getText();
    }




}
