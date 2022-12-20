package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.ProjectsPage;
import org.tms.services.LoginPageService;

public class SearchingProjectsTest extends BaseTest{

    private LoginPageService loginPageService;
    private ProjectsPage projectsPage;

    @BeforeClass
    public void setup(){
        loginPageService = new LoginPageService();
        projectsPage = new ProjectsPage();
        User user = new User();
        loginPageService.login(user);
    }

    @Test
    public void searchingProjectTest(){
        projectsPage.searchProjects();
        projectsPage.waitNameOfProjectLoaded();
        String expectedProject = "testName1";
        Assert.assertEquals(expectedProject, projectsPage.getName0fExistingProject());
    }

    @Test
    public void filterExistingProjects(){
        projectsPage.clickAddFilterButton();
        projectsPage.clickMilestonesFilterOption();
        projectsPage.clickNoMilestonesOption();
        String expectedNameOfSelectedOption = "Milestones: Without milestones";
        Assert.assertEquals(expectedNameOfSelectedOption, projectsPage.getTextOfselectedMilestonesOption());
    }

}
