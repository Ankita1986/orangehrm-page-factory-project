package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(xpath = "//a[contains(text(),'Features')]")
    WebElement featuresLink;

    public void clickOnFeaturesLink(){
        Reporter.log("Clicking on Features link " + featuresLink.toString() + "<br>");
        clickOnElement(featuresLink);
        log.info("Clicking on Features link " + featuresLink.toString());
    }


}
