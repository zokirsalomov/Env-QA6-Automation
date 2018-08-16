package com.qa.step_definitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.qa.utilities.ConfigurationReader.*;

public class HomePageStepDef {
	
	public WebDriver driver;
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	
	@Given("the user goes to the home page")
	public void the_user_goes_to_the_home_page() {
		driver = Driver.getDriver();
		
		driver.get(getProperty("url"));
	}

	@When("User loges in using username {string} and password {string}")
	public void user_loges_in_using_username_and_password(String string, String string2) {
		
		loginPage.userNameField.sendKeys(string);
	    loginPage.passField.sendKeys(string2);
	    loginPage.signInButton.click();
	}

	@Then("user should see map and following links:")
	public void user_should_see_map_and_following_links(List<String> rooms) {
		
		rooms.sort((r1, r2) -> r1.compareTo(r2));
		
		List<String> linkTexts = new ArrayList<>();
		
		for (int i=0; i<homePage.listOfRooms().size(); i++) {
			linkTexts.add(homePage.listOfRooms().get(i).getText());
		}
	    
		linkTexts.sort((l1, l2) -> l1.compareTo(l2));
		
		System.out.println(rooms);
		System.out.println(linkTexts);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}