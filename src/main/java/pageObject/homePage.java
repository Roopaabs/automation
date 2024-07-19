package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.junit.*;


public class homePage extends Base {
	WebDriver wait;

	public homePage(WebDriver driver) {
		super(driver);
	}
	
	//intialize the locators
	
	@FindBy(className = "title")
    private WebElement title;

	//method action
    public void verifyHomePageTitle() {
    	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	   	 wait.until(ExpectedConditions.titleContains("Swag Labs"));
    	        String expectedTitle = "Swag Labs";
    	        String actualTitle = driver.getTitle();
    	        System.out.println(actualTitle);        //Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
    	   
    }
	
	
}
