package org.tms.ui;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.ProjectsPage;
import org.tms.pages.WorkspacePage;
import org.tms.services.LoginPageService;

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
        projectsPage.clickWorkspaceButton();
    }

    @Test(enabled = true)
    @Description("Editing role of the user in profile settings")
    public void editProfileSettingsTest() throws InterruptedException {
        workspacePage.clickDropdownUserSettingButton();
        workspacePage.clickEditProfileButton();
        workspacePage.fillPositionsTitleField();
        workspacePage.clickUpdateSettingsButton();
        String expectedNotification = "Profile data was successfully updated.";
        Assert.assertEquals(workspacePage.getTextOfSuccessNotification(), expectedNotification,
                "Profile data was successfully updated");
    }


}
