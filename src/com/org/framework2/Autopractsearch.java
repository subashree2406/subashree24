package com.org.framework2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.baseclass.Baseclasss;

public class Autopractsearch extends Baseclasss {
@FindBy(id="search_query_top")
private WebElement searchbox;		//searchbox
@FindBy(xpath="//button[@name='submit_search']")
private WebElement searchbutton;		//searchbutton
@FindBy(xpath="(//a[@title='Printed Summer Dress'])[3]")
private WebElement summerdress;			//summeryellowdress
@FindBy(xpath="//span[text()='Add to cart']")
private WebElement addtocartsummer;	//addtocartsummer
@FindBy(xpath="(//i[@class='icon-chevron-right right'])[2]")
private WebElement proceedtochecksummer;
@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
private WebElement proceedsummary;
@FindBy(id="email")
private WebElement enteremail ;	//enteremail
@FindBy(id="passwd")
private WebElement enterpassword ;	//enterpasswrd
@FindBy(id="SubmitLogin")
private WebElement signin ; //
@FindBy(xpath="//textarea[@class='form-control']")
private WebElement textarea ;
@FindBy(xpath="(//i[@class='icon-chevron-right right'])[7]")
private WebElement proceedaddress  ;
@FindBy(id="uniform-cgv")
private WebElement tick ;
@FindBy(xpath="(//span[contains(text(),'Proceed to checkout')])[2]") 						
private WebElement shiproceed ;
public WebElement getSearchbox() {
	return searchbox;
}
public WebElement getSearchbutton() {
	return searchbutton;
}
public WebElement getSummerdress() {
	return summerdress;
}
public WebElement getAddtocartsummer() {
	return addtocartsummer;
}
public WebElement getProceedtochecksummer() {
	return proceedtochecksummer;
}
public WebElement getProceedsummary() {
	return proceedsummary;
}
public WebElement getEnteremail() {
	return enteremail;
}
public WebElement getEnterpassword() {
	return enterpassword;
}
public WebElement getSignin() {
	return signin;
}
public WebElement getTextarea() {
	return textarea;
}
public WebElement getProceedaddress() {
	return proceedaddress;
}
public WebElement getTick() {
	return tick;
}
public WebElement getShiproceed() {
	return shiproceed;
}


public Autopractsearch() {
PageFactory.initElements(driver, this);
}



}
