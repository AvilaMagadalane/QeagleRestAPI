package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features/RestAssure2.feature",
glue = "steps",
monochrome = true,
publish = true)
public class APIRunner extends AbstractTestNGCucumberTests {

}
