package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Ankita
 */
public class FeaturesTest extends TestBase {

    HomePage homePage;


    @BeforeMethod
    public void setUp(){
        homePage = new HomePage();
    }

    @Test(groups = {"sanity"})

    public void verifyUserShouldNavigateToFeaturePage(){
        homePage.clickOnFeaturesLink();


    }
}
