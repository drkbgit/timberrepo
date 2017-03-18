package com.independent.mms.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.independent.core.reporters.BaseReporter;


/**
 * Created by ctl-user on 05-03-2017.
 */
public class HomePageTest extends pfnBaseTest {

    @Test
    public void verifyRegisterUser(){
        homePage.navigateToURL("http://www.personalfn.com");
        homePage.clickRegisterLink();
        Assert.assertEquals(registerPage.getCurrentUrl(), homePageAssertions.getRegistrationPageURL(),"User" +
                "landed on the registration page successfully" );
        BaseReporter.report("Home page test successful");
    }

    @Test
    public void  verifyLoginAsUser(){
        homePage.navigateToURL("http://www.personalfn.com");
        homePage.loginAsUser();
        Assert.assertTrue(homePage.isLoginTableDisplayed(),"Login table is displayed");
        BaseReporter.report("User authentication test successful");

    }
}
