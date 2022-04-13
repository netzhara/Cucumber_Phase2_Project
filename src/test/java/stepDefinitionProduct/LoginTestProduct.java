package stepDefinitionProduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginTestProduct {
	
	WebDriver driver = Base.driver;
	
	@Given("user launch the website")
	public void user_launch_the_website() {
	    
		driver.get("https://www.saucedemo.com/");
	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String usrnm, String pswd) {
	    
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys(usrnm);
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pswd);
	}
	
	@Then("user clicks on login")
	public void user_clicks_on_login() {
	    
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
	}

	@When("user on products page")
	public void user_on_products_page() {
		
		String title = "PRODUCTS";
		WebElement product = driver.findElement(By.xpath("//span[@class='title']"));
		String actualTitle = product.getText();
		Assert.assertEquals(title, actualTitle);
		
		System.out.println("===============SWAGLABS==============");
	    
	}

	@Then("user start compare the products price")
	public void user_start_compare_the_products_price(io.cucumber.datatable.DataTable dataTable) {
	    
		int row = dataTable.height();
		
		for(int index=0; index<row; index++) {
			
			String product = dataTable.cell(index, 0);
			String price = dataTable.cell(index, 1);
			String actualprice = driver.findElement(By.xpath("//div[text()='"+product+"']/following::div[@class='inventory_item_price']")).getText();
			Assert.assertEquals(price, actualprice);
	  }
	}

}
