package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class first {

	public static void main(String[] args){
		
		
		//String projectLocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/eclipse-workspace/CucumberJava/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://example.testproject.io/web/");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your full name']")).sendKeys("Firu");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//button[@onclick='performLogin()']")).click();
		
		Select dropDown = new Select(driver.findElement(By.id("country")));
		
		dropDown.selectByIndex(40);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your address']")).sendKeys("2av sur Barrio el tunco jujutla");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@yahho.com");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("234-566-3409");
		
		driver.findElement(By.xpath("//button[@onclick='performSave()']")).click();
		
		driver.findElement(By.id("logout")).click();
		
		driver.quit();
	}
}
