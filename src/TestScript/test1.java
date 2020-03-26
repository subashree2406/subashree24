package TestScript;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.org.baseclass.Baseclasss;
import com.org.pom.Account;
import com.org.pom.Authenticationpage;
import com.org.pom.HomePage;
import com.org.pom.loginPage;

public class test1 extends Baseclasss {
public static void main(String[] args) throws Exception {
	browserLaunch("chrome", "http://automationpractice.com/index.php");
	HomePage hp=new HomePage();
	loginPage lp=new loginPage();
	Account ac=new Account();
	Authenticationpage ap=new Authenticationpage();
	getPageurl();
	getPageTitle();
	click(hp.getLoginbutton());
	inputValueUsingSendkeys(lp.getEmailfield(), "subashree77@gmail.com");
	inputValueUsingSendkeys(lp.getPasswordfield(), "subashree77");
	click(lp.getLoginsubmit());
	click(ac.getWomen());
	click(ac.getTops());
scrollUsingElement(ac.getTshirts());
click(ac.getTshirts());	
scrollUsingElement(ac.getOrange());
mouseHover(ac.getOrange());
click(ac.getAddtocart());
click(ac.getProceed());
click(ap.getQty());
scrollUsingElement(ap.getProceed());
click(ap.getProceed());
scrollUsingElement(ap.getTextarea());
inputValueUsingSendkeys(ap.getTextarea(), "please call to this number");
click(ap.getProceedaftertextbox());
screenShott("suba");
scrollUsingElement(ap.getTick());
click(ap.getTick());
click(ap.getProceedto());
scrollUsingElement(ap.getPayment());
click(ap.getPayment());
scrollUsingElement(ap.getConfirmorder());
click(ap.getConfirmorder());
scrollUsingElement(ap.getBackto());
scrollUsingElement(ap.getLogout());
click(ap.getLogout());




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
