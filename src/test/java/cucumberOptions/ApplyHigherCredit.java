package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Applyforhigher.feature",
		glue="stepDefinitions", tags= "@Highercredit",
        plugin= {"pretty", "html:target/Highercredit.html", "json:target/Highercredit.json", "junit:target/Highercredit.xml"})
public class ApplyHigherCredit {

}
