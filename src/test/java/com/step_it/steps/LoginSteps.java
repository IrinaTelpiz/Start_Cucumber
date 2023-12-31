package com.step_it.steps;

import com.step_it.pages.LoginPage;
import com.step_it.pages.MainPage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class LoginSteps {

    private LoginPage loginPage;
    private MainPage mainPage;

    public void login(String username, String password) {
        log.info("user logs in to app with username & password");
        loginPage.login(username, password);
    }

    public void logout() {
        log.info("user logs out from the app");
        mainPage.logout();
    }

}
