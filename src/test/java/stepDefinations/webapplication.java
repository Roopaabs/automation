package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.homePage;
import pageObject.loginPage;


public class webapplication{
    loginPage loginPage;
    homePage homePage;
    
    private static WebDriver driver;

    @Before
    public void setup() {
        // Set ChromeDriver options
    	
        ChromeOptions chromeOptions = new ChromeOptions();
// chromeOptions.addArguments("--remote-allow-origins=*");
 chromeOptions.addArguments("--headless");
 
 // Set the path for the ChromeDriver executable
 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roopa.BS\\Desktop\\chromediver\\chromedriver-win64\\chromedriver.exe");

 // Initialize the WebDriver with ChromeDriver and options
 WebDriverManager.chromedriver().setup();

 // Create a new instance of the ChromeDriver
 //WebDriver driver = new ChromeDriver();
 driver = new ChromeDriver(chromeOptions);
        loginPage = new loginPage(driver);
        homePage = new homePage(driver);
    }

    @Given("user is already on Login Page")
    public void user_is_already_on_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("user enters valid username and password")
    public void user_enters_un_pw() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user is on home page")
    public void user_is_on_home_page() {
        homePage.verifyHomePageTitle();
    }

    @Then("user quit")
    public void user_quit() {
       driver.quit();
    }
}
