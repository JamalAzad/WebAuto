package PageObjectsTests;

import PageObjects.ContactUs;
import PageObjects.HomePage;
import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactUsPageTest2 extends BrowserDriver {
    HomePage homePage = null;
    ContactUs contactUs = null;

    @BeforeMethod
    public void initializeElement(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        contactUs =  PageFactory.initElements(driver, ContactUs.class);
    }

    @Test
    public void sendTextTest(){
        homePage.goToContactUsPage();
        String actualMessage;
        actualMessage = contactUs.contactUsFormSubmission();
        Assert.assertEquals(actualMessage, "Your message has been successfully sent to SARWAR." );
    }
//homePage.goToContactUsPage();
//        String actualMessage = contactUs.contactUsFormSubmission();
}
