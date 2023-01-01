package org.tms.ui.tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.ui.model.User;
import org.tms.ui.pages.ProjectsPage;
import org.tms.ui.pages.WorkspacePage;
import org.tms.ui.services.LoginPageService;

public class DeleteGroupTest extends BaseTest{

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

    @Test(enabled = true)
    @Description("Removing of new group")
    public void deleteNewGroupTest() throws InterruptedException {
        workspacePage.clickGroupsTab();
        workspacePage.waitOptionsButtonOfGroupLoaded();
        workspacePage.clickOptionsButtonOfGroup();
        Thread.sleep(1500);
        workspacePage.waitDeleteButtonLoaded();
        workspacePage.clickDeleteButton();
        workspacePage.waitDeleteGroupButtonLoaded();
        workspacePage.clickDeleteGroupButton();
        workspacePage.waitSuccessGroupDeletionLoaded();
        String expectedSuccessMessage = "User group \"Test group title1\" was deleted successfully!";
        Assert.assertEquals(expectedSuccessMessage, workspacePage.getTextOfSuccessGroupDeletion());
    }
}
