package org.tms.ui;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.ProjectsPage;
import org.tms.services.LoginPageService;

public class FilteringProjectsTest extends BaseTest{
    private LoginPageService loginPageService;
    private ProjectsPage projectsPage;

    @BeforeClass
    public void setup(){
        loginPageService = new LoginPageService();
        projectsPage = new ProjectsPage();
        User user = new User();
        loginPageService.login(user);
    }

    @Test(enabled = true)
    @Description("Filtering existing projects using filters section")
    public void filterExistingProjectsTest(){
        projectsPage.clickAddFilterButton();
        projectsPage.clickMilestonesFilterOption();
        projectsPage.clickNoMilestonesOption();
        String expectedNameOfSelectedOption = "Milestones: Without milestones";
        Assert.assertEquals(projectsPage.getTextOfselectedMilestonesOption(),expectedNameOfSelectedOption,
                "The projects have been successfully filtered");
    }

}
