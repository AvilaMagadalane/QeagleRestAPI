package steps;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EditWTG extends BaseClass{

	@Given("Search as {string}")
	public void search(String string) throws InterruptedException {
		WebElement search = driver.findElement(By.xpath("//div[@type='search']"));
		search.click();
		search.sendKeys(string);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

	@Given("Click on dropdown")
	public void click_on_dropdown() {
		driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[1]")).click();
	}

	@Given("Select Edit")
	public void select_edit() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
	}
	@Given("Enter Descriptions as {string}")
	public void enter_descriptions_as(String string) {

		WebElement description = driver.findElement(By.xpath("//textarea[@class='slds-textarea']"));
		description.clear();
		description.sendKeys(string);

	}
	@Given("Enter GroupType as Capacity")
	public void enter_GroupType_as() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='slds-combobox_container']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@title='Capacity']")).click();
		driver.findElement(By.xpath("//span[text()='Capacity']")).click();
	}
	@Given("Click on Save")
	public void click_on_save() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	@Then("Click on {string}")
	public void click_on(String string) throws InterruptedException {

		Thread.sleep(2000);
		//click on user name link
		driver.findElement(By.xpath("(//a[@data-refid='recordId'])[1]")).click();

		//get string from Description field
		String desciption = driver.findElement(By.xpath("(//slot[@name='outputField']/lightning-formatted-text)[2]")).getText();
		String actual = "Automation";
		assertTrue(desciption.contentEquals(actual));
		System.out.println("Updated Description: "+desciption);

	}

}
