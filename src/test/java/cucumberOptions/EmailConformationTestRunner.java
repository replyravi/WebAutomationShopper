package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//feature file 
//Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/EmailConformation.feature",
		glue="stepDefinitions", tags= "@emailconform",
     plugin= {"pretty", "html:target/emailconform.html", "json:target/emailconform.json", "junit:target/emailconform.xml"})
public class EmailConformationTestRunner {

}