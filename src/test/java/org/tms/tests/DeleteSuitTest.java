package org.tms.tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.ProjectsPage;
import org.tms.pages.RepositoryPage;
import org.tms.services.LoginPageService;

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

    @Test
    public void deleteSuiteTest() {
        repositoryPage.waitTrashButtonLoaded();
        repositoryPage.clickTrashButton();
        repositoryPage.clickDeleteButton();
        repositoryPage.waitTextOfRemovingNotificationLoaded();
        String nameRemovingNotification = "Suite was successfully deleted.";
        Assert.assertEquals(repositoryPage.getNameOfRemovingNotification(), nameRemovingNotification);
    }
}

