package org.tms.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.ui.model.User;
import org.tms.ui.pages.ProjectsPage;
import org.tms.ui.pages.WorkspacePage;
import org.tms.ui.services.LoginPageService;

public class EditProfileSettingsTest extends BaseTest{

    private LoginPageService loginPageService;
    private ProjectsPage projectsPage;
    private WorkspacePage workspacePage;

    @BeforeClass
    public void setUp(){
        loginPageService = new LoginPageService();
        projectsPage = new ProjectsPage();
        workspacePage = new WorkspacePage();
        User user = new User();
        loginPageService.login(user);
        projectsPage.waitNameOfProjectLoaded();
        projectsPage.clickWorkspaceButton();
    }

    @Test
    public void editProfileSettingsTest() throws InterruptedException {
        workspacePage.waitUserSectionLoaded();
        workspacePage.clickDropdownUserSettingButton();
        workspacePage.clickEditProfileButton();
        workspacePage.waitSettingsPageLoaded();
        workspacePage.fillPositionsTitleField();
        Thread.sleep(2000);
        workspacePage.clickUpdateSettingsButton();
        workspacePage.waitTextOfSuccessNotificationLoaded();
        String expectedNotification = "Profile data was successfully updated.";
        Assert.assertEquals(expectedNotification, workspacePage.getTextOfSuccessNotification());
    }


}
