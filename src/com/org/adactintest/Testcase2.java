package com.org.adactintest;

import com.org.adactin.Adactinn;
import com.org.adactin.ReservePage;
import com.org.baseclass.Baseclasss;

public class Testcase2 extends Baseclasss{
public static void main(String[] args) throws Throwable {
	browserLaunch("chrome", "https://adactin.com/HotelApp/");
	Adactinn ad=new Adactinn();
	ReservePage rp=new ReservePage();
	inputValueUsingSendkeys(ad.getUsername(),"subashree73");
	inputValueUsingSendkeys(ad.getPassword(), "subashree73");
	click(ad.getLogin());
	dropdown(rp.getHotel(), "text", "Hotel Creek");
	dropdown(rp.getLocation(), "value", "Sydney");
	dropdown(rp.getRoomtype(), "text", "Standard");
	dropdown(rp.getRoomno(), "index", "2");
	inputValueUsingSendkeys(rp.getDatein(), "07/03/2020");
	inputValueUsingSendkeys(rp.getDateout(), "05/03/2020");
	dropdown(rp.getAdultroom(), "value", "1");
	dropdown(rp.getChildrenroom(), "value", "3");
	click(rp.getSearch());
	
}
}
