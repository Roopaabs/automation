package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.WebDriverManager;

public class Base {

	public WebDriver driver;
	
	public Base(WebDriver driver) {
		//this.driver=WebDriverManager.getDriver();
		this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
		 
	}
}
