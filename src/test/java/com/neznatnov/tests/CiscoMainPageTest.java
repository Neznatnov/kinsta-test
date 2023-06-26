package com.neznatnov.tests;

import com.codeborne.selenide.Selenide;
import com.neznatnov.pages.CiscoMainPage;
import org.junit.jupiter.api.DisplayName;
import static io.qameta.allure.Allure.step;
import org.junit.jupiter.api.Test;

public class CiscoMainPageTest extends TestBase {
    CiscoMainPage ciscoMainPage = new CiscoMainPage();
    @Test
    @DisplayName("Check logo exists on the main page")
    void logoExist(){
        step("Open website kinsta", () -> {
            ciscoMainPage.openPage();
        });
        step("Verify result img", () -> {
        ciscoMainPage.logoExist();
        });
    }

    @Test
    @DisplayName("Check search text placeholder on the main page")
    void searchExist(){
        step("Open website kinsta", () -> {
        ciscoMainPage.openPage();
        });
        step("Verify result text", () -> {
        ciscoMainPage.searchPlaceholderText();
        });
    }

    @Test
    @DisplayName("Check video, UNDONE")
    void videoPlaying(){
        ciscoMainPage.openPage().removeFooter().videoPlaying();
    }

    @Test
    @DisplayName("Check language change on main page, german")
    void changeLanguage(){
        step("Open website kinsta", () -> {
            ciscoMainPage.openPage();
        });
        step("Remove footer", () -> {
            ciscoMainPage.removeFooter();
        });
        step("Scroll to bottom of page", () -> {
            Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
        });
        step("Wait 3 sec", () -> {
            Selenide.sleep(3000);
        });
        step("Change language", () -> {
            ciscoMainPage.changeLanguage("Deutsch");
        });
    }

@Test
@DisplayName("Check the correct text in Contact bar on main page")
void contactBar(){
    step("Open website kinsta", () -> {
        ciscoMainPage.openPage();
    });
    step("Verify result text", () -> {
        ciscoMainPage.checkContactBar();
    });
    }

}
