package cucumber.basics.example;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		/*features = "C:\\Users\\rishabh\\Desktop\\Selenium Class\\Workspace\\Cucumber Basics\\Cucumber\\CucumberFeature.feature", 
		format = {"pretty", "html:target/cucumber-htmlreport",
"json-pretty:target/cucumber-report.json" }*/
		
		features = "C:\\Users\\rishabh\\Desktop\\Selenium Class\\Workspace\\Cucumber Basics\\Cucumber\\CucumberFeature.feature"
		 ,glue={"stepDefinition"}
		)

public class TestRunner {

}
