package com.independent.mms.tests;

import org.testng.annotations.Test;

/**
 * Created by ctl-user on 12-03-2017.
 */
public class RegistrationTest extends pfnBaseTest {

    @Test
    public void verifyNewUserRegistration(){
        homePage.navigateToURL("http://www.personalfn.com");
        homePage.clickRegisterLink();
        registerPage.fillRegistrationForm();

    }
}
