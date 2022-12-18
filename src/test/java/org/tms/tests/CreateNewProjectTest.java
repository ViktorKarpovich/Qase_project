package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.ProjectsPage;
import org.tms.services.LoginPageService;

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

    @Test
    public void creationNewPrivateProject(){
        projectsPage.clickNewProjectButton();
        projectsPage.fillingProjectNameField();
        projectsPage.fillingProjectCodeField();
        projectsPage.clickCreateProjectButton();
        String expectedTextOfNewEmptyProject = "Looks like you don’t have any suites and cases yet.";
        Assert.assertEquals(projectsPage.getTextOfEmptyProject(), expectedTextOfNewEmptyProject);
    }

    @Test
    public void creationNewPublicProjectWithDescription(){
        projectsPage.clickNewProjectButton();
        projectsPage.fillingProjectNameField();
        projectsPage.fillingProjectCodeField();
        projectsPage.fillingProjectDescriptionField();
        projectsPage.clickCreateProjectButton();
        String expectedTextOfNewEmptyProject = "Looks like you don’t have any suites and cases yet.";
        Assert.assertEquals(projectsPage.getTextOfEmptyProject(), expectedTextOfNewEmptyProject);
    }
}

