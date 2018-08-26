package com.ctreservation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports", //generates every time we run the cukes runner
				"json:target/cucumber.json"
		
		},
		
		tags="@smoke",
		features= "src/test/resources/com/ct_reservation/features",
		glue= "com/ctreservation/step_definitions"
//		,dryRun = true
		)
public class SmokeTestRunner {

}
