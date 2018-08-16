package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Driver;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath="//input[@class='input ng-dirty ng-valid ng-touched']")
	public WebElement userNameField;
	
	@FindBy(xpath="//input[@class='input ng-dirty ng-touched ng-invalid']")
	public WebElement passField;
	
	@FindBy(xpath="//button[.='sign in']")
	public WebElement signInButton;
	
	
	
}
