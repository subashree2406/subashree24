package com.org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.baseclass.Baseclasss;

public class Adactinn extends Baseclasss{
@FindBy(id="username")
private WebElement username;  //usernamefield
@FindBy(id="password")
private WebElement password;	//passwordfield
@FindBy(id="login")
private WebElement login;		//loginbutton
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
public Adactinn() {
PageFactory.initElements(driver, this);
}
}
