package stepdefnition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class step {


    private WebDriver driver;

	    @Given("Users navigate to the account creation page")
	    public void usersNavigateToAccountCreationPage() {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	    }

	    @When("User fill the registration form with valid details")
	    public void userFillTheRegistrationFormWithValidDetails() {
	        driver.findElement(By.id("firstname")).sendKeys("Test");
	        driver.findElement(By.id("lastname")).sendKeys("User");
	        driver.findElement(By.id("email_address")).sendKeys("testuser@example.com");
	        driver.findElement(By.id("password")).sendKeys("SecurePassword123");
	        driver.findElement(By.id("password-confirmation")).sendKeys("SecurePassword123");
	    }

	    @When("User submit the form")
	    public void userSubmitTheForm() {
	        driver.findElement(By.cssSelector("button[title='Create an Account']")).click();
	    }

	    @Then("User should see the confirmation message")
	    public void userShouldSeeTheConfirmationMessage() {
	        WebElement confirmationMessage = driver.findElement(By.cssSelector(".message-success.success.message"));
	        assertTrue(confirmationMessage.getText().contains("Thank you for registering"));
	    }

	    @When("User log in with the newly created account")
	    public void userLogInWithTheNewlyCreatedAccount() {
	        driver.get("https://magento.softwaretestingboard.com/customer/account/login/"); // Updated URL for login
	        driver.findElement(By.id("email")).sendKeys("testuser@example.com");
	        driver.findElement(By.id("pass")).sendKeys("SecurePassword123");
	        driver.findElement(By.id("send2")).click();
	    }

	    @Then("User should see the account dashboard")
	    public void userShouldSeeTheAccountDashboard() {
	        WebElement dashboardHeading = driver.findElement(By.cssSelector(".block-dashboard-info .hello span"));
	        assertTrue(dashboardHeading.getText().contains("Hello, Test User"));
	    }

	   
	    
	}
}