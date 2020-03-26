package com.org.adactintest;

import com.org.adactin.Adactinn;
import com.org.adactin.ReservePage;
import com.org.baseclass.Baseclasss;

public class Testcase7 extends Baseclasss{
	public static void main(String[] args) throws Exception {
		browserLaunch("chrome", "https://adactin.com/HotelApp/");
		Adactinn ad=new Adactinn();
		ReservePage rp=new ReservePage();
		//SearchPage sp=new SearchPage();
		inputValueUsingSendkeys(ad.getUsername(),"subashree73");
		inputValueUsingSendkeys(ad.getPassword(), "subashree73");
		click(ad.getLogin());
		dropdown(rp.getHotel(), "text", "Hotel Creek");
		dropdown(rp.getLocation(), "value", "Sydney");
		dropdown(rp.getRoomtype(), "text", "Standard");
		dropdown(rp.getRoomno(), "index", "1");
		inputValueUsingSendkeys(rp.getDatein(), "06/03/2020");
		inputValueUsingSendkeys(rp.getDateout(), "07/03/2020");
		dropdown(rp.getAdultroom(), "value", "1");
		dropdown(rp.getChildrenroom(), "index", "0");
		click(rp.getSearch());
		
	}

}
