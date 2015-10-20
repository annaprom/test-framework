package com.uay.steps;

import com.uay.pages.ForumPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Anastasiia_Udovichen on 10/19/2015.
 */
public class ForumPageSteps extends ScenarioSteps {
    ForumPage forumPage;

    @Step
    public void userOpensLoginPage() {
        getDriver().navigate().refresh();
        forumPage.open();
    }

    @Step
    public void userLogsIn(final String login, final String password) {
        typeLogin(login);
        typePassword(password);
        clickSignOnButton();
    }

    @Step
    public void typeLogin(final String login) {
        forumPage.getLoginField().type(login);
    }

    @Step
    public void typePassword(final String password) {
        forumPage.getPasswordField().type(password);
    }

    @Step
    public void clickSignOnButton() {
        forumPage.getSignOnButton().click();
    }

    @Step
    public void checkSignIn(final String login) {
        assertThat("User has not logged in", forumPage.getLoginBlock().getText().equals(login));
    }

    @Step
    public void checkSignInBlock(final String login, final String password) {
        getDriver().navigate().refresh();
        forumPage.open();
        typeLogin(login);
        typePassword(password);
        clickSignOnButton();
        forumPage.getLoginBlock();
    }

    @Step
    public void clickSignOutButton() {
        forumPage.getLogoutButton().click();
    }

    @Step
    public void checkSignOut() {
        assertThat("User is not on login page ", forumPage.getSignOnButton().isPresent());
    }

}


