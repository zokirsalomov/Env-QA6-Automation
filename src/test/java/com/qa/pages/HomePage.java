package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//a[@class='navbar-item is-active']")
	public WebElement map;
	
	@FindBy(xpath="//a[.='schedule']")
	public WebElement schedule;
	
	@FindBy(xpath="//a[.='hunt']")
	public WebElement hunt;
	
	@FindBy(xpath="//a[.='my']")
	public WebElement my;
	
	@FindBy(xpath="//a[.='self']")
	public WebElement mySelf;
	
	@FindBy(xpath="//a[.='team']")
	public WebElement myTeam;
	
	@FindBy(xpath="//a[.='sign out']")
	public WebElement signout;
	
	@FindBy(xpath="//h1[.='VA']")
	public WebElement campusName;
	
	@FindBy(xpath="//h2[.='dark-side']")
	public WebElement darkside;
	
	@FindBy(xpath="//span[.='kitchen']")
	public WebElement kitchen;
	
	@FindBy(xpath="//span[.='lobby']")
	public WebElement lobby;
	
	@FindBy(xpath="//span[.='study area']")
	public WebElement studyArea;
	
	@FindBy(xpath="//span[.='4stay']")
	public WebElement fourStay;
	
	@FindBy(xpath="//span[.='ocean view']")
	public WebElement oceanView;
	
	@FindBy(xpath="//div[@id='kuzzat_cave-121']/*")
	public WebElement kuzzatsCave;
	
	@FindBy(xpath="//div[@class='main-wrap center-vertically container']//a[1]")
	public WebElement kilimanjaro;
	
	@FindBy(xpath="//div[@class='main-wrap center-vertically container']//a[2]")
	public WebElement halfDome;
	
	@FindBy(xpath="//div[@class='main-wrap center-vertically container']//a[3]")
	public WebElement denali;
	
	@FindBy(xpath="//div[@class='main-wrap center-vertically container']//a[4]")
	public WebElement meru;
	

	@FindBy(xpath="//div[@class='main-wrap center-vertically container']")
	public WebElement buildingsMap;
	
	
	public List<WebElement> listOfRooms(){
		
		List<WebElement> ls = new ArrayList<>();
			ls.add(meru);
			ls.add(denali);
			ls.add(halfDome);
			ls.add(kilimanjaro);
			ls.add(kuzzatsCave);
			ls.add(oceanView);
			ls.add(fourStay);
			ls.add(studyArea);
			ls.add(lobby);
			ls.add(kitchen);
			ls.add(buildingsMap);
			
		return ls;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
