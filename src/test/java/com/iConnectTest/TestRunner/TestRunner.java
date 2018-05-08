package com.iConnectTest.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report" }, glue = {
		"com.sdet.iConnectEducationQualification.stepDefinations" }, features = { "/src/test/resources/Features" })

public class TestRunner {

}
