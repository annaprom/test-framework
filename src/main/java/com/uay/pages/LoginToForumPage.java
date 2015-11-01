package com.uay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

@DefaultUrl("http://forum.finance.ua/")
public class LoginToForumPage extends PageObject {

    @FindBy(name="username")
    private WebElementFacade loginField;

    @FindBy(name="password")
    private WebElementFacade passwordField;

    @FindBy(name="login")
    private WebElementFacade signOnButton;

    @FindBy(xpath = "//*[@class='login']/b")
    private WebElementFacade loginBlock;

    @FindBy(className = "logout", timeoutInSeconds = "10")
    private WebElementFacade logoutButton;


    public void enterLogin(String login) {
        loginField.type(login);
    }

    public void enterPassword(String password) {
        passwordField.type(password);
    }

    public void clickSignInButton() {
        signOnButton.waitUntilClickable().click();
    }

    public void clickSignOutButton() {
        logoutButton.click();
    }

    public boolean hasUserLoggedIn(String login) {
        return loginBlock.getText().equals(login);
    }

    public boolean hasUserLoggedOut() {
        return signOnButton.isVisible();
    }
}

/**
    waitUntilVisible();
    waitUntilPresent();
    waitForCondition();
    waitUntilNotVisible();
    waitUntilEnabled();
    waitUntilClickable();
    waitUntilDisabled();

    getImplicitTimeoutInMilliseconds();
    withTimeoutOf(int timeout, TimeUnit unit);

Wait for an element to be visible and enabled, and then click on it.
    public void click();
    public void clear();
} */