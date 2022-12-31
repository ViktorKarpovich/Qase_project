package org.tms.ui.services;

import org.tms.ui.model.User;
import org.tms.ui.pages.LoginPage;
import org.tms.ui.pages.ProjectsPage;

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