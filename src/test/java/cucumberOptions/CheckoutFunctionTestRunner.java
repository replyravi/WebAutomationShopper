package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// feature file 
// Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/CheckoutFunction.feature",
		glue="stepDefinitions", tags= "@Checkout",
        plugin= {"pretty", "html:target/CheckoutFunction.html", "json:target/CheckoutFunction.json", "junit:target/CheckoutFunction.xml"})
public class CheckoutFunctionTestRunner {

}