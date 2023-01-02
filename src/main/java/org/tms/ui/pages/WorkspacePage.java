package org.tms.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkspacePage extends BasePage{
    private static final String EMAIL_OF_NEW_USER = "vkarpovich@yopmail.com";
    private static final String ROLE_TITLE_OF_NEW_USER = "vtest12";
    private static final String GROUP_TITLE_NEW_GROUP = "Test group title1";
    private static final String GROUP_DESCRIPTION_NEW_GROUP = "Test group description";

    @FindBy(xpath = "//div[@class='team-member-name-block']")
    public WebElement userSection;
    @FindBy(xpath = "//a[@class='btn btn-dropdown']")
    public WebElement dropdownUserSettingsButton;
    @FindBy(xpath = "//a[@class='action-settings']")
    public WebElement editProfileButton;
    @FindBy(xpath = "//h2[contains(text(), 'Profile settings')]")
    public WebElement profileSettingsText;
    @FindBy(id = "inputRole")
    public WebElement positionTitleField;
    @FindBy(xpath = "//button[contains(text(), 'Update settings')]")
    public WebElement updateSettingsButton;
    @FindBy(xpath = "//span[contains(.,'Profile data was successfully updated.')]")
    public WebElement textOfSuccessNotification;
    @FindBy(xpath = "//span[contains(.,'Groups')]")
    public WebElement groupsTab;
    @FindBy(xpath = "//a[@data-qase-test='create-new-group-button']")
    public WebElement createNewGroupButton;
    @FindBy(id = "inputTitle")
    public WebElement groupTitleField;
    @FindBy(id = "inputDescription")
    public WebElement descriptionOfNewGroup;
    @FindBy(xpath = "//button[contains(.,'Create')]")
    public WebElement createGroupButton;
    @FindBy(xpath = "//span[contains(.,'Group was created successfully!')]")
    public WebElement textOfSuccessGroupCreation;
    @FindBy(xpath = "//a[@class='btn btn-dropdown']")
    public WebElement optionsButtonOfGroup;
    @FindBy(xpath = "//a[contains(.,'Delete')]")
    public WebElement deleteButton;
    @FindBy(xpath = "//button[@data-qase-test='group-delete-confirm-button']")
    public WebElement deleteGroupButton;
    @FindBy(xpath = "//span[contains(.,'was deleted successfully!')]")
    public WebElement textOfSuccessGroupDeletion;


    public WorkspacePage waitUserSectionLoaded(){
        waitVisibilityOf(userSection);
        return this;
    }

    public void clickDropdownUserSettingButton(){
        dropdownUserSettingsButton.click();
    }

    public void clickEditProfileButton(){
        editProfileButton.click();
    }

    public WorkspacePage waitSettingsPageLoaded(){
        waitVisibilityOf(profileSettingsText);
        return this;
    }

    public void fillPositionsTitleField(){
        positionTitleField.clear();
        positionTitleField.sendKeys(ROLE_TITLE_OF_NEW_USER);
    }

    public void clickUpdateSettingsButton(){
        updateSettingsButton.click();
    }

    public WorkspacePage waitTextOfSuccessNotificationLoaded(){
        waitVisibilityOf(textOfSuccessNotification);
        return this;
    }

    public String getTextOfSuccessNotification(){
        return textOfSuccessNotification.getText();
    }

    public void clickGroupsTab(){
        groupsTab.click();
    }
        public WorkspacePage waitNewGroupButtonLoaded(){
        waitVisibilityOf(createNewGroupButton);
        return this;
    }

    public void clickCreateNewGroupButton(){
        createNewGroupButton.click();
    }

    public WorkspacePage waitGroupTitleFieldLoaded(){
        waitVisibilityOf(groupTitleField);
        return this;
    }

    public void fillGroupTitleField(){
        groupTitleField.sendKeys(GROUP_TITLE_NEW_GROUP);
    }

    public void fillDescriptionOfNewGroup(){
        descriptionOfNewGroup.sendKeys(GROUP_DESCRIPTION_NEW_GROUP);
    }

    public void clickCreateGroupButton(){
        createGroupButton.click();
    }

    public WorkspacePage waitSuccessNotificationLoaded(){
        waitVisibilityOf(textOfSuccessGroupCreation);
        return this;
    }

    public String getTextOfSuccessGroupCreation(){
        return textOfSuccessGroupCreation.getText();
    }

    public void clickOptionsButtonOfGroup(){
        optionsButtonOfGroup.click();
    }
    public WorkspacePage waitOptionsButtonOfGroupLoaded(){
        waitVisibilityOf(optionsButtonOfGroup);
        return this;
    }

    public void clickDeleteButton(){
        deleteButton.click();
    }

    public WorkspacePage waitDeleteButtonLoaded(){
        waitVisibilityOf(deleteButton);
        return this;
    }

    public void clickDeleteGroupButton(){
        deleteGroupButton.click();
    }

    public WorkspacePage waitDeleteGroupButtonLoaded(){
        waitVisibilityOf(deleteGroupButton);
        return this;
    }

    public WorkspacePage waitSuccessGroupDeletionLoaded(){
        waitVisibilityOf(textOfSuccessGroupDeletion);
        return this;
    }
    public String getTextOfSuccessGroupDeletion(){
        return textOfSuccessGroupDeletion.getText();
    }




}
