package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksImplementation extends BaseClass{
	@Before
	public void preCondition() {
		opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://qeagle-d-dev-ed.develop.my.salesforce.com/");
		
	}
	@After
	public void postCondition() {
		driver.close();
		
	}

}
