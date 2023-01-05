package org.tms.ui;

import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.ProjectsPage;
import org.tms.pages.RepositoryPage;
import org.tms.services.LoginPageService;

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
        projectsPage.clickExistingProjectDemo();
    }

    @Test(enabled = true)
    @Description("Creation of new project with private access")
    public void createSuiteTest() {
        repositoryPage.clickCreateNewSuiteButton();
        repositoryPage.fillSuiteNameField();
        repositoryPage.suiteNameField.sendKeys(Keys.ENTER);
        repositoryPage.waitMessageLoaded();
        String textSuccessNotification = "Suite was successfully created.";
        Assert.assertEquals(repositoryPage.getNameOfSuccessNotification(), textSuccessNotification);
    }
}
