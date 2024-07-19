package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends Base {

    public loginPage(WebDriver driver) {
        super(driver);
    }
    
    // Initialize web elements using @FindBy annotation
    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    // Method to enter username
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    // Method to enter password
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    // Method to click on the login button
    public void clickLoginButton() {
        loginButton.click();
    }
}
