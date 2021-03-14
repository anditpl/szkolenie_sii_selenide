package com.selenide.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Lukasz Krause
 * Date: 14.03.2021
 */
public class OrderProductTest {


    public void openSite(){
        open("https://www.cropp.com/pl/pl/");
    }

    @Test
    public void smoke(){

        openSite();
//        open("https://www.cropp.com/pl/pl/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        $$(".menu>li>a").find(Condition.exactText("Kobieta")).hover();
        Selenide.$$(".menu-item.level-2>a").find(Condition.exactText("Swetry")).click();
        $$("#categoryProducts article").first().click();
        $(".size-selected").click();
        $$(".size-name").find(Condition.exactText("XS")).click();
        $(".add-to-cart-button").shouldBe(visible).click();
        $(".add-to-cart-modal .promo-price").shouldHave(Condition.text(convertDoubleToString(39.99)));

        Assert.assertEquals(getPrice(),39.99,0 );

        $(".go-to-cart").click();
        Selenide.title().equals("Mój koszyk");

    }

    @Test
    public void selectMenuSubmenu(){
        open("https://www.cropp.com/pl/pl/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        $$(".menu>li>a").find(Condition.exactText("Kobieta")).hover();
        Selenide.$$(".menu-item.level-2>a").find(Condition.exactText("Swetry")).click();
        Selenide.title().contains("swetry");
    }

    private double getPrice(){
        String rawString = $(".add-to-cart-modal .promo-price").getText();

        return Double.valueOf(rawString.substring(0, rawString.length()-4).replace(",", "."));
    }

    private String convertDoubleToString(double expectedProductPrice){
        return String.valueOf(expectedProductPrice)
                .replace(".", ",");
    }

}
