package com.selenide.tests;

import com.selenide.pages.CroppPage;
import com.selenide.pages.HomePage;
import com.selenide.pages.ProductPage;
import com.selenide.pages.SubMenuPage;

/**
 * Created by Lukasz Krause
 * Date: 14.03.2021
 */
public class BaseTest {
    CroppPage croppPage = new CroppPage();
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    SubMenuPage subMenuPage = new SubMenuPage();

}
