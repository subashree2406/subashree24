package com.org.framework2;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.seleniumhq.jetty9.util.TopologicalSort;

import com.org.baseclass.Baseclasss;
import com.org.pom.Account;
import com.org.pom.Authenticationpage;
import com.org.pom.HomePage;
import com.org.pom.loginPage;

public class JunitTesting extends Baseclasss{
@BeforeClass
public static void browserInitialization() throws Exception {
	WebDriver browswerlaunch = browserLaunch("chrome", "http://automationpractice.com/index.php");
	System.out.println("Browser Initialization");
}
//@Before
//public void logIntoApplication() {
//	HomePage hp=new HomePage();
//	loginPage lp=new loginPage();
//	click(hp.getLoginbutton());
//	inputValueUsingSendkeys(lp.getEmailfield(), "subashree77@gmail.com");
//	inputValueUsingSendkeys(lp.getPasswordfield(), "subashree77");
//	click(lp.getLoginsubmit());
//	 String myname = getText(lp.getMyname());
//	if (myname.contains(getText(lp.getMyname()))) {
//		System.out.println("valid name");
//		}
//	else {
//		System.out.println("Invalid name");
//	}
//	
//}
@Test
public void orderUsingMenu(){
	Autopractsearch aps=new Autopractsearch();
	click(aps.getSearchbox());
	inputValueUsingSendkeys(aps.getSearchbox(), "Dresses");
	click(aps.getSearchbutton());
	click(aps.getSummerdress());
	click(aps.getAddtocartsummer());
	click(aps.getProceedtochecksummer());
	click(aps.getProceedsummary());
	click(aps.getEnteremail());
	inputValueUsingSendkeys(aps.getEnteremail(), "subashree77@gmail.com");
	click(aps.getEnterpassword());
	inputValueUsingSendkeys(aps.getEnterpassword(), "subashree77");
	click(aps.getSignin());
	scrollUsingElement(aps.getTextarea());
	click(aps.getTextarea());
	inputValueUsingSendkeys(aps.getTextarea(), "hi welcome thank you");
	click(aps.getProceedaddress());
	scrollUsingElement(aps.getTick());
	click(aps.getTick());
	click(aps.getShiproceed());
	
	
}
//@After
//public void logoutOfApplication() {
//	Authenticationpage ap =new Authenticationpage();
//	click(ap.getLogout());
//String logouttext = getText(ap.getLogout());
//if (logouttext.contains(getText(ap.getLogout()))) {
//	System.out.println("Logged Out");
//}else {
//	System.out.println("Logout Failed");
//}
//}

//@AfterClass
//public static void quitBrowser() {
//driver.quit();
}
//}