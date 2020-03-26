package com.org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.baseclass.Baseclasss;

public class Account extends Baseclasss{
	@FindBy(id="search_query_top")
	private WebElement searchbox; //searchbox
	@FindBy(className="sf-with-ul")
	private WebElement women;					//WOMEN
	@FindBy(xpath="//a[@title='Dresses']")
	private WebElement Dresses;					//Dress
	@FindBy(xpath="(//a[@title='T-shirts'])[3]")
	private WebElement Tshirts;					//Tshirt
	@FindBy(xpath="//img[@class='replace-2x'][1]")
	private WebElement tops;		//tops
	@FindBy(xpath="(//a[text()='T-shirts'])[4]")
	private WebElement Toselectshirts; //To select tshirt
	@FindBy(xpath="//span[text()='Add to cart']")
	private WebElement addtocart;		//add to cart
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	private WebElement proceed;			//proceed to checkout
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement orange;
	@FindBy(id="add_to_cart")
	private WebElement addtocartblue;
	@FindBy(xpath="//a[@title='Faded Short Sleeve T-shirts']")
	private WebElement addtocartt;
	public WebElement getAddtocartt() {
		return addtocartt;
	}
	public WebElement getAddtocartblue() {
		return addtocartblue;
	}
	public WebElement getOrange() {
		return orange;
	}
	public WebElement getSearchbox() {
		return searchbox;
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
	public WebElement getTops() {
		return tops;
	}
	public WebElement getToselectshirts() {
		return Toselectshirts;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	public WebElement getProceed() {
		return proceed;
	}
public Account() {
PageFactory.initElements(driver, this);
}

}
