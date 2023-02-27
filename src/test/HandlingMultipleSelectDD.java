package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleSelectDD {
	
	public static String url = "http://syntaxprojects.com/basic-select-dropdown-demo.php";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/eclipse-workspace/CucumberJava/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().fullscreen();
        
        WebElement statesDD = driver.findElement(By.id("multi-select"));
        Select select = new Select(statesDD);
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);
        
        if(isMultiple) {
        List<WebElement> options = select.getOptions();
        for(WebElement option: options) {
        	String optionText = option.getText();
        	select.selectByVisibleText(optionText);
        }
        
        select.deselectByIndex(4);
        select.deselectAll();
        
        }
        
	}

}
