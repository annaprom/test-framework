package com.uay.jbehave;

import com.uay.steps.ForumPageSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class ForumDefinitionSteps {
    @Steps
    ForumPageSteps forumPageSteps;

    @Given("User opens Login Page")
    public void givenUserOpensLoginPage (){
        forumPageSteps.userOpensLoginPage();
    }

    @When("User signs on with $login as login and $password as password")
    public void whenUserSignsOn (String login, String password){
        forumPageSteps.userLogsIn(login, password);
    }

    @Then("User with $login successfully logged in")
    public void thenUserSuccessfullyLoggedIn (String login){
        forumPageSteps.checkSignIn(login);
    }

    @Given("User successfully logged in with $login as login and $password as password")
    public void givenUserSuccessfullyLoggedIn (String login, String password){
        forumPageSteps.checkSignInBlock(login, password);
    }

    @When("User clicks on exit button")
    public void whenUserClicksOnExitButton () { forumPageSteps.clickSignOutButton();}

    @Then("User on log in page")
    public void thenUserOnLogInPage (){
        forumPageSteps.checkSignOut();
    }
}
