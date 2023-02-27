package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	
    //public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static String url = "https//:syntaxprojects.com/bootstrap-iframe.php";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ericklopez/eclipse-workspace/CucumberJava/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
	}
}
