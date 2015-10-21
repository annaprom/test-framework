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

    @FindBy(className = "logout")
    private WebElementFacade logoutButton;


    public WebElementFacade getLoginField() {
        return loginField;
    }

    public WebElementFacade getPasswordField() {
        return passwordField;
    }

    public WebElementFacade getSignOnButton() {
        return signOnButton;
    }

    public WebElementFacade getLoginBlock() {
        return loginBlock;
    }

    public WebElementFacade getLogoutButton() {
        return logoutButton;
    }
}
