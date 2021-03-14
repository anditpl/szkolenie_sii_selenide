package com.selenide.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.title;

/**
 * Created by Lukasz Krause
 * Date: 14.03.2021
 */
public class ProductPage {

    public ProductPage selectSize(String sizeName) {
        $(".size-selected").click();
        $$(".size-name").find(Condition.exactText(sizeName)).click();
        return this;
    }

    public ProductPage assertSizeIsSelected(String sizeName) {
        $(".size-selected span").shouldHave(Condition.exactText(sizeName));
        return this;
    }

    public ProductPage assertPrice(String expectedPrice) {
        $(".add-to-cart-modal .promo-price").shouldHave(Condition.text(expectedPrice));
        return this;
    }

    public ProductPage addProductToCard() {
        $(".add-to-cart-button").click();
        return this;
    }

    public ProductPage goToBasket() {
        $(".go-to-cart").click();
        title().equals("Mój Koszyk");
        return this;
    }


}
