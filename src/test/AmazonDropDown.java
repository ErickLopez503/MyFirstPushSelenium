package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {

    public static String url = "http://www.amazon.com";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/eclipse-workspace/CucumberJava/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().fullscreen();
        
        WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(categoriesDD);
        
        List<WebElement> options = select.getOptions();
        for(WebElement option: options) {
        	String optionText = option.getText();
        	System.out.println("Option from Amazon drop down: " + optionText);
        	
        }
        
        select.selectByValue("search-alias=gift-cards");
        //driver.close();

	}
	
}
