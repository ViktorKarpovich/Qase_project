package org.tms.ui.tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.ui.model.User;
import org.tms.ui.services.LoginPageService;

public class LoginPageTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp(){
        loginPageService = new LoginPageService();
    }

    @Test(enabled = true, retryAnalyzer = org.tms.utils.Retry.class)
    @Description("Test #1, Login")
    public void loginTest(){
        User user = new User();
        String actualTextOfCreateNewProjectButton = loginPageService.login(user).getNewProjectButtonText();
        String expectedTextOfCreateNewProjectButton = "Create new project";
        Assert.assertEquals(actualTextOfCreateNewProjectButton, expectedTextOfCreateNewProjectButton);
    }
}
