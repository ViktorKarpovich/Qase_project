package org.tms.ui;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.ProjectsPage;
import org.tms.pages.WorkspacePage;
import org.tms.services.LoginPageService;

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
        projectsPage.clickWorkspaceButton();

    }

    @Test(enabled = true)
    @Description("Removing of new group")
    public void deleteNewGroupTest() {
        workspacePage.clickGroupsTab();
        workspacePage.clickOptionsButtonOfGroup();
        workspacePage.clickDeleteButton();
        workspacePage.clickDeleteGroupButton();
        String expectedSuccessMessage = "User group \"Test group title1\" was deleted successfully!";
        Assert.assertEquals(workspacePage.getTextOfSuccessGroupDeletion(), expectedSuccessMessage,
                "User group was deleted");
    }
}
