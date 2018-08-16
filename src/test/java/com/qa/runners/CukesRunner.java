package com.qa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@temp",
		features= {"src/test/resources/com/fetures"},
		glue= {
			"src/test/java/com/qa/step_definitions/HomePageStepDef.java"	
		}
		,dryRun=false
		
		)
public class CukesRunner {

}
