package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class FirstSeleniumClass {

	public static String browser;
	static WebDriver driver; 
	
	public static void main(String[] args) {

		//setBrowser();
		PropertiesFile.readPropertiesFiles();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
		

	}
	
//	public static void setBrowser() {
//		
//		browser = "chrome";
//	}
	
	public static void setBrowserConfig() {
		
		if(browser.contains("chrome")) {
		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/eclipse-workspace/CucumberJava/chromedriver");
	    driver = new ChromeDriver();
		}
		
		
	}
	
	public static void runTest() {
		
		driver.get("http://seleniumhq.org/");
		driver.quit();
	}
}
