package com.independent.core.reporters;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;
import org.testng.Reporter;

import java.util.List;


/**
 * Created by ctl-user on 05-03-2017.
 */
public class BaseReporter implements IReporter{
    public void generateReport(List<XmlSuite> xmlSuite, List<ISuite> iSuites,String outputDirectory){

    }

    public static void report(String message){
        Reporter.log(message);
    }
}
