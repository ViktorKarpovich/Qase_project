package org.tms.ui.tests;

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

    @Test
    public void loginTest(){
        User user = new User();
        String actualTextOfCreateNewProjectButton = loginPageService.login(user).getNewProjectButtonText();
        String expectedTextOfCreateNewProjectButton = "Create new project";
        Assert.assertEquals(actualTextOfCreateNewProjectButton, expectedTextOfCreateNewProjectButton);
    }
}