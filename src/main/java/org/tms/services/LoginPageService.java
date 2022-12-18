package org.tms.services;

import org.tms.model.User;
import org.tms.pages.LoginPage;
import org.tms.pages.ProjectsPage;

public class LoginPageService {

    private static final String LOGIN_PAGE_URL = "https://app.qase.io/login";

    protected LoginPage loginPage = new LoginPage();

    public ProjectsPage login(User user){
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInEmailAddress(user.getLogin())
                .fillInPassword(user.getPassword())
                .clickOnLoginButton();
        return new ProjectsPage();
    }
}