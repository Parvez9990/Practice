package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",plugin={"pretty","html:target/TestReport1.html"},glue=("StepDefination"),tags="@Test")
public class TestRunner {
	
	
	//plugin-------Report
	//dryRun=true---Mapping between feature steps and step Defination
	//monochrometrue---Console out---More readable format

}
