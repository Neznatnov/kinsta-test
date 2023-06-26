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
            acceptCookies = $(byText("Accept All Cookies")),
            logo = $("svg.icon.icon--logo"),
            searchButton = $(".site-menu__search__form").$("input[name='s']"),
            languageButton = $(byClassName("language-select")),
            contactBar = $("#megamenu-item-7");


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
            $("kinsta-demo-video-modal").shouldHave(attribute("video", "https://kinsta.wistia.com/medias/f57n9mlqfa"));
        return this;
    }

    public CiscoMainPage changeLanguage(String language){
        languageButton.click();
        Select select = new Select(languageButton);
        select.selectByVisibleText(language);
        return this;
    }

    public CiscoMainPage checkContactBar(){
        contactBar.hover();
        $("#megamenu-contact .megamenu__level-2__item__title").shouldHave(text("Talk to sales"));
        $("#megamenu-contact .megamenu__level-2__item__description").shouldHave(text("Call +44 808 2583 915 to find the best hosting for you."));

        $("#megamenu-box-22 .megamenu__level-2__item__title").shouldHave(text("Request a live demo"));
        $("#megamenu-box-22 .megamenu__level-2__item__description").shouldHave(text("Get a personalized demo of our powerful dashboard and hosting features."));

        $("#megamenu-box-23 .megamenu__level-2__item__title").shouldHave(text("Ask questions"));
        $("#megamenu-box-23 .megamenu__level-2__item__description").shouldHave(text("Tell us about your website or project. We'll get back to you in one business day."));

        $("#megamenu-box-24 .megamenu__level-2__item__title").shouldHave(text("Get help from our support team"));
        $("#megamenu-box-24 .megamenu__level-2__item__description").shouldHave(text("Talk with our experts by launching a chat in the MyKinsta dashboard."));
    return this;
    }
}
