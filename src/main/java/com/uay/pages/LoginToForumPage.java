package com.uay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


@DefaultUrl("http://forum.finance.ua/")
public class LoginToForumPage extends PageObject {

    private static final Logger logger = LogManager.getLogger(LoginToForumPage.class.getName());

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

    @FindBy(xpath = ".//*[@id='wrap']/div[3]/span[1]/a[3]", timeoutInSeconds = "10")
    private WebElementFacade searchButton;

    @FindBy(id = "page-body")
    private WebElementFacade pageBody;

    public void enterLogin(String login) {
        logger.info("Entered login " + login);
        loginField.type(login);
    }

    public void enterPassword(String password) {
        logger.info("Entered password " + password);
        passwordField.type(password);
    }

    public void clickSignInButton() {
        logger.debug("Clicked on sign in");
        signOnButton.waitUntilClickable().click();
    }

    public void clickSignOutButton() {
        logger.debug("Clicked on sign out");
        logoutButton.click();
    }

    public boolean hasUserLoggedIn(String login) {
        boolean loggedIn = loginBlock.getText().equals(login);
//        waitForCondition().until(ExpectedConditions.visibilityOf(pageBody) );
        waitForCondition().until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver webDriver) {
                return pageBody.isVisible();
            }
        });
        logger.debug("User " + login + " loggedIn: " + loggedIn);
        return loggedIn;
    }

    public void clickSearchButton() {
        logger.debug("Clicked on search");
        searchButton.click();
    }

    public boolean hasUserLoggedOut() {
        return signOnButton.isVisible();
           }

    public boolean isPageBodyVisible() {return pageBody.isVisible(); }

    public boolean checkSearchPage(){
        return getTitle().equals("Пошук - Форумы на FINANCE.UA");
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