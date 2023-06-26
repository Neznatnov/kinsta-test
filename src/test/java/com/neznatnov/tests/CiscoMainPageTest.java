package com.neznatnov.tests;

import com.codeborne.selenide.Selenide;
import com.neznatnov.pages.CiscoMainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CiscoMainPageTest extends TestBase {
    CiscoMainPage ciscoMainPage = new CiscoMainPage();
    @Test
    @DisplayName("Check logo exists on the main page")
    void logoExist(){
        ciscoMainPage.openPage().logoExist();
    }

    @Test
    @DisplayName("Check search exists on the main page")
    void searchExist(){
        ciscoMainPage.openPage().searchExist();

    }

    @Test
    @DisplayName("Check video, UNDONE")
    void videoPlaying(){
        ciscoMainPage.openPage().removeFooter().videoPlaying();
    }
    @Test
    @DisplayName("Check language change on main page, german")
    void changeLanguage(){
        ciscoMainPage.openPage().removeFooter();
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
        Selenide.sleep(3000);
        ciscoMainPage.changeLanguage("Deutsch");
    }
@Test
@DisplayName("Check the correct text in Contact bar on main page")
void contactBar(){
        ciscoMainPage.openPage().checkContactBar();
    }

}
