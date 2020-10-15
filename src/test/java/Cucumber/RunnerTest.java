package Cucumber;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
	plugin = { "pretty", "json:target/Cucumber-reports/Cucumber.json",
		"junit:target/Cucumber-reports/Cuucmber.xml",
		"html:target/Cuucmber-reports" }, 
	monochrome = true, 
	glue = { "Cucumber.steps" }, 
	tags = ("@login") , 
	features = { "src/test/resources/Cucumber/features" })
public class RunnerTest {
	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass
	public void setUp() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "scenariosProvider")
	public void executeScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
		testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
	}

	@DataProvider
	public Object[][] scenariosProvider() {
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass
	public void tearDown() {
		testNGCucumberRunner.finish();
	}

}
