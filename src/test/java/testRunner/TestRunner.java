package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions (features={"src/resource/java/features"},
					glue= {"stepDefinitions"},
					dryRun=false)
public class TestRunner extends AbstractTestNGCucumberTests {

	
	@DataProvider
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
