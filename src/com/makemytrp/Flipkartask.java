package com.makemytrp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.baseclass.Baseclasss;

public class Flipkartask extends Baseclasss {
public static void main(String[] args) throws Exception {
	browserLaunch("chrome","https://www.flipkart.com/");
	WebElement xbutton = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	click(xbutton);
	Scanner sc=new Scanner (System.in);
	String s = sc.nextLine();
	List<WebElement> menu = driver.findElements(By.tagName("span"));
	for (WebElement w : menu) {
if (w.getText().equalsIgnoreCase(s)) {
	mouseHover(w);
	break;
}
	}
	String b = sc.nextLine();
	List<WebElement> sub = driver.findElements(By.tagName("a"));
	for (WebElement sm : sub) {
		if (sm.getText().equalsIgnoreCase(b)) {
			click(sm);
			break;
			
		}
		
	}
	
	
	
	
}
}
