package com.neznatnov.tests;

import com.codeborne.selenide.Selenide;
import com.neznatnov.pages.KinstaMainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class KinstaMainPageTest extends TestBase {
    KinstaMainPage kinstaMainPage = new KinstaMainPage();

    @Tag("simple")
    @Test
    @DisplayName("Check logo exists on the main page")
    void logoExist() {
        step("Open website kinsta", () -> {
            kinstaMainPage.openPage();
        });
        step("Verify result img", () -> {
            kinstaMainPage.logoExist();
        });
    }

    @Tag("simple")
    @Test
    @DisplayName("Check search text placeholder on the main page")
    void searchExist() {
        step("Open website kinsta", () -> {
            kinstaMainPage.openPage();
        });
        step("Verify result text", () -> {
            kinstaMainPage.searchPlaceholderText();
        });
    }

    @Tag("simple")
    @Test
    @DisplayName("Check create a WordPress Site button link")
    void createaWordPressSiteLink() {
        step("Open website kinsta", () -> {
            kinstaMainPage.openPage();
        });
        step("Verify result link", () -> {
            kinstaMainPage.createaWordPressSiteLink();
        });
    }

    @Tag("simple")
    @Test
    @DisplayName("Check language change on main page, german")
    void changeLanguage() {
        step("Open website kinsta", () -> {
            kinstaMainPage.openPage();
        });
        step("Remove footer", () -> {
            kinstaMainPage.removeFooter();
        });
        step("Scroll to bottom of page", () -> {
            Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
        });
        step("Wait 3 sec", () -> {
            Selenide.sleep(3000);
        });
        step("Change language", () -> {
            kinstaMainPage.changeLanguage("Deutsch");
        });
    }

    @Tag("simple")
    @Test
    @DisplayName("Check the correct text in Contact bar on main page")
    void contactBar() {
        step("Open website kinsta", () -> {
            kinstaMainPage.openPage();
        });
        step("Verify result text", () -> {
            kinstaMainPage.checkContactBar();
        });
    }

}
