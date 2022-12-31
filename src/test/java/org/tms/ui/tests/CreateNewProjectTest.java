package org.tms.ui.tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.ui.model.User;
import org.tms.ui.pages.ProjectsPage;
import org.tms.ui.services.LoginPageService;

public class CreateNewProjectTest extends BaseTest {

    private LoginPageService loginPageService;
    private ProjectsPage projectsPage;

    @BeforeClass
    public void setUp(){
        loginPageService = new LoginPageService();
        projectsPage = new ProjectsPage();
        User user = new User();
        loginPageService.login(user);
    }

    @Test(enabled = true)
    @Description ("test")
    public void creationNewPrivateProjectTest(){
        projectsPage.clickNewProjectButton();
        projectsPage.fillingProjectNameField();
        projectsPage.fillingProjectCodeField();
        projectsPage.clickCreateProjectButton();
        String expectedTextOfNewEmptyProject = "Looks like you don’t have any suites and cases yet.";
        projectsPage.waitTextIsLoaded();
        Assert.assertEquals(projectsPage.getTextOfEmptyProject(), expectedTextOfNewEmptyProject);
    }

    @Test(enabled = false)
    public void creationNewPublicProjectWithDescriptionTest(){
        projectsPage.clickNewProjectButton();
        projectsPage.fillingProjectNameField();
        projectsPage.fillingProjectCodeField();
        projectsPage.fillingProjectDescriptionField();
        projectsPage.clickCreateProjectButton();
        String expectedTextOfNewEmptyProject = "Looks like you don’t have any suites and cases yet.";
        projectsPage.waitTextIsLoaded();
        Assert.assertEquals(projectsPage.getTextOfEmptyProject(), expectedTextOfNewEmptyProject);
    }
}

