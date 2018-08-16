package com.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports", 
				"json:target/cucumber.json"
		
		},
		
		tags="@temp",
		features= {"src/test/resources/com/fetures"},
		glue= 
			"com/qa/step_definitions"	
		
		//,dryRun=false
		
		)
public class CukesRunner {

}
