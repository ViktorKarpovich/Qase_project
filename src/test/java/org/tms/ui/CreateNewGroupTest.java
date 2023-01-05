package org.tms.ui;

import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.ProjectsPage;
import org.tms.pages.WorkspacePage;
import org.tms.services.LoginPageService;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CreateNewGroupTest extends BaseTest{
    private LoginPageService loginPageService;
    private ProjectsPage projectsPage;
    private WorkspacePage workspacePage;

    @BeforeClass
    public void setUp(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPageService = new LoginPageService();
        projectsPage = new ProjectsPage();
        workspacePage = new WorkspacePage();
        User user = new User();
        loginPageService.login(user);
        projectsPage.clickWorkspaceButton();
    }

    @Test(enabled = true)
    @Description("Creation of new group test")
    public void createNewGroupTest() {
        workspacePage.clickGroupsTab();
        workspacePage.clickCreateNewGroupButton();
        workspacePage.fillGroupTitleField();
        workspacePage.fillDescriptionOfNewGroup();
        workspacePage.clickCreateGroupButton();
        String expectedTextNotification = "Group was created successfully!";
        Assert.assertEquals(workspacePage.getTextOfSuccessGroupCreation(), expectedTextNotification,
                "Group was created successfully");
    }

}
