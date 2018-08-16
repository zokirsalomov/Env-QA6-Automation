package com.qa.step_definitions;

import com.qa.pages.HomePage;
import com.qa.pages.KilimanjaroPage;
import com.qa.pages.LoginPage;
import com.qa.utilities.BrowserUtils;

import static com.qa.utilities.ConfigurationReader.*;
import static org.testng.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoomPagesStepDefs {

	HomePage hp = new HomePage();
	LoginPage lp = new LoginPage();
	KilimanjaroPage kp = new KilimanjaroPage();
	
	@Given("user logs in with valid credentials")
	public void user_logs_in_with_valid_credentials() {
	    lp.userNameField.sendKeys(getProperty("userMember"));
	    lp.passField.sendKeys(getProperty("passMember"));
	    lp.signInButton.click();
	}

	@When("user clicks on {string}")
	public void user_clicks_on(String string) {
	    hp.kilimanjaro.click();
	}

	@Then("user should see booked daily schedule for selected {string}")
	public void user_should_see_booked_daily_schedule_for_selected(String string) {
	    BrowserUtils.waitFor(3);
	    
	    assertTrue(kp.scheduleTable.isDisplayed());
	    
	}
}
