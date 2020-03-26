package com.makemytrp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.baseclass.Baseclasss;

public class MakemyTptask extends Baseclasss{
public static void main(String[] args) throws Exception {
	browserLaunch("chrome", "https://www.makemytrip.com/");
	WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
	click(from);
	inputValueUsingSendkeys(from, "chennai");
	WebElement to = driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
	click(to);
	inputValueUsingSendkeys(to, "delhi");
	WebElement departure = driver.findElement(By.id("departure"));
	click(departure);
	WebElement datein = driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[10]"));
	click(datein);
	WebElement returnn = driver.findElement(By.xpath("//input[@id='return']"));
	click(returnn);
	WebElement dateout = driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[14]"));
	click(dateout);
}
	
	
	
	
	
	
	
	
	
	
}
