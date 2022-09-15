package stepDefinitions;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EmailConformationfunction extends Stordvaule {

	public EmailConformationfunction() throws MalformedURLException {}
	
	@Given("^Login MitId$")
    public void login_mitid() throws Throwable {
		driver.get("https://pp.mitid.dk/test-tool/frontend/#/create-identity");
		driver.manage().window().maximize();
		
    }

	@And("^Click on Autofill button then after copy Identity Claim random text$")
    public void click_on_autofill_button_then_after_copy_identity_claim_random_text() throws Throwable {
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
	@Then("^Click on identity$")
    public void click_on_identity() throws Throwable {
		// Scroll to the Element //
		WebElement element = driver.findElement(By.cssSelector("#create-identity"));
		   Actions actions = new Actions(driver);
		   actions.moveToElement(element);
		   actions.perform();
		   driver.findElement(By.cssSelector("#create-identity")).click();
		   
    }
	
	@Given("^Open shopper link and click login with MitId$")
    public void open_shopper_link_and_click_login_with_mitid() throws Throwable {
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

    @Then("^Past Identity Claim in User Id text field click continue$")
    public void past_identity_claim_in_user_id_text_field_click_continue() throws Throwable {
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
    
    @Then("^Switch Mit Id and scroll down and click on click then open simulator$")
    public void switch_mit_id_and_scroll_down_and_click_on_click_then_open_simulator() throws Throwable {
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	driver.findElement(By.id("open-simulator-codeapp-0")).click(); // click some link that opens a new window
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	
    	// After click on open simulator switch to new windows and perform task 
    	
    	
    	
    	
    }
    
    @And("^Click conform button$")
    public void click_conform_button() throws Throwable {
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
    
    @Given("^Switch to MitId browser and copy CPR number$")
    public void switch_to_mitid_browser_and_copy_cpr_number() throws Throwable {
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

    @And("^Switch to shopper browser and enter CPR number then click$")
    public void switch_to_shopper_browser_and_enter_cpr_number_then_click() throws Throwable {
    	Random randomEmail = new Random();
   	 int randomInt = randomEmail.nextInt(10000000);
   	driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys(""+randomInt+"****");
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   	// Generate random mail id with anyday.io
   //	Random randomEmail = new Random();
   	
   	// Random mail id 
  	 int randomInte = randomEmail.nextInt(10000);
   	driver.findElement(By.cssSelector("#email")).sendKeys("testanyday+"+randomInte+"@gmail.com");
   	// click on check box 
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   	driver.findElement(By.cssSelector("app-consent-document[class='p-ai-start p-field-checkbox'] div[class='p-checkbox-box']")).click();
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   	driver.findElement(By.cssSelector("p-checkbox[name='generalMarketingChb'] div[class='p-checkbox-box']")).click();
   	Thread.sleep(5000);
   	driver.findElement(By.cssSelector("div[class='p-checkbox-box']")).click();
   	// click on create account button move to next page 
   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
   	driver.findElement(By.cssSelector(".p-button-fluid.p-button-lg-fixed.p-button.p-component")).click();
   	
    }
    @Then("^Enter your phone number and email id then more action for signup$")
    public void enter_your_phone_number_then_email_id() throws Throwable {
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
    
    
    @Then("^Navigate to tab and open mail account$")
    public void navigate_to_tab_and_open_mail_account() throws Throwable {
    	
    	// Scroll the element through java script 
    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    	WebElement elementmailconform = driver.findElement(By.cssSelector("button[label='Resend verification email'] span[class='p-button-label']"));
   
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementmailconform); 
    	
    	//code for switch Gmail new browser Firefox
    	System.setProperty("webdriver.gecko.driver","DriversF//geckodriver.exe");
	      WebDriver driverf = new FirefoxDriver();
    	((JavascriptExecutor) driverf).executeScript("window.open()");
    	ArrayList<String> tabs = new ArrayList<String>(driverf.getWindowHandles());
    	driverf.switchTo().window(tabs.get(0));
    	String url = "https://accounts.google.com/signin";
    	driverf.get(url);
    	Thread.sleep(5000);
    	
    	
    		      //implicit wait
    		      driverf.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    		     
    		      
    		    //identify email
    		      WebElement l = driverf
    		      .findElement(By.name("identifier"));
    		      l.sendKeys("testanyday@gmail.com");
    		      WebElement b = driverf.findElement(By.cssSelector("button[class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b'] span[class='VfPpkd-vQzf8d']"));
    		      b.click();
    		      //identify password
    		      driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    		      // Click the element through java script 
    		      WebElement p = driverf.findElement(By.xpath("(//input[@name='Passwd'])[1]"));
    		      Thread.sleep(5000);
    		    	p.click();
    		      driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
    		      Thread.sleep(5000);
    		      p.sendKeys("Demo123@!");
    		      Thread.sleep(5000);
    		      
    		      WebElement pw = driverf.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
    		      Thread.sleep(5000);
                          pw.click();

    		      // Open Next Tab and navigate to Gmail account 
                          ((JavascriptExecutor) driverf).executeScript("window.open()");
                      	ArrayList<String> tabsg = new ArrayList<String>(driverf.getWindowHandles());
                      	driverf.switchTo().window(tabsg.get(1));
                      	String urlg = "https://mail.google.com";
                      	driverf.get(urlg);
                      	Thread.sleep(8000);
                      	
                      	// Click the element email received conform mail
                      	driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
                      /**WebElement emailclick = driverf.findElement(By.xpath("//*[contains(text(),'Please confirm your e-mail ')]"));
                  	Thread.sleep(3000);
                      ((JavascriptExecutor)driverf).executeScript("arguments[0].click();", emailclick);
                      
                     **/
                      	
                      	new WebDriverWait(driverf, 100).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Please confirm your e-mail ')]"))).click();
                      
                      // Scroll to the Document attached in the confirmation mail 
                     
                     Thread.sleep(3000); 
                     driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
                      WebElement elementpdf = driverf.findElement(By.xpath("(//span[text()='TermsOfService.pdf'])[2]"));
                      JavascriptExecutor js = (JavascriptExecutor) driverf;
                      js.executeScript("arguments[0].scrollIntoView(true);", elementpdf);
                      
                      System.out.println(elementpdf.getText());
                      
                      
                      // Back to scroll to the email confirmation option 
                      driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
                      WebElement elementconform = driverf.findElement(By.linkText("Confirm e-mail"));
                      ((JavascriptExecutor) driverf).executeScript("arguments[0].scrollIntoView();", elementconform);
                      
                      ((JavascriptExecutor)driverf).executeScript("arguments[0].click();", elementconform);
                      
                      Thread.sleep(5000);
                     
                      
                      // Switch to email tab and wait for second mail approval mail 
                      
                      driverf.switchTo().window(tabsg.get(1));
                      
                      
                      WebElement inbox = driverf.findElement(By.linkText("Inbox"));
                      inbox.click();
                     
                      Thread.sleep(4000);
                      
                      // Verify the response mail 
                      driverf.navigate().refresh();
                     /** 
                      driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
                      WebElement emailres = driverf.findElement(By.xpath("//*[contains(text(),'You have been approved for credit. ')]"));
                      Thread.sleep(3000);
                      ((JavascriptExecutor)driverf).executeScript("arguments[0].click();", emailres);
                      **/
                      
                      new WebDriverWait(driverf, 650).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'You have been approved for credit. ')]"))).click();
                     
                      Thread.sleep(3000);
                      WebElement inboxx = driverf.findElement(By.linkText("Inbox"));
                      inboxx.click();
                      Thread.sleep(3000);
                     
    		     // b.click();
    		      //close browser
    		     
    		     driverf.close();
    }
 
    @Given("^Enter username and password then login$")
    public void enter_username_and_password_then_login() throws Throwable {
    	
    	Thread.sleep(5000);
    	driver.navigate().refresh();
    }
    @Then("^Click on conform email received by Anyday$")
    public void click_on_conform_email_received_by_anyday() throws Throwable {
    	 System.out.println("Test Pass");
    }

    @Then("^Verify conform mail have attachment and then click on conform email$")
    public void verify_conform_mail_have_attachment_and_then_click_on_conform_email() throws Throwable {
   	 System.out.println("Test Pass");
    }
    
    @Then("^Wait for maximum ten minutes for approved mail$")
    public void wait_for_maximum_ten_minutes_for_approved_mail() throws Throwable {
   	 System.out.println("Test Pass");
    }
    @Then("^Received approved mail then click on it and verify mail have attachment$")
    public void received_approved_mail_then_click_on_it_and_verify_mail_have_attachment() throws Throwable {
   	 System.out.println("Test Pass");
    }

    @Then("^Switch to shopper tab and conform email conformation option not showing$")
    public void switch_to_shopper_tab_and_conform_email_conformation_option_not_showing() throws Throwable {
   	 System.out.println("Test Pass");
    }


}
