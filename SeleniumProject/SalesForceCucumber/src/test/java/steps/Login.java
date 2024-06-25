package steps;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class Login extends BaseClass{
	
	@Given("Login to salesforce")
	public void Login_to_salesforce() {
		driver.findElement(By.id("username")).sendKeys("avilamagadalane.v@sales.com");
		driver.findElement(By.id("password")).sendKeys("AvilaSalesForce@10");
		driver.findElement(By.id("Login")).click();
	}

}
