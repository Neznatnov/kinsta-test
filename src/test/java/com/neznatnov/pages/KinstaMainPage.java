package com.neznatnov.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KinstaMainPage {
    private final SelenideElement
            acceptCookies = $(".button.button--purple.button--small.button--hoverghost");
    private final SelenideElement logo = $("svg.icon.icon--logo");
    private final SelenideElement searchButton = $(".site-menu__search__form").$("input[name='s']");
    private final SelenideElement languageButton = $(byClassName("language-select"));
    private final SelenideElement contactBar = $("#megamenu-item-7");
    private final SelenideElement createaWordPressSiteButton = $(".wp-block-kinsta-button.is-style-outline.gtm-hero");
    private final SelenideElement mainPageTitle = $("h1.wp-block-kinsta-hero-title__title");
    private final SelenideElement megaMenuContactTitle = $("#megamenu-contact .megamenu__level-2__item__title");
    private final SelenideElement megaMenuContactDescription = $("#megamenu-contact .megamenu__level-2__item__description");
    private final SelenideElement megaMenuBox22Title = $("#megamenu-box-22 .megamenu__level-2__item__title");
    private final SelenideElement megaMenuBox22Description = $("#megamenu-box-22 .megamenu__level-2__item__description");
    private final SelenideElement megaMenuBox23Title = $("#megamenu-box-23 .megamenu__level-2__item__title");
    private final SelenideElement megaMenuBox23Description = $("#megamenu-box-23 .megamenu__level-2__item__description");
    private final SelenideElement megaMenuBox24Title = $("#megamenu-box-24 .megamenu__level-2__item__title");
    private final SelenideElement megaMenuBox24Description = $("#megamenu-box-24 .megamenu__level-2__item__description");


    public KinstaMainPage openPage() {
        open("https://kinsta.com/");
        return this;
    }

    public KinstaMainPage removeFooter() {
        acceptCookies.click();
        return this;

    }

    public KinstaMainPage logoExist() {
        logo.should(exist);
        return this;
    }

    public KinstaMainPage searchPlaceholderText() {
        searchButton.click();
        assertEquals("Search all Kinsta resources", searchButton.getAttribute("placeholder"));
        return this;
    }

    public KinstaMainPage createaWordPressSiteLink() {
        createaWordPressSiteButton.shouldHave(attribute("href", "https://kinsta.com/wordpress-hosting/pricing/"));
        return this;
    }

    public KinstaMainPage changeLanguage(String language) {
        languageButton.click();
        Select select = new Select(languageButton);
        select.selectByVisibleText(language);
        mainPageTitle.shouldHave(text("Ihr neues Zuhause für moderne Webanwendungen und Websites"));

        return this;
    }

    public KinstaMainPage checkContactBar() {
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
