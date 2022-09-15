package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Login.feature",
		glue="stepDefinitions", tags= "@Loginmitid",
        plugin= {"pretty", "html:target/Loginmitid.html", "json:target/Loginmitid.json", "junit:target/Loginmitid.xml"})
public class LoginTestRunner {

}