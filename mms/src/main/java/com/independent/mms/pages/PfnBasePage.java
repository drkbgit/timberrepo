package com.independent.mms.pages;

import com.independent.core.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ctl-user on 08-03-2017.
 */
public class PfnBasePage extends BasePage{

    public PfnBasePage(){

    }

    public PfnBasePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

}
