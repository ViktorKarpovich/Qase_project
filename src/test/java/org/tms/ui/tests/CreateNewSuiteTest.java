package org.tms.ui.tests;

import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.ui.model.User;
import org.tms.ui.pages.ProjectsPage;
import org.tms.ui.pages.RepositoryPage;
import org.tms.ui.services.LoginPageService;

public class CreateNewSuiteTest extends BaseTest {
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
    @Description("Creation of new project with private access")
    public void createSuiteTest() {
        repositoryPage.waitRepositoryLoaded();
        repositoryPage.clickCreateNewSuiteButton();
        repositoryPage.fillDescriptionField();
        repositoryPage.fillPreconditionsField();
        repositoryPage.fillSuiteNameField();
        repositoryPage.suiteNameField.sendKeys(Keys.ENTER);
        repositoryPage.waitTextOfSuccessNotificationLoaded();
        String textSuccessNotification = "Suite was successfully created.";
        Assert.assertEquals(repositoryPage.getNameOfSuccessNotification(), textSuccessNotification);
    }
}
