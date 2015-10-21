package com.uay.steps;

import com.uay.pages.LoginToForumPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;

public class ForumPageSteps extends ScenarioSteps {
    LoginToForumPage loginToForumPage;

    @Step
    public void userOpensLoginPage() {
        loginToForumPage.open();
    }

    @Step
    public void userLogsIn(final String login, final String password) {
        typeLogin(login);
        typePassword(password);
        clickSignOnButton();
    }

    @Step
    public void typeLogin(final String login) {
        loginToForumPage.enterLogin(login);
    }

    @Step
    public void typePassword(final String password) {
        loginToForumPage.enterPassword(password);
    }

    @Step
    public void clickSignOnButton() {
        loginToForumPage.clickSignInButton();
    }

    @Step
    public void checkSignIn(final String login) {
        assertThat("User has not logged in", loginToForumPage.hasUserLoggedIn(login));
    }

    @Step
    public void checkSignInBlock(final String login, final String password) {
        userOpensLoginPage();
        userLogsIn(login, password);
    }

    @Step
    public void clickSignOutButton() {
        loginToForumPage.clickSignOutButton();
    }

    @Step
    public void checkSignOut() {
        assertThat("User is not on login page ", loginToForumPage.hasUserLoggedOut());
    }

}


