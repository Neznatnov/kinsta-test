package com.neznatnov.tests;

import com.codeborne.selenide.Selenide;
import com.neznatnov.pages.CiscoMainPage;
import org.junit.jupiter.api.Test;

public class CiscoMainPageTest extends TestBase {
    CiscoMainPage ciscoMainPage = new CiscoMainPage();
    @Test
    void logoExist(){
        ciscoMainPage.openPage().logoExist();
    }

    @Test
    void searchExist(){
        ciscoMainPage.openPage().searchExist();

    }

    @Test
    void videoPlaying(){
        ciscoMainPage.openPage().removeFooter().videoPlaying();
    }
    @Test
    void changeLanguage(){
        ciscoMainPage.openPage().removeFooter();
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight)");
        Selenide.sleep(3000);
        ciscoMainPage.changeLanguage("Deutsch");
    }
@Test
void contactBar(){
        ciscoMainPage.openPage().checkContactBar();
    }

}
