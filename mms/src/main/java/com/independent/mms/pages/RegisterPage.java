package com.independent.mms.pages;

import com.independent.core.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by ctl-user on 04-03-2017.
 */
public class RegisterPage extends PfnBasePage {
    @FindBy(xpath ="//input[contains(@id,'txtUserName')]")
    WebElement txtUsername;
    @FindBy(xpath ="//select[contains(@id,'ddlSalutaion')]")
    WebElement ddnSalutation;
    @FindBy(xpath ="//input[contains(@id,'txtFirstName')]")
    WebElement txtFirstName;
    @FindBy(xpath ="//input[contains(@id,'txtMiddleName')]")
    WebElement txtMiddleName;
    @FindBy(xpath ="//input[contains(@id,'txtLastName')]")
    WebElement txtLastName;
    @FindBy(xpath ="//input[contains(@id,'txtMobile')]")
    WebElement txtMobile;
    @FindBy(xpath ="//select[contains(@id,'ddlGender')]")
    WebElement ddnGender;
    @FindBy(xpath ="//input[contains(@id,'txtEmailID')]")
    WebElement txtEmailID;
    @FindBy(xpath ="//input[contains(@id,'chkTU')]")
    WebElement chkTermsAndConditions;
    @FindBy(xpath ="//input[contains(@id,'chkRA')]")
    WebElement chkReceiveOfferUpdates;
    @FindBy(xpath ="//input[contains(@id,'btnSubmit')]")
    WebElement btnSubmit;
    @FindBy(xpath ="//input[contains(@id,'btnReset')]")
    WebElement btnReset;
    BasePage basePage;

    public RegisterPage(WebDriver driver){
        super(driver);
        //BasePage basePage  = new BasePage(driver);
    }

    public void enterUsername(String username){
        enterText(txtUsername,username);
    }

    public void selectSalutation(String salutation){
        selectByVisibleText(ddnSalutation,salutation);
    }

    public void enterFirstName(String firstName){
        enterText(txtFirstName,firstName);
    }

    public void enterMiddleName(String middleName){
        enterText(txtMiddleName,middleName);
    }

    public void enterLastName(String lastName){
        enterText(txtLastName, lastName);
    }

    public void selectGender(String gender){
        selectByVisibleText(ddnGender,gender);
    }

    public void enterPrimaryEmailId(String emailId){
        enterText(txtEmailID, emailId);
    }

    public void chkTermsAndConditions(){
        click(chkTermsAndConditions);
    }

    public void chkReceiveOfferUpdates(){
        click(chkReceiveOfferUpdates);
    }

    public void resetRegistrationForm(){
        click(btnReset);
    }

    public void fillRegistrationForm(){
        txtUsername.sendKeys("Austin");
        selectByVisibleText(ddnSalutation,"Mr");
        txtFirstName.sendKeys("Aus");
        txtMiddleName.sendKeys("tin");
        txtLastName.sendKeys("A");
        txtMobile.sendKeys("2222222222");
        selectByVisibleText(ddnGender,"Male");
        txtEmailID.sendKeys("A@A.com");
        chkTermsAndConditions.click();
    }
}
