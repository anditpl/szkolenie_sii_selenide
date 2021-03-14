package com.slenide.test;

/**
 * Created by Lukasz Krause
 * Date: 13.03.2021
 */
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class FirstTestDRY {

    @Test
    public void dryClickAroundW3School(){
        openW3SchoolPage();
        acceptCookies();
        assertPageHeader("CSS Selectors");
        selectLeftMenuItem("CSS Functions");
        assertPageHeader("CSS Functions");
        selectTopMenuItem("JavaScript");
        assertUrl("https://www.w3schools.com/js/default.asp", WebDriverRunner.url());
    }

    public void assertPageHeader(String headerText){
        $("#main h2").shouldHave(Condition.exactText(headerText));
    }

    public void openW3SchoolPage(){
        open("https://www.w3schools.com/cssref/css_selectors.asp");
    }

    public void acceptCookies(){
        $("#accept-choices").click();
    }

    public void selectLeftMenuItem(String itemText){
        $$("#leftmenuinnerinner>a").find(exactText(itemText)).click();
    }

    public void selectTopMenuItem(String itemText){
        $("[title*='" + itemText + "']").click();
    }

    public void assertUrl(String actualUrl, String expectedUrl){
        assertEquals(expectedUrl, actualUrl);
    }

}