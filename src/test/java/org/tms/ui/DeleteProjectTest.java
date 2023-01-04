package org.tms.ui;


import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.ProjectsPage;
import org.tms.pages.RepositoryPage;
import org.tms.services.LoginPageService;

public class DeleteProjectTest {
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
        projectsPage.clickExistingProject();
    }

    @Test(enabled = true)
    @Description("Removing existing project")
    public void DeleteProjectTest() {
        projectsPage.clickSettingsButton();
        projectsPage.clickDeleteProjectButton();
        projectsPage.clickDeleteProjectButton();
        Assert.assertTrue(projectsPage.isProjectExist());
    }
}
