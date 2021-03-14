package com.selenide.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.title;


/**
 * Created by Lukasz Krause
 * Date: 14.03.2021
 */
public class SubMenuPage {
    public ProductPage selectFirstProduct() {
        $$("#categoryProducts article").first().click();
        return new ProductPage();
    }

    public SubMenuPage assertTitleIs(String titleText) {
        title().equals(titleText);
        return this;
    }
}