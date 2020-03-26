package com.org.adactintest;

import com.org.adactin.Adactinn;
import com.org.adactin.ReservePage;
import com.org.baseclass.Baseclasss;

public class Testcase1 extends Baseclasss{
	public static void main(String[] args) throws Exception {
		browserLaunch("chrome", "https://adactin.com/HotelApp/");
		Adactinn ad=new Adactinn();
		ReservePage rp=new ReservePage();
		inputValueUsingSendkeys(ad.getUsername(), "subashree73");
		inputValueUsingSendkeys(ad.getPassword(), "subashree73");
		click(ad.getLogin());
		
	}

}
