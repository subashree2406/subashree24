package com.org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.baseclass.Baseclasss;

public class SearchPage extends Baseclasss {

@FindBy(id="continue")
private WebElement continuebutton;	//continuebutton click	
@FindBy(id="hotel_name_0")
private WebElement Shotelname;
@FindBy(xpath="//a[text()='Logout']")
private WebElement logout;
@FindBy(xpath="//input[@id='radiobutton_0']")
private WebElement radiobutton;// radiobutton click
@FindBy(id="location_0")
private WebElement SLocation;
@FindBy(id="rooms_0")
private WebElement Sroomno;

public WebElement getRadiobutton() {
	return radiobutton;
}


public WebElement getLogout() {
	return logout;
}


public WebElement getShotelname() {
	return Shotelname;
}


public WebElement getSLocation() {
	return SLocation;
}


public WebElement getSroomno() {
	return Sroomno;
}


public WebElement getContinuebutton() {
	return continuebutton;
}


public SearchPage() {
PageFactory.initElements(driver, this);
}
}

