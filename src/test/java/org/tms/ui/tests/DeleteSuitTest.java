package org.tms.ui.tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.ui.model.User;
import org.tms.ui.pages.ProjectsPage;
import org.tms.ui.pages.RepositoryPage;
import org.tms.ui.services.LoginPageService;

public class DeleteSuitTest extends BaseTest{
    private LoginPageService loginPageService;
    private ProjectsPage projectsPage;

    private RepositoryPage repositoryPage;

    @BeforeClass
    public void setUp(){
        loginPageService = new LoginPageService();
        projectsPage = new ProjectsPage();
        repositoryPage = new RepositoryPage();
        User user = new User();
        loginPageService.login(user);
        projectsPage.waitNameOfProjectLoaded();
        projectsPage.clickExistingProject();
    }

    @Test(enabled = true)
    @Description("Removing suite")
    public void deleteSuiteTest() {
        repositoryPage.waitTrashButtonLoaded();
        repositoryPage.clickTrashButton();
        repositoryPage.clickDeleteButton();
        repositoryPage.waitTextOfRemovingNotificationLoaded();
        String nameRemovingNotification = "Suite was successfully deleted.";
        Assert.assertEquals(repositoryPage.getNameOfRemovingNotification(), nameRemovingNotification);
    }
}

