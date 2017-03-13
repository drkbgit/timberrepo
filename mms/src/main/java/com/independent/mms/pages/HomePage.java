package com.independent.mms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ctl-user on 04-03-2017.
 */
public class HomePage extends PfnBasePage {
    @FindBy(xpath = "(//a[contains(@id,'LoginUser')])[1]")
    WebElement lnkRegister;
    @FindBy(xpath = "(//div[contains(@id,'LoginUser')]//a)[2]")
    WebElement lnkLogin;
    @FindBy(xpath = "//table[contains(@id,'LoginUser')]")
    WebElement tblLogin;

    public HomePage(WebDriver driver){
        super(driver);
        //PageFactory.initElements(driver,this);
        PageFactory.initElements(driver,this);
    }

    public void clickRegisterLink(){
        click(lnkRegister);
    }

    public void loginAsUser(){
        lnkLogin.click();
    }

    public boolean isLoginTableDisplayed(){
        try{
            waitForElementToBeVisible(tblLogin,20);
            return true;
        }catch(Exception e){
            return false;
        }

    }

}
