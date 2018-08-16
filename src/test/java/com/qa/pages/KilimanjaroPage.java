package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utilities.Driver;

public class KilimanjaroPage {

	public KilimanjaroPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//h1[.='kilimanjaro']")
	public WebElement headerText;
	
	
	public List<WebElement> getAvailableTime(int dayFromToday){
		String xpath = "//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr["+
							dayFromToday+"]//td";
		
		return Driver.getDriver().findElements(By.xpath(xpath));
	}
	
	@FindBy(xpath="//a[@class='navbar-item'][.='map']")
	public WebElement mapLink;
	
	@FindBy(xpath="//a[@class='navbar-item'][.='schedule']")
	public WebElement scheduleLink;
	
	@FindBy(xpath="//a[@class='navbar-item'][.='hunt']")
	public WebElement huntLink;
	
	@FindBy(xpath="//a[.='my']")
	public WebElement myLink;
	
	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']")
	public WebElement scheduleTable;
	
	
	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[1]//td")
//	public List<WebElement> timeBW7to730;
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW730to8;
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[3]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
//	
//	@FindBy(xpath="//table[@class='card table is-fullwidth is-transparent borderless']/tbody/tr[2]//td")
//	public List<WebElement> timeBW
}
