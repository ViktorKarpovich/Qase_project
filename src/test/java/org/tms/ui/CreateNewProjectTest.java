package org.tms.ui;

import io.qameta.allure.Description;
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

    @Test(enabled = true)
    @Description ("Creation of new project with private access")
    public void creationNewPrivateProjectTest(){
        projectsPage.clickNewProjectButton();
        projectsPage.fillingProjectNameField();
        projectsPage.fillingProjectCodeField();
        projectsPage.clickCreateProjectButton();
        String expectedTextOfNewEmptyProject = "Looks like you don’t have any suites and cases yet.";
        Assert.assertEquals(projectsPage.getTextOfEmptyProject(), expectedTextOfNewEmptyProject,
                "New project was created");
    }

}

