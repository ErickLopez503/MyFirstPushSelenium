package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static String url = "http://syntaxprojects.com/basic-select-dropdown-demo.php";

	public static void main(String[] args) throws InterruptedException {
		


		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/eclipse-workspace/CucumberJava/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get(url);
	        driver.manage().window().fullscreen();

	        WebElement daysDD = driver.findElement(By.id("select-demo"));
	        Select select = new Select(daysDD);
	        select.selectByIndex(4);
	        
	        Thread.sleep(3000);
	        select.selectByVisibleText("Monday");
	        
	        Thread.sleep(3000);
	        select.selectByValue("Sunday");
	        
	        List<WebElement> allOtions = select.getOptions();
	        int size = allOtions.size();
	        System.out.println(size);
	        
	        for(int i=1; i < size; i++) {
	        	String options = allOtions.get(i).getText();
	        	System.out.println("Day of the week: " + options);
	        	select.selectByIndex(i);
	        	Thread.sleep(1000);
	        }
	        
	        driver.close();
	    
	}
}
