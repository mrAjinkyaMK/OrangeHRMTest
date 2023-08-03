package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"AllFeature"},
		glue = {"StepDefinition"},
		dryRun = false
		
		)
public class EndToEndTest extends AbstractTestNGCucumberTests{

}
