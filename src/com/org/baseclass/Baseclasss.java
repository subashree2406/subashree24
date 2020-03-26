package com.org.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclasss {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browser, String url) throws Exception {
if (browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	driver=new ChromeDriver();	
}
else if (browser.equalsIgnoreCase("Firefox")) {
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\driver\\geckodriver.exe");
	driver=new FirefoxDriver();
}else if (browser.equalsIgnoreCase("opera")) {
	System.setProperty("webdriver.opera.driver", System.getProperty("user.dir")+"driver\\operadriver.exe");
	driver=new OperaDriver();
}else if (browser.equalsIgnoreCase("internetexplorer")) {
	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"driver\\iedriver.exe");
	driver=new InternetExplorerDriver();
}
else {
		throw new Exception("Not a valid browsername ");

	}
driver.get(url);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
return driver;
	}
	public static String getPageTitle() {		//getpagetitle
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}	
		public static String getPageurl() {	//getpageurl
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	return currentUrl;
		}
		public static void navigateOption(String option) {	//navigate
	if (option.equalsIgnoreCase("back")) {
		driver.navigate().back();
	}else if (option.equalsIgnoreCase("forward")) {
	driver.navigate().forward();	
	}else if (option.equalsIgnoreCase("refresh")) {
		driver.navigate().refresh();
	}else if (option.contains("http")) {
	driver.navigate().to(option);	
	}
		}
		public static void click(WebElement element) {	//click
			waitForElementVisibility(element);
			element.click();
		}
		public static void clear(WebElement element) {	//clear
			waitForElementVisibility(element);
			element.clear();
		}
		public static void waitForElementVisibility(WebElement element) {	//wait
	WebDriverWait wb= new WebDriverWait(driver, 50);
	wb.until(ExpectedConditions.visibilityOf(element));
		}
		public static String getText(WebElement element) { 	//gettext
			waitForElementVisibility(element);
			String text = element.getText();
			System.out.println(text);
			return text;
		}
		public static String getAttributeValue(WebElement element ) {	//getAttributeValue
			waitForElementVisibility(element);
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
			return attribute;
		}
		public static void inputValueUsingSendkeys( WebElement element, String value) { 	//sendkeys
			waitForElementVisibility(element);
	if(enabled(element)&&displayed(element)) {
		clear(element);
		element.sendKeys(value);
		}
	}
		public static File screenShott(String filename) throws IOException {	//screenshot
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File des=new File(System.getProperty("user.dir")+ "\\screensht\\"+filename+".png");
	FileUtils.copyFile(src, des);
	return src;
	}
		public static void scrollUsingElement(WebElement element) {	//scroll
			waitForElementVisibility(element);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView()", element);
	}
		public static void scrollUsingCoordinates(int x, int y) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scollBy("+ x +","+y+")");
		}
		public static void scrollUsingHeight(String page) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	if(page.equalsIgnoreCase("Top to bottom")) {
	js.executeAsyncScript("window.scrollto(0,document.body.scrollHeight)");
	}
	else if (page.equalsIgnoreCase("bottom to Top")) {
		js.executeScript("window.scrollto(0,-document.body.scrollHeight)");
	}
		}
		public static void mouseHover(WebElement element) {		//mousehover
	Actions ac=new Actions(driver);
	ac.moveToElement(element).build().perform();
		}
		public static boolean enabled(WebElement element) {	//enabled
			waitForElementVisibility(element);
			boolean enable = element.isEnabled();
			return enable;
		}
		public static boolean displayed(WebElement element) {	//displayed
	waitForElementVisibility(element);
			boolean display = element.isDisplayed();
	return display;
		}
		public static boolean selected(WebElement element ) {	//selected
			waitForElementVisibility(element);
	boolean select = element.isSelected();
	return select;
		}
		
			public static void dropdown(WebElement element,String options,String values) throws Exception {	//dropdown
				waitForElementVisibility(element);
				Select sc=new Select(element);
				if(options.equalsIgnoreCase("index")) {
					sc.selectByIndex(Integer.parseInt(values));
				}
				else if (options.equalsIgnoreCase("value")) {
					sc.selectByValue(values);
					}
				else if (options.equalsIgnoreCase("text")) {
					sc.selectByVisibleText(values);
					}
				else {
					throw new Exception();
				}
		
			}
	public static void dragdrop(WebElement element,WebElement source ,WebElement target ) {	//dragndrop
		waitForElementVisibility(element);
		Actions ac=new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();

	}	
	public static void rightclick(WebElement target) {	//rightclick
		waitForElementVisibility(target);
	Actions ac=new Actions(driver);
	ac.contextClick(target).build().perform();
	}
		public static void doubleclick(WebElement target) {		//doubleclick
	waitForElementVisibility(target);
	Actions ac=new Actions(driver);
	ac.doubleClick(target).build().perform();
		}
		public static void alert(String options,String type) {
			Alert a=driver.switchTo().alert();
			if (options.equalsIgnoreCase("simplalert")) {
				a.accept();
			}
			else if (options.equalsIgnoreCase("confirmalert")) {
				a.accept();
			}
			else if (options.equalsIgnoreCase("Promptalert")) {
			if (type.contains("yes")) {
				a.accept();
						}	
			} 
				
			

		}
		
		

}


