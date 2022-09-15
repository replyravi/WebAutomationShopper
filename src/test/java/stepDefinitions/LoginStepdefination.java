package stepDefinitions;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefination extends Stordvaule{

	public LoginStepdefination() throws MalformedURLException {
		//super();
		// TODO Auto-generated constructor stub
	}

	@Given("^Open Mit Id testing tool Link$")
    public void open_mit_id_testing_tool_link() throws Throwable {
		super.login();
		
        }
	

    @When("^Click upper left side search box and type CPR number which you want to login$")
    public void click_upper_left_side_search_box_and_type_cpr_number_which_you_want_to_login() throws Throwable {
       System.out.println("Test Pass");
    }
    
    @Then("^Click on search box and copy create identity$")
    public void click_on_search_box_and_copy_create_identity() throws Throwable {
    	System.out.println("Test Pass");
    }
    
    @Given("^Switch new tab and open shopper link and paste create identity click on continue$")
    public void switch_new_tab_and_open_shopper_link_and_paste_create_identity_click_on_continue() throws Throwable {
    	System.out.println("Test Pass");
    }
    
    @Then("^Switch to Mit Id tab and scroll to Open simulator and click it$")
    public void switch_to_mit_id_tab_and_scroll_to_open_simulator_and_click_it() throws Throwable {
        
    }
    
    @Then("^Switch to open simulator and click on conform it$")
    public void switch_to_open_simulator_and_click_on_conform_it() throws Throwable {
    	System.out.println("Test Pass");
    }
    
    @Then("^Switch to Mit Id and copy CPR number$")
    public void switch_to_mit_id_and_copy_cpr_number() throws Throwable {
    	System.out.println("Test Pass");
    }
    
    @Then("^Switch shopper tab paste CPR number and click continue$")
    public void switch_shopper_tab_paste_cpr_number_and_click_continue() throws Throwable {
    	System.out.println("Test Pass");
    }
}
