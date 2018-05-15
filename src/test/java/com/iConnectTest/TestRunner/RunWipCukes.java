package com.iConnectTest.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber-html-report" }, glue = {
		"com.iConnectTest.stepDefinations" }, features = {
				"src/test/resources/Features/" }, tags = {"@Test1"})

public class RunWipCukes {

}