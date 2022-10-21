package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/ShopperSignupHigherCredit.feature",
		glue="stepDefinitions", tags= "@SignupHigher",
        plugin= {"pretty", "html:target/SignupHigher.html", "json:target/SignupHigher.json", "junit:target/SignupHigher.xml"})
public class TestRunnerSignupHigher {

}
