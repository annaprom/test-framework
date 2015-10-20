package com.uay.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

/**
 * Created by Anastasiia_Udovichen on 10/19/2015.
 */

@DefaultUrl("http://forum.finance.ua/")
public class ForumPage extends PageObject {

    @FindBy(xpath = "//*[@name='username']")
    private WebElementFacade loginField;

    @FindBy(xpath = "//*[@name='password']")
    private WebElementFacade passwordField;

    @FindBy(xpath = "//*[@name='login']")
    private WebElementFacade signOnButton;

    @FindBy(xpath = "//*[@class='login']/b")
    private WebElementFacade loginBlock;

    @FindBy(xpath = "//*[@class='logout']")
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
