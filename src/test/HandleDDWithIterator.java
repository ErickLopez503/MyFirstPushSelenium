package test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDDWithIterator {

	public static String url = "http://www.amazon.com";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/eclipse-workspace/CucumberJava/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();

		WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
		Select select = new Select(categoriesDD);
		
		List<WebElement> options = select.getOptions();
		Iterator<WebElement> it = options.iterator();
		while(it.hasNext()) {
			WebElement ddOption = it.next();
			String optionText = ddOption.getText();
			System.out.println("Option is: " + optionText);
			
			
		}

	}
}
