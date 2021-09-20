package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ApplePage;

public class AppleTest extends BaseTest {
    ApplePage applePage;

    @BeforeMethod
    public void setUp(){
        applePage = new ApplePage(getDriver());
        getExtentTest().assignAuthor("GaRmBoYz");
        getExtentTest().assignDevice("OS: Mac");
    }

    @Test(testName = "Verify Iphone Tab", description = "Verify Title")
    public void verifyAppleTab(){
        applePage.click(applePage.iPhoneBtn);
        applePage.threadSleepMethod(2000);
        logScreenshot();
        String expectedTitle = "iPhone - Apple";
        String actualTitle = applePage.getTitleMethod();
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @Test(testName = "iPhoneOption")
    public void iPhoneChoosing(){
        applePage.click(applePage.iPhoneBtn);
        applePage.scroll("2000");
        applePage.threadSleepMethod(5000);
        logScreenshot("--- iPhonePricing ---");
    }

}
