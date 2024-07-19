package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverManager {

	protected static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(driver==null) {
			// Set ChromeDriver options
	        ChromeOptions chromeOptions = new ChromeOptions();
	        chromeOptions.addArguments("--remote-allow-origins=*");
	        
	        // Set the path for the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roopa.BS\\Desktop\\chromediver\\chromedriver-win64\\chromedriver.exe");

	        
	        // Initialize the WebDriver with ChromeDriver and options
	        WebDriver driver = new ChromeDriver(chromeOptions);
		}
		return driver;
		
	}
	
	 public static void quitDriver() {
		 if(driver!=null) {
			 driver.quit();
			 driver=null;
		 }
	 }
}
