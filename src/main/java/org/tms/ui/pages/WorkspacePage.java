package org.tms.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkspacePage extends BasePage{
    private static final String emailOfNewUser = "vkarpovich@yopmail.com";
    private static final String roleTitleOfNewUser = "QA";
    private static final String GROUP_TITLE_NEW_GROUP = "Test group title1";
    private static final String GROUP_DESCRIPTION_NEW_GROUP = "Test group description";

    @FindBy(xpath = "//div[@class='team-member-name-block']")
    public WebElement userSection;

    public WorkspacePage waitUserSectionLoaded(){
        waitVisibilityOf(userSection);
        return this;
    }

    @FindBy(xpath = "//a[@class='btn btn-dropdown']")
    public WebElement dropdownUserSettingsButton;

    public void clickDropdownUserSettingButton(){
        dropdownUserSettingsButton.click();
    }

    @FindBy(xpath = "//a[@class='action-settings']")
    public WebElement editProfileButton;

    public void clickEditProfileButton(){
        editProfileButton.click();
    }

    @FindBy(xpath = "//h2[contains(text(), 'Profile settings')]")
    public WebElement profileSettingsText;

    public WorkspacePage waitSettingsPageLoaded(){
        waitVisibilityOf(profileSettingsText);
        return this;
    }

    @FindBy(id = "inputRole")
    public WebElement positionTitleField;

    public void fillPositionsTitleField(){
        positionTitleField.clear();
        positionTitleField.sendKeys("vtest");
    }

    @FindBy(xpath = "//button[contains(text(), 'Update settings')]")
    public WebElement updateSettingsButton;

    public void clickUpdateSettingsButton(){
        updateSettingsButton.click();
    }

    @FindBy(xpath = "//span[contains(.,'Profile data was successfully updated.')]")
    public WebElement textOfSuccessNotification;

    public WorkspacePage waitTextOfSuccessNotificationLoaded(){
        waitVisibilityOf(textOfSuccessNotification);
        return this;
    }
    public String getTextOfSuccessNotification(){
        return textOfSuccessNotification.getText();
    }

    @FindBy(xpath = "//span[contains(.,'Groups')]")
    public WebElement groupsTab;

    public void clickGroupsTab(){
        groupsTab.click();
    }

    @FindBy(xpath = "//a[@data-qase-test='create-new-group-button']")
    public WebElement createNewGroupButton;

    public WorkspacePage waitNewGroupButtonLoaded(){
        waitVisibilityOf(createNewGroupButton);
        return this;
    }

    public void clickCreateNewGroupButton(){
        createNewGroupButton.click();
    }

    @FindBy(id = "inputTitle")
    public WebElement groupTitleField;

    public WorkspacePage waitGroupTitleFieldLoaded(){
        waitVisibilityOf(groupTitleField);
        return this;
    }

    public void fillGroupTitleField(){
        groupTitleField.sendKeys(GROUP_TITLE_NEW_GROUP);
    }

    @FindBy(id = "inputDescription")
    public WebElement descriptionOfNewGroup;

    public void fillDescriptionOfNewGroup(){
        descriptionOfNewGroup.sendKeys(GROUP_DESCRIPTION_NEW_GROUP);
    }

    @FindBy(xpath = "//button[contains(.,'Create')]")
    public WebElement createGroupButton;

    public void clickCreateGroupButton(){
        createGroupButton.click();
    }


    @FindBy(xpath = "//span[contains(.,'Group was created successfully!')]")
    public WebElement textOfSuccessGroupCreation;

    public WorkspacePage waitSuccessNotificationLoaded(){
        waitVisibilityOf(textOfSuccessGroupCreation);
        return this;
    }

    public String getTextOfSuccessGroupCreation(){
        return textOfSuccessGroupCreation.getText();
    }

    @FindBy(xpath = "//a[@class='btn btn-dropdown']")
    public WebElement optionsButtonOfGroup;

    public void clickOptionsButtonOfGroup(){
        optionsButtonOfGroup.click();
    }
    public WorkspacePage waitOptionsButtonOfGroupLoaded(){
        waitVisibilityOf(optionsButtonOfGroup);
        return this;
    }


    @FindBy(xpath = "//a[contains(.,'Delete')]")
    public WebElement deleteButton;

    public void clickDeleteButton(){
        deleteButton.click();
    }

    public WorkspacePage waitDeleteButtonLoaded(){
        waitVisibilityOf(deleteButton);
        return this;
    }

    @FindBy(xpath = "//button[@data-qase-test='group-delete-confirm-button']")

    public WebElement deleteGroupButton;

    public void clickDeleteGroupButton(){
        deleteGroupButton.click();
    }

    public WorkspacePage waitDeleteGroupButtonLoaded(){
        waitVisibilityOf(deleteGroupButton);
        return this;
    }

    @FindBy(xpath = "//span[contains(.,'was deleted successfully!')]")
    public WebElement textOfSuccessGroupDeletion;


    public WorkspacePage waitSuccessGroupDeletionLoaded(){
        waitVisibilityOf(textOfSuccessGroupDeletion);
        return this;
    }
    public String getTextOfSuccessGroupDeletion(){
        return textOfSuccessGroupDeletion.getText();
    }




}
