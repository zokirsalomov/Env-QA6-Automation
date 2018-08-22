package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Driver;

public class HuntPage {

	public HuntPage() {
		PageFactory.initElements(Driver.getDriver(),this);
	}
	
	@FindBy(xpath="//input[@id='date']")
	public WebElement dateField;
	
	@FindBy(xpath="//select[@id='timelineStart']")
	public WebElement timeStart;
	
	@FindBy(xpath="//select[@id='timelineFinish']")
	public WebElement timeFinish;
	
	@FindBy(xpath="//fa[@name='search']")
	public WebElement searchButton;
	
	
	
	
	
}
