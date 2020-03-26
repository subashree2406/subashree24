package com.org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.baseclass.Baseclasss;

public class ReservePage extends Baseclasss{
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;	//location
	@FindBy(id="hotels")
	private WebElement hotel;	//hotels
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement roomno;
	@FindBy(id="datepick_in")
	private WebElement datein;
	@FindBy(id="datepick_out")
	private WebElement dateout;
	@FindBy(id="adult_room")
	private WebElement adultroom;
	@FindBy(id="child_room")
	private WebElement childrenroom;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement search;
	@FindBy(id="Reset")
	private WebElement reset;
	@FindBy(xpath="//option[@value='Sydney']")
	private WebElement sydney;
	public WebElement getSydney() {
		return sydney;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomno() {
		return roomno;
	}
	public WebElement getDatein() {
		return datein;
	}
	public WebElement getDateout() {
		return dateout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildrenroom() {
		return childrenroom;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getReset() {
		return reset;
	}
	
	
	public ReservePage() {
PageFactory.initElements(driver, this);
	}
	

}
