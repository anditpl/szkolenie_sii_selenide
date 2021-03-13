package com.w3school;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class FirstTest {

    @Test
    public void clickAroundW3School(){

        open("https://www.w3schools.com/cssref/css_selectors.asp");

        $("#accept-choices").click();
//        $(screenshot("test"));


        $("#main h2").shouldHave(Condition.exactText("CSS Selectors"));
        $("title").shouldHave(attribute("text", "CSS Selectors Reference"));

        $$("#leftmenuinnerinner>a").find(exactText("CSS Functions")).click();

        $("#main h2").shouldHave(Condition.exactText("CSS Functions"));
        $("[title*='JavaScript']").click();
        $("#main>h1").shouldHave(Condition.text("JavaScript"));
        assertEquals("https://www.w3schools.com/js/default.asp", WebDriverRunner.url());
    }
}