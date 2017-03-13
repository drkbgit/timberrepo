package com.independent.mms.tests;

import com.independent.core.tests.BaseTest;
import com.independent.core.utilities.Driver;
import com.independent.mms.assertions.HomePageAssertions;
import com.independent.mms.pages.HomePage;
import com.independent.mms.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

/**
 * Created by ctl-user on 05-03-2017.
 */
public class pfnBaseTest extends BaseTest {
    HomePage homePage;
    RegisterPage registerPage;
    HomePageAssertions homePageAssertions;
    WebDriver driverInstance;

    @BeforeMethod
    @Parameters({"platform","browserName","browserVersion"})
    public void setUp(String os ,String browserName,String browserVersion){
        driverInstance = new Driver(os,browserName,browserVersion).getDriver();
        homePage  = new HomePage(driverInstance);
        registerPage = new RegisterPage(driverInstance);
        homePageAssertions = new HomePageAssertions();
    }

    @AfterMethod
    public void tearDown(){
        driverInstance.quit();
    }

}
