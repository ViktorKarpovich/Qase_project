package org.tms.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.tms.model.User;
import org.tms.pages.BasePage;
import org.tms.services.LoginPageService;

public class LoginPageTest extends BaseTest {

    private LoginPageService loginPageService;

    @BeforeClass
    public void setUp(){
        loginPageService = new LoginPageService();
    }

    @Test
    public void loginTest(){
        User user = new User();
        String actualTextOfCreateNewProjectButton = loginPageService.login(user).getNewProjectButtonText();
        String expectedTextOfCreateNewProjectButton = "Create new project";
        Assert.assertEquals(actualTextOfCreateNewProjectButton, expectedTextOfCreateNewProjectButton);
    }
}
