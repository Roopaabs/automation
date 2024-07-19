package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.*;
import org.junit.Assert;

public class homePage extends Base {

	public homePage(WebDriver driver) {
		super(driver);
	}
	
	//intialize the locators
	
	@FindBy(className = "title")
    private WebElement title;

	//method action
    public void verifyHomePageTitle() {
        String expected = "Products";
        String products = title.getText();
        Assert.assertEquals(products, expected);
    }
	
	
}
