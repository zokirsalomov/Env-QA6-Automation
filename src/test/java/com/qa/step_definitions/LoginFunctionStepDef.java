package com.qa.step_definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utilities.BrowserUtils;
import com.qa.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.qa.utilities.ConfigurationReader.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginFunctionStepDef {
	
	//public WebDriver driver;
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	
	@Given("the user goes to the home page")
	public void the_user_goes_to_the_home_page() {
		
	}

	@When("User loges in using username {string} and password {string}")
	public void user_loges_in_using_username_and_password(String string, String string2) {
		
		loginPage.userNameField.sendKeys(string);
	    loginPage.passField.sendKeys(string2);
	    loginPage.signInButton.click();
	}

	@Then("user should see map and following links:")
	public void user_should_see_map_and_following_links(List<String> rooms) {
		
		BrowserUtils.waitFor(3);
		for(int i=0; i<homePage.listOfRooms().size(); i++) {
			assertTrue(homePage.listOfRooms().get(i).isDisplayed());
		}
	}
	
	
	@When("user enters invalid username {string} and {string}")
	public void user_enters_invalid_username_and(String string, String string2) {
		loginPage.userNameField.sendKeys(string);
	    loginPage.passField.sendKeys(string2);
	    loginPage.signInButton.click();
	}

	@Then("System should display {string} message")
	public void system_should_display_message(String string) {
	    if(loginPage.invUserMsg.isDisplayed()) {
	    	BrowserUtils.waitFor(1);
	    	System.out.println("expected: "+loginPage.invUserMsg.getText());
	    	System.out.println("but found: " + string);
	    	assertEquals(loginPage.invUserMsg.getText(), string);
	    }
	}

	@When("User enters valid username {string} and invalid password {string}")
	public void user_enters_valid_username_and_invalid_password(String string, String string2) {
		loginPage.userNameField.sendKeys(string);
	    loginPage.passField.sendKeys(string2);
	    loginPage.signInButton.click();
	}

	@Then("System should display error {string} message")
	public void system_should_display_error_message(String string) {
	    if(loginPage.invPassMsg.isDisplayed()) {
	    	BrowserUtils.waitFor(1);
	    	assertEquals(loginPage.invPassMsg.getText(), string);
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
