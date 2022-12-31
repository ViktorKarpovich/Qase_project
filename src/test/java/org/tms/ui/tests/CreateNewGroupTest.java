package org.tms.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.ui.model.User;
import org.tms.ui.pages.ProjectsPage;
import org.tms.ui.pages.WorkspacePage;
import org.tms.ui.services.LoginPageService;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CreateNewGroupTest extends BaseTest{
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
    public void createNewGroupTest() throws InterruptedException {
        workspacePage.clickGroupsTab();
        Thread.sleep(2000);
        workspacePage.clickCreateNewGroupButton();
        workspacePage.waitGroupTitleFieldLoaded();
        workspacePage.fillGroupTitleField();
        workspacePage.fillDescriptionOfNewGroup();
        workspacePage.clickCreateGroupButton();
        workspacePage.waitSuccessNotificationLoaded();
        String expectedTextNotification = "Group was created successfully!";
        Assert.assertEquals(expectedTextNotification, workspacePage.getTextOfSuccessGroupCreation());
    }

}
