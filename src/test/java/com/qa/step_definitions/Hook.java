package com.qa.step_definitions;

import java.util.concurrent.TimeUnit;

import com.qa.utilities.ConfigurationReader;
import com.qa.utilities.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	@Before
	public void setUp() {
		Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}
	
	@After
	public void tearDown() {
		Driver.closeDriver();
	}
}
