package com.selenide.tests;

import com.codeborne.selenide.Condition;
import com.selenide.pages.CroppPage;
import com.selenide.pages.HomePage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertEquals;

public class OrderProductE2ETest extends BaseTest  {


    @Test
    public void smoke(){
        croppPage.openSite();
        homePage.selectMenuSubmenu("Kobieta", "Swetry");
        subMenuPage.selectFirstProduct();
        productPage.selectSize("XS");
        productPage.assertSizeIsSelected("XS");
        productPage.addProductToCard();
        productPage.assertPrice("39,99");
        productPage.goToBasket();
    }
    @Test
    public void selectMenuSubMenuTest(){
        croppPage.openSite();
        homePage.selectMenuSubmenu("Kobieta", "Swetry");
        subMenuPage.assertTitleIs("Modne swetry damskie z kolekcji Cropp – odkryj najnowsze trendy");
    }
    @Test
    public void selectSizeTest(){
        croppPage.openSite();
        homePage.selectMenuSubmenu("Polecane", "Basic");
        subMenuPage.selectFirstProduct();
        productPage.selectSize("XS");
        productPage.assertSizeIsSelected("XS");
    }

}