package com.qa.step_definitions;

import com.qa.pages.FreeSpotsPage;
import com.qa.pages.HomePage;
import com.qa.pages.HuntPage;
import com.qa.pages.RoomSchedulesPage;
import com.qa.pages.LoginPage;
import com.qa.utilities.BrowserUtils;
import com.qa.utilities.Driver;

import static com.qa.utilities.ConfigurationReader.*;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoomSchedulesStepDef {

	HomePage hp = new HomePage();
	LoginPage lp = new LoginPage();
	RoomSchedulesPage rsch = new RoomSchedulesPage();
	HuntPage huntPage = new HuntPage();
	
	int timeFrom;
	int timeTill;
	int emptyDate;
	
	@Given("user logs in with valid credentials")
	public void user_logs_in_with_valid_credentials() {
	    lp.userNameField.sendKeys(getProperty("userMember"));
	    lp.passField.sendKeys(getProperty("passMember"));
	    lp.signInButton.click();
	}

	@When("user clicks on {string}")
	public void user_clicks_on(String room) {
	    
		
		for (WebElement eachroom : hp.listOfRooms()) {
			if(eachroom.getText().equals(room)) {
				eachroom.click();
				break;
			}
		}
	}

	@Then("user should see booked daily schedule for selected {string}")
	public void user_should_see_booked_daily_schedule_for_selected(String room) {
	    BrowserUtils.waitFor(3);
	    
	    assertTrue(rsch.scheduleTable.isDisplayed());
	    BrowserUtils.hover(hp.my);
	    hp.signout.click();
	}
	
	//====================================================================
	
	@When("clicks on {string}")
	public void clicks_on(String room) {
	    BrowserUtils.waitFor(3);
		for(WebElement eachRoom: hp.listOfRooms()) {
			if(eachRoom.getText().equals(room)) {
				eachRoom.click();
			}
		}
	}

	@When("user verfies empty date and time on the schedule")
	public void user_verfies_empty_date_and_time_on_the_schedule() {
		
		for(int i=0; i<28; i++) {
		int count = 0;
			
		
			//rsch.getAvailableTime(i).get(i)
			
//				timeFrom =i;
//			
//			timeTill =i+2;
//			emptyDate = i;
			
		}
	}

	@When("user hunts for that same date and time in the hunt page")
	public void user_hunts_for_that_same_date_and_time_in_the_hunt_page() {
	    hp.hunt.click();
	    String today = LocalDate.now().toString();
	    String dateOnly = today.substring(today.length()-2);
	    
	    int targetNumber = Integer.parseInt(dateOnly);
	    
	    huntPage.dateField.sendKeys( (targetNumber+ emptyDate) + "");
	    
	    Select select1 = new Select(huntPage.timeStart);
	    Select select2 = new Select(huntPage.timeFinish);
	    
	    select1.selectByIndex(timeFrom);
	    select2.selectByIndex(timeTill);
	    huntPage.searchButton.click();
	    
	}

	@Then("user should see {string} name on the list of free spots")
	public void user_should_see_name_on_the_list_of_free_spots(String room) {
	    FreeSpotsPage freeSpot = new FreeSpotsPage();
	    
	    for (WebElement eachRoom : freeSpot.freeRooms) {
			if(eachRoom.getText().equals(room)) {
				assertTrue(eachRoom.isDisplayed());
			}
		}
	    		
	}
}
