package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//feature file 
//Step defination file location 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/merchantsAddUser.feature",
		glue="stepDefinitions", tags= "@merchantsadduserowner or @merchantsadduserfinance or @merchantsadduseroperator",
   plugin= {"pretty", "html:target/merchantsadduserowner.html", "json:target/merchantsadduserowner.json", "junit:target/merchantsadduserowner.xml"})
public class MerchantsAddUserTestRunner {
	
}
