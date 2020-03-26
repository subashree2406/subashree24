package com.org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.baseclass.Baseclasss;

public class HomePage extends Baseclasss {
@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
private WebElement loginbutton;//sign in
@FindBy(id=("search_query_top"))
private WebElement searchbox;//searchbox
@FindBy(className=("btn btn-default button-search"))
private WebElement searchbutton;//searchbutton
@FindBy(xpath=("//a[@title='View my shopping cart']"))
private WebElement cartbutton;//cartbutton
@FindBy(className="shop-phone")
private WebElement phonenumber;//phonenumber
@FindBy(className="logo img-responsive")
private WebElement logo;//logo
@FindBy(xpath="//a[text()='Contact us']")
private WebElement contactbutton;//contact
@FindBy(className="sf-with-ul")
private WebElement women;					//WOMEN
@FindBy(xpath="//a[@title='Dresses']")
private WebElement Dresses;					//Dress
@FindBy(xpath="//a[@title='T-shirts']")
private WebElement Tshirts;					//Tshirt
@FindBy(id="newsletter-input")
private WebElement entermail;				//enter your mail
@FindBy(xpath="//img[@class='item-img'][1]")
private WebElement sale25;					//3days sale 25%
@FindBy(xpath="//img[@class='item-img'][2]")
private WebElement summercollection45;			// summercollection45
@FindBy(xpath="//img[@class='item-img'][3]")
private WebElement toptrends;		//TopTrends
@FindBy(xpath="//img[@class='item-img'][4]")
private WebElement Menscoat;		//mens coat&jacket
@FindBy(xpath="//img[@class='item-img'][5]")
private WebElement Womenscoat;		//womens coat and jacket
@FindBy(xpath="//img[@class='item-img'][6]")
private WebElement Sunglass;		//sunglasses
@FindBy(xpath="//img[@class='item-img'][7]")
private WebElement savvytrends;			//Savvytrends
public WebElement getLoginbutton() {
	return loginbutton;
}
public WebElement getSearchbox() {
	return searchbox;
}
public WebElement getSearchbutton() {
	return searchbutton;
}
public WebElement getCartbutton() {
	return cartbutton;
}
public WebElement getPhonenumber() {
	return phonenumber;
}
public WebElement getLogo() {
	return logo;
}
public WebElement getContactbutton() {
	return contactbutton;
}
public WebElement getWomen() {
	return women;
}
public WebElement getDresses() {
	return Dresses;
}
public WebElement getTshirts() {
	return Tshirts;
}
public WebElement getEntermail() {
	return entermail;
}
public WebElement getSale25() {
	return sale25;
}
public WebElement getSummercollection45() {
	return summercollection45;
}
public WebElement getToptrends() {
	return toptrends;
}
public WebElement getMenscoat() {
	return Menscoat;
}
public WebElement getWomenscoat() {
	return Womenscoat;
}
public WebElement getSunglass() {
	return Sunglass;
}
public WebElement getSavvytrends() {
	return savvytrends;
}
public HomePage() {
PageFactory.initElements(driver, this);
}

}
