package PageObjectsTests;

import browserdriver.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjects.ContactUs;
import PageObjects.HomePage;

public class ContactUsPageTest extends BrowserDriver {
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
        Assert.assertEquals(actualMessage, "Your message has been successfully sent to our team." );
    }
//homePage.goToContactUsPage();
//        String actualMessage = contactUs.contactUsFormSubmission();
}
