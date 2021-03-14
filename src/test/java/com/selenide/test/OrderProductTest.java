package com.selenide.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Lukasz Krause
 * Date: 14.03.2021
 */
public class OrderProductTest {

    @Test
    public void smoke(){

        open("https://www.cropp.com/pl/pl/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        $$(".menu>li>a").find(Condition.exactText("Kobieta")).click();
    }
}
