package stepDefinitions;



import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.messages.types.Duration;





//@RunWith(Cucumber.class)
public class Stepdefination extends Stordvaule{
	//public WebDriver driver =capabilities();
	
	public Stepdefination() throws MalformedURLException {}
	
	@Given("^Login Mit Id anyday$")
    public void login_mit_id_anyday() throws Throwable {
		driver.get("https://pp.mitid.dk/test-tool/frontend/#/create-identity");
		driver.manage().window().maximize();
		
    }
	@And("^Click on Autofill button and after copy Identity Claim random text$")
    public void click_on_autofill_button_and_after_copy_identity_claim_random_text() throws Throwable {
        driver.findElement(By.cssSelector("#auto-fill")).click();
        Thread.sleep(5000);
        
       
        /*String identity= driver.findElement(By.cssSelector("input[placeholder='Enter Identity Claim']")).getAttribute("value");
        System.out.println(identity);*/
        
   System.out.println("Ravi");
   //super.storevalue();
   //String text=super.storevalue();
   //String textvalue=super.storevalue();
   String textvalue=storevalue().toString();
   System.out.println(textvalue);
   
// Scroll to the Element //
   WebElement element = driver.findElement(By.cssSelector("input[placeholder='Enter CPR Number']"));
   Actions actions = new Actions(driver);
   actions.moveToElement(element);
   actions.perform();
   
   String cprtext=super.cprtext();
   System.out.println(cprtext);
   
   // Normal Code start 
  /*String cpr = driver.findElement(By.cssSelector("input[placeholder='Enter CPR Number']")).getAttribute("value");
   System.out.println(cpr);
   */
	}
	@Then("^Click on create identity$")
    public void click_on_create_identity() throws Throwable {
		// Scroll to the Element //
		WebElement element = driver.findElement(By.cssSelector("#create-identity"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element);
		   actions.perform();
		   driver.findElement(By.cssSelector("#create-identity")).click();
		   
    }

    @Given("^Open shopper link and click login with Mit Id$")
    public void open_shopper_link_and_click_login_with_mit_id() throws Throwable {
    	//code for switch between windows 
    	((JavascriptExecutor) driver).executeScript("window.open()");
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
    	driver.get("https://anyday-acceptance.yadyna.xyz/");
    	Thread.sleep(5000);
    
    	driver.findElement(By.xpath("//span[normalize-space()='Log on with MitID']")).click();
    	Thread.sleep(7000);
    	
    	// back to the Identity value page (main page)
    	driver.switchTo().window(tabs.get(0));
    	WebElement Uid=driver.findElement(By.cssSelector("div[class='mitid--col test-tool-view-identity-values'] li:nth-child(1)"));
    	String Uidtext =Uid.getText();
    	System.out.println(Uidtext);
    	
    	// Write code for split string and save in string variable 
    	
    	String[] arrSplit = Uidtext.split(": ");
    	System.out.println(arrSplit[0]);
    	System.out.println(arrSplit[1]);
    	String Uidtextmain=arrSplit[1];
    	Thread.sleep(5000);
    	
    	driver.switchTo().window(tabs.get(1));
    	driver.findElement(By.xpath("//div[@defaultlanguage='DAﾠ/ﾠDK']//input[1]")).getText();
    	Thread.sleep(7000);
    	WebElement Userid=driver.findElement(By.xpath("//div[@defaultlanguage='DAﾠ/ﾠDK']//input[1]"));
    	Userid.sendKeys(Uidtextmain);
    	Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@showicontext='IconﾠHelpﾠText']")).click();
        
      //button[@showicontext='IconﾠHelpﾠText']
    	// back to main
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	
        System.out.println("Ravi");
    	
    }

    @Then("^Past Identity Claim in User Id text field and click on continue$")
    public void past_identity_claim_in_user_id_text_field_and_click_on_continue() throws Throwable {
    	System.out.println("Ravi");
    	//code for switch between windows 
    	((JavascriptExecutor) driver).executeScript("window.open()");
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(0));
    	
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	
    	// back to the Identity value page (main page)
    	WebElement element = driver.findElement(By.xpath("(//a[normalize-space()='Open simulator'])[1]"));
    	/* Actions actions = new Actions(driver);
    	   actions.moveToElement(element);
    	   actions.perform();*/
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);   
    	System.out.println("Ravi"); 
    }
    
    @Then("^Switch Mit Id and scroll down and click on click on open simulator$")
    public void switch_mit_id_and_scroll_down_and_click_on_click_on_open_simulator() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	driver.findElement(By.id("open-simulator-codeapp-0")).click(); // click some link that opens a new window
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	
    	// After click on open simulator switch to new windows and perform task 
    	
    	
    	
    	
    }
    
    @And("^Click conform$")
    public void click_conform() throws Throwable {
       // Code for switch to child windows and perform some task 
    	
    	//Get handles of the windows
    	String parentWindow= driver.getWindowHandle();
    	Set<String> allWindows = driver.getWindowHandles();
    	for(String curWindow : allWindows){
    	    driver.switchTo().window(curWindow);
    	}
    	   driver.manage().window().maximize();
	          Thread.sleep(7000);
	          driver.findElement(By.xpath("//button[@id='simulator-app-confirm-request']")).click();
	          System.out.println("Ravi"); // Check code run in this part or not 
	          Thread.sleep(7000);
	          driver.close();
	          driver.switchTo().window(parentWindow);      
    	
    }
    
    @Given("^Switch to Mit Id browser and copy CPR number$")
    public void switch_to_mit_id_browser_and_copy_cpr_number() throws Throwable {
        // Switch to create-identity windows and copy cpr and past on hopper page 
    	
    	
    	((JavascriptExecutor) driver).executeScript("window.open()");
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	//driver.switchTo().window(tabs.get(1));
    	// Scroll to CPR text which you have to copy
    	
    	WebElement element = driver.findElement(By.cssSelector("li[class='test-tool-view-identity-item no-list'] b"));
    	/* Actions actions = new Actions(driver);
    	   actions.moveToElement(element);
    	   actions.perform();*/
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);  
    	// Find the cpr text and split it and copy only cpr value 
    	WebElement Uid=driver.findElement(By.xpath("//body[@id='body']/mitid-frontends-root[1]/div[1]/test-tool-view-identity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]"));
    	String Uidtext =Uid.getText();
    	System.out.println(Uidtext);
    	
    	// Write code for split string and save in string variable 
    	
    	String[] arrSplit = Uidtext.split(": ");
    	System.out.println(arrSplit[0]);
    	System.out.println(arrSplit[1]);
    	String Uidtextmain=arrSplit[1];
    	Thread.sleep(5000);
    	
    	driver.switchTo().window(tabs.get(1));
    	driver.findElement(By.cssSelector("#dkmitid_cprentry_input")).getText();
    	Thread.sleep(7000);
    	WebElement Userid=driver.findElement(By.cssSelector("#dkmitid_cprentry_input"));
    	Userid.sendKeys(Uidtextmain);
    	Thread.sleep(5000);
        driver.findElement(By.cssSelector("#dkmitid_cprentry_submit")).click();
        
    }

    @And("^Switch to shopper browser and enter CPR number and click$")
    public void switch_to_shopper_browser_and_enter_cpr_number_and_click() throws Throwable {
    	Random randomEmail = new Random();
   	 int randomInt = randomEmail.nextInt(10000);
   	Thread.sleep(1000);
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   	driver.findElement(By.xpath("//input[@placeholder='81 81 61 81']")).sendKeys(""+randomInt+"****");
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   	// Generate random mail id with anyday.io
   //	Random randomEmail = new Random();
  	 int randomInte = randomEmail.nextInt(10000);
   	driver.findElement(By.cssSelector("#email")).sendKeys("ravi+"+randomInte+"@anyday.io");
   	// click on check box 
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   	driver.findElement(By.cssSelector("app-consent-document[class='align-items-start field-checkbox'] div[class='p-checkbox-box']")).click();
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   	driver.findElement(By.cssSelector("p-checkbox[name='generalMarketingChb'] div[class='p-checkbox-box']")).click();
   	Thread.sleep(5000);
   	driver.findElement(By.cssSelector("p-checkbox[name='personalizedMarketingChb'] div[class='p-checkbox-box']")).click();
   	// click on create account button move to next page 
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   	driver.findElement(By.cssSelector("button[class='p-element p-button-fluid p-button-lg-fixed p-button p-component'] span[class='p-button-label']")).click();
   	
    }
    @Then("^Enter your phone number and email id and more action for signup$")
    public void enter_your_phone_number_and_email_id() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("0");
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("0");
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("0");
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("(//input[@type='tel'])[4]")).sendKeys("0");
    	Thread.sleep(7000);
    	
    	// enter name and copy cpr again from testing tool page 
    	
    	driver.findElement(By.cssSelector(".flow-header")).getText();
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	driver.findElement(By.cssSelector("input[name='name']")).sendKeys("John Doe");
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	// switch to tab on testing tool and copy cpr and again switch to main shopper tab and past cpr 
    	
    	((JavascriptExecutor) driver).executeScript("window.open()");
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(0));
    	
    	WebElement element = driver.findElement(By.cssSelector("li[class='test-tool-view-identity-item no-list'] b"));
    	/* Actions actions = new Actions(driver);
    	   actions.moveToElement(element);
    	   actions.perform();*/
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);  
    	// Find the cpr text and split it and copy only cpr value 
    	WebElement Uid=driver.findElement(By.xpath("//body[@id='body']/mitid-frontends-root[1]/div[1]/test-tool-view-identity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]"));
    	String Uidtext =Uid.getText();
    	System.out.println(Uidtext);
    	
    	// Write code for split string and save in string variable 
    	
    	String[] arrSplit = Uidtext.split(": ");
    	System.out.println(arrSplit[0]);
    	System.out.println(arrSplit[1]);
    	String Uidtextmain=arrSplit[1];
    	Thread.sleep(5000);
    	
    	driver.switchTo().window(tabs.get(1));
    	driver.findElement(By.cssSelector("input[placeholder='XXXXXXXXXX']")).getText();
    	Thread.sleep(7000);
    	WebElement Userid=driver.findElement(By.cssSelector("input[placeholder='XXXXXXXXXX']"));
    	Userid.sendKeys(Uidtextmain);
    	Thread.sleep(5000);
    	driver.findElement(By.cssSelector(".p-checkbox-box")).click();
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	driver.findElement(By.cssSelector(".p-button-label")).click();
    	Thread.sleep(5000);
    	//Signup done and click on my account to see shopper panel 
    	driver.findElement(By.xpath("//a[normalize-space()='Go to my account']")).click();
    	
    }
}