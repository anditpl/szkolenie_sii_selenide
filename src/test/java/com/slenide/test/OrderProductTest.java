package com.slenide.test;

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
    public void openWomanSite(){

        open("https://www.cropp.com/pl/pl/");
        $("body.cms-home.has-cookies-bar.has-promo-bar.lang-pl:nth-child(2) div.sc-hORach.dtwgvi:nth-child(3) div.sc-bMVAic.dFhdEi header.sc-epnACN.eKxAZT div.sc-bsbRJL.fOVRUC div.sc-hZSUBg.loAibC ul.sc-fHxwqH.ivihn.menu li.sc-dxZgTM.foIWYn.menu-submenu.type-default.level-0:nth-child(3) > a.sc-iFMziU.jMMlzb").hover();
    }
}
