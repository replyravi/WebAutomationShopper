package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/ShopperSignup.feature",
		glue="stepDefinitions", tags= "@Signup",
        plugin= {"pretty", "html:target/Signup.html", "json:target/Signup.json", "junit:target/Signup.xml"})
public class TestRunner {

}
