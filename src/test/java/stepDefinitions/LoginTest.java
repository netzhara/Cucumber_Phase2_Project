package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginTest {
	
	WebDriver driver = BaseDriver.driver;
	
	@Given("user launch the Swag Labs website")
	public void user_launch_the_swag_labs_website() {
	    
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enters username {string}")
	public void user_enters_username(String usrnm) {
	    
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(usrnm);
	}

	@Then("user enters password {string}")
	public void user_enters_password(String pwd) {
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys(pwd);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
		
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}

	@Then("user should be landed on the products page")
	public void user_should_be_landed_on_the_products_page() {
	    
		System.out.println("================SWAGLABS===============");
	}

	@Then("user should see {string}")
	public void user_should_see(String expMsg) {
		
		WebElement error = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error"));
		
		String actualMsg = error.getText();
		
		Assert.assertEquals(expMsg,actualMsg);
	    
	}

}
