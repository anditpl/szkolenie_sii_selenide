package com.selenide.pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;


/**
 * Created by Lukasz Krause
 * Date: 14.03.2021
 */
public class HomePage {


    public SubMenuPage selectMenuSubmenu(String menuName, String submenuName) {
        $$(".menu>li>a").find(Condition.exactText(menuName)).should(Condition.appear).click();
        $$(".menu-item.level-2>a").find(Condition.exactText(submenuName)).click();
        return new SubMenuPage();
    }

    public HomePage assertTitleIs(String titleText) {
        title().equals(titleText);
        return this;
    }
}