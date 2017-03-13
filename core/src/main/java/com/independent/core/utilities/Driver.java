package com.independent.core.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by ctl-user on 12-03-2017.
 */
public class Driver {
    protected WebDriver driver;
    DesiredCapabilities capabilities;
    ChromeOptions chromeOptions;
    FirefoxOptions firefoxOptions;
    EdgeOptions edgeOptions;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public Driver(String os,String browser,String browserVersion){

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform",os);
        capabilities.setCapability("browserName",browser);
        capabilities.setCapability("version",browserVersion);
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver\\geckodriver.exe");

        if(browser.equalsIgnoreCase("FIREFOX")){
            //capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS,firefoxOptions);
            setDriver(new FirefoxDriver());
        }else if(browser.equalsIgnoreCase("CHROME")){
            //capabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
            driver = new ChromeDriver(capabilities);
            setDriver(driver);
        }else if(browser.equalsIgnoreCase("IE")){
            setDriver(new InternetExplorerDriver());
        }else if(browser.equalsIgnoreCase("EDGE")) {
            setDriver(new EdgeDriver());
        }
        else{
            setDriver(new ChromeDriver());
        }
    }

}
