package com.org.adactintest;

import com.org.adactin.Adactinn;
import com.org.adactin.ReservePage;
import com.org.baseclass.Baseclasss;

public class TestCase3 extends Baseclasss{
	public static void main(String[] args) throws Exception {
		browserLaunch("chrome","https://adactin.com/HotelApp/");
		Adactinn ad=new Adactinn();
		ReservePage rp=new ReservePage();
		inputValueUsingSendkeys(ad.getUsername(), "subashree73");
		inputValueUsingSendkeys(ad.getPassword(), "subashree73");
		click(ad.getLogin());
		dropdown(rp.getLocation(),"text", "Sydney");
		dropdown(rp.getHotel(), "text", "Hotel Creek");
		dropdown(rp.getRoomtype(), "value", "Standard");
		dropdown(rp.getRoomno(), "index", "1");
		rp.inputValueUsingSendkeys(rp.getDatein(), "05/03/2020");
		rp.inputValueUsingSendkeys(rp.getDateout(), "04/03/2020");
		dropdown(rp.getAdultroom(), "value", "1");
		dropdown(rp.getChildrenroom(), "value", "3");
		click(rp.getSearch());
	}

	

}
