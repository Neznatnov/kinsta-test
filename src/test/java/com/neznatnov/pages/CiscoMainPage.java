package com.neznatnov.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CiscoMainPage {
    private SelenideElement
            acceptCookies = $(".button.button--purple.button--small.button--hoverghost"),
            logo = $("svg.icon.icon--logo"),
            searchButton = $(".site-menu__search__form").$("input[name='s']"),
            languageButton = $(byClassName("language-select")),
            contactBar = $("#megamenu-item-7"),
            videoButton = $("kinsta-demo-video-modal"),
            mainPageTitle = $("h1.wp-block-kinsta-hero-title__title"),
            megaMenuContactTitle = $("#megamenu-contact .megamenu__level-2__item__title"),
            megaMenuContactDescription = $("#megamenu-contact .megamenu__level-2__item__description"),
            megaMenuBox22Title = $("#megamenu-box-22 .megamenu__level-2__item__title"),
            megaMenuBox22Description =  $("#megamenu-box-22 .megamenu__level-2__item__description"),
            megaMenuBox23Title = $("#megamenu-box-23 .megamenu__level-2__item__title"),
            megaMenuBox23Description =  $("#megamenu-box-23 .megamenu__level-2__item__description"),
            megaMenuBox24Title = $("#megamenu-box-24 .megamenu__level-2__item__title"),
            megaMenuBox24Description  =  $("#megamenu-box-24 .megamenu__level-2__item__description");


    public CiscoMainPage openPage() {
        open("https://kinsta.com/");
        return this;
    }

    public CiscoMainPage removeFooter() {
        acceptCookies.click();
        return this;

    }
    public CiscoMainPage logoExist(){
        logo.should(exist);
        return this;
    }
    public CiscoMainPage searchPlaceholderText(){
        searchButton.click();
        assertEquals("Search all Kinsta resources", searchButton.getAttribute("placeholder"));
        return this;
    }

    public CiscoMainPage videoPlaying(){
            videoButton.click();
        return this;
    }

    public CiscoMainPage changeLanguage(String language){
        languageButton.click();
        Select select = new Select(languageButton);
        select.selectByVisibleText(language);
        mainPageTitle.shouldHave(text("Ihr neues Zuhause für moderne Webanwendungen und Websites"));

        return this;
    }

    public CiscoMainPage checkContactBar(){
        contactBar.hover();
        megaMenuContactTitle.shouldHave(text("Talk to sales"));
        megaMenuContactDescription.shouldHave(text("Call +44 808 2583 915 to find the best hosting for you."));

        megaMenuBox22Title.shouldHave(text("Request a live demo"));
        megaMenuBox22Description.shouldHave(text("Get a personalized demo of our powerful dashboard and hosting features."));

        megaMenuBox23Title.shouldHave(text("Ask questions"));
        megaMenuBox23Description.shouldHave(text("Tell us about your website or project. We'll get back to you in one business day."));

        megaMenuBox24Title.shouldHave(text("Get help from our support team"));
        megaMenuBox24Description.shouldHave(text("Talk with our experts by launching a chat in the MyKinsta dashboard."));
    return this;
    }
}
