package com.org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.baseclass.Baseclasss;

public class Authenticationpage extends Baseclasss {
@FindBy(xpath="//i[@class='icon-plus']")
private WebElement qty;	//+plus sign
@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
private WebElement proceed;       //Proceed to checkout
@FindBy(xpath="//span[text()='Proceed to checkout']")
private WebElement proceedaftertextbox;	//proceed after text
@FindBy(name="processCarrier")
private WebElement proceedto;  //Lastproceed
@FindBy(id="email")
private WebElement email;			//email
@FindBy(id="passwd")
private WebElement password;		//password
@FindBy(id="SubmitLogin")
private WebElement signin;			//signin
//@FindBy(xpath="//input[@type='checkbox']")
@FindBy(id="uniform-cgv")
private WebElement tick;		//tick
@FindBy(xpath="//a[@title='Pay by bank wire']")
private WebElement payment;		//payment
@FindBy(xpath="//span[contains(text(),'confirm my order')]")
private WebElement confirmorder;	//confrm
@FindBy(xpath="//textarea[@class='form-control']")
private WebElement textarea;		//textarea
@FindBy(xpath="//a[@title='Back to orders']")
private WebElement backto;		//back to orders
@FindBy(xpath="//p[@class='cheque-indent']")
private WebElement paypage; //payment page to take screenshot
@FindBy(xpath="//a[@class='logout']")
private WebElement logout;	//logout
@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
private WebElement proceedToCheck1;

public WebElement getProceedaftertextbox() {
	return proceedaftertextbox;
}
public WebElement getProceedToCheck1() {
	return proceedToCheck1;
}
public WebElement getLogout() {
	return logout;
}
public WebElement getPaypage() {
	return paypage;
}
public WebElement getBackto() {
	return backto;
}
public WebElement getProceedto() {
	return proceedto;
}
public WebElement getTextarea() {
	return textarea;
}
public WebElement getQty() {
	return qty;
}
public WebElement getProceed() {
	return proceed;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSignin() {
	return signin;
}
public WebElement getTick() {
	return tick;
}
public WebElement getPayment() {
	return payment;
}
public WebElement getConfirmorder() {
	return confirmorder;
}
	
public Authenticationpage() {
PageFactory.initElements(driver, this);
}



}
