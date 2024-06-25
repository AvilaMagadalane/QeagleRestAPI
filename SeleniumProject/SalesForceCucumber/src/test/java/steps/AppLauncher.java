package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseClass;
import io.cucumber.java.en.Given;

public class AppLauncher extends BaseClass{
	
	@Given("Click on AppLauncher")
	public void click_on_app_launcher() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@Given("Click View All")
	public void click_view_all() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		Thread.sleep(2000);
	}

	@Given("Click Work Type Groups")
	public void click_work_type_groups() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Work Type Groups')]"));
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("arguments[0].click();", element);
		Thread.sleep(2000); 
	}
	

}
