package com.org.framework2;

import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.org.adactin.Adactinn;
import com.org.baseclass.Baseclasss;

public class AdactinTest3 extends Baseclasss {
	@BeforeClass
	public static void browserInitialization() throws Exception {
		WebDriver browserLaunch = browserLaunch("chrome", "https://adactin.com/HotelApp/");
		System.out.println("Browser Initialization");

	}
	@Before
	public void credentials() {
		Adactinn ad=new Adactinn();
		inputValueUsingSendkeys(ad.getUsername(), "subashree73");
		inputValueUsingSendkeys(ad.getPassword(), "subashree73");
		click(ad.getLogin());

	}
	

}
