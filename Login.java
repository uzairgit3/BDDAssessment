package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Basepage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passwordField;

    @FindBy(id = "send2")
    private WebElement loginButton;

    public Login(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void loginUser(String email, String password) {
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
        click(loginButton);
    }
}
