package com.selenide.pages;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Lukasz Krause
 * Date: 14.03.2021
 */
public class CroppPage {

    public HomePage openSite() {
        open("https://www.cropp.com/pl/pl/");
        return new HomePage();
    }

}
