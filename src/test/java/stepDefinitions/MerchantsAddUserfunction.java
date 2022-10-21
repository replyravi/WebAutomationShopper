package stepDefinitions;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MerchantsAddUserfunction extends Stordvaule {

	public MerchantsAddUserfunction() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}

	  @Given("^Navigate to merchant URL$")
	    public void navigate_to_merchant_url() throws Throwable {
	
				driver.get("https://anyday-acceptance.yadyna.xyz/en/merchant");
				driver.manage().window().maximize();
	    }
		  
	  @And("^Enter username and password and click sign in$")
	    public void enter_username_and_password_and_click_sign_in() throws Throwable {
		 
		  // Code for Enter user name and password and click login
		  
		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  driver.findElement(By.cssSelector("#Username")).sendKeys("connor.olson@merchant.manaotest.com");
		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  driver.findElement(By.cssSelector("#Password")).sendKeys("Manao100%");
		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  driver.findElement(By.cssSelector("button[type='submit']")).click();
		  
		  Thread.sleep(3000);
		  
	    }
	  
	  @Then("^Click User section$")
	    public void click_user_section() throws Throwable {
		  // click on user section
		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  driver.findElement(By.cssSelector("a[title='Users'] span[class='menu-name']")).getText();
		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  driver.findElement(By.cssSelector("a[title='Users'] span[class='menu-name']")).click();
		  Thread.sleep(2000);
	    }
	  
	  @And("^Click on create new user$")
	    public void click_on_create_new_user() throws Throwable {
		  // click on create new user option
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  driver.findElement(By.cssSelector("button[type='button'] span[class='p-button-label']")).click();
		  Thread.sleep(2000);
	    }
	  
	  @Then("^Enter email and name$")
	    public void enter_email_and_name() throws Throwable {
	        // Fill all the text box information with random number
		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		  Random randomEmail = new Random();
		  int randomInte = randomEmail.nextInt(10000);
		   	driver.findElement(By.cssSelector("#email")).sendKeys("testanyday+"+randomInte+"@gmail.com");
		   	 
		   	
		   	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    int randomIntename = randomEmail.nextInt(10000);
		    driver.findElement(By.cssSelector("#userName")).sendKeys("AnyDay"+randomIntename+"Test Demo");
		    
		    driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		    int randomInt = randomEmail.nextInt(1000000);
		   	driver.findElement(By.cssSelector("#phone-number")).sendKeys(""+randomInt+"****");
	    }
	  
	  @Then("^Enter phone number and select type owner$")
	    public void enter_phone_number_and_select_type_owner() throws Throwable {
		  
		 // Click role by Owners
		  driver.findElement(By.cssSelector("div[role='button']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.cssSelector("li[aria-label='Owner'] span[class='ng-star-inserted']")).click();
		  Thread.sleep(1000);
		  System.out.println("Test pass owner");
	    }
	  @Then("^Enter phone number and select type finance$")
	    public void enter_phone_number_and_select_type_finance() throws Throwable {
		  // Click role by finance
		  driver.findElement(By.cssSelector("div[role='button']")).click();
		  Thread.sleep(2000); 
		  driver.findElement(By.cssSelector("li[aria-label='Finance'] span[class='ng-star-inserted']")).click();
		  Thread.sleep(1000);
		  System.out.println("Test pass");
	    }
	  @Then("^Enter phone number and select type operator$")
	    public void enter_phone_number_and_select_type_operator() throws Throwable {
		// Click role by operators
		  driver.findElement(By.cssSelector("div[role='button']")).click();
		  Thread.sleep(2000); 
		  driver.findElement(By.cssSelector("li[aria-label='Operator'] span[class='ng-star-inserted']")).click();
		  Thread.sleep(1000);
		  System.out.println("Test pass operator");
	    }

	    @And("^Click on save$")
	    public void click_on_save() throws Throwable {
	    	
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	driver.findElement(By.cssSelector("button[type='submit']")).click();
	    }
	    
	    @Then("^Navigate to open gmail and click on confirm email$")
	    public void navigate_to_open_gmail_and_click_on_confirm_email() throws Throwable {
	       // Navigate to Firefox and open gmail, Enter user name and password click on confirm email confirmation
	    
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
	                      	Thread.sleep(3000);

	                     // Click the element email received conform mail
	                      	driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	                     
	                      	// Wait till the webelement is clickable
	                    	new WebDriverWait(driverf, 400).until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(text(),'Welcome to Anyday')])[2]"))).click();
	    
	                    	// Back to scroll to the email confirmation option 
	                        driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	                        String hyperlink = driverf.findElement(By.linkText("Verify e-mail address")).getAttribute("href");
	                        Thread.sleep(1000);
	                        //String hyperlink =elementconform.getAttribute("href");
	                        driverf.quit();
	                        Thread.sleep(1000);
	                    
	                        ((JavascriptExecutor) driver).executeScript("window.open()");
	                    	ArrayList<String> tabschrome = new ArrayList<String>(driver.getWindowHandles());
	                    	driver.switchTo().window(tabschrome.get(1));
	                    	driver.get(hyperlink);
	                    	Thread.sleep(1000);
	                    	
	                 
	                      //  ((JavascriptExecutor)driverf).executeScript("arguments[0].click();", elementconform);
	                        
	                        Thread.sleep(1000);
	                        System.out.println("Chrome test pass");
	                        
	                        // nevigate to merchant site and create new password 
	                     
	                        String Uidtext= driver.findElement(By.cssSelector("input#email")).getAttribute("value");
	                        
	                   
	                       // WebElement email = driverf.findElement(By.xpath("//div[@class='input-wrapper']//input"));
	                        //String emailtext=email.getAttribute("value");
	                        
	                        
	                        System.out.println("Password test Start");
	                        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	                        
	                        WebElement passwordmerchant = driver.findElement(By.cssSelector("input#password"));
	                       passwordmerchant.sendKeys("hgftyr23@SkkfkED!-");
	                        Thread.sleep(2000);
	                        WebElement confirmpassword = driver.findElement(By.cssSelector("input#confirmpassword"));
	                        confirmpassword.sendKeys("hgftyr23@SkkfkED!-");
	                        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	                        WebElement passwordmerchantclick = driver.findElement(By.xpath("//button[@type='submit']"));
	                        passwordmerchantclick.click();
	                        
	                        Thread.sleep(3000);
	                        
	                   
	                        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	                        WebElement merchantusername = driver.findElement(By.xpath("//input[@id='Username']"));
	                        merchantusername.sendKeys(Uidtext); 
	                        
	                        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	                        WebElement merchantpassword = driver.findElement(By.xpath("//input[@id='Password']"));
	                        merchantpassword.sendKeys("hgftyr23@SkkfkED!-"); 
	                        
	                        
	                        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	                        WebElement merchantclick = driver.findElement(By.cssSelector("button[type='submit']"));
	                        merchantclick.click();
	                            
	                     /**   
	                        // click on user section
	              		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	              		  driver.findElement(By.cssSelector("a[title='Users'] span[class='menu-name']")).getText();
	              		  driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	              		  driver.findElement(By.cssSelector("a[title='Users'] span[class='menu-name']")).click();
	              		  
	              		  **/
	              		  Thread.sleep(2000);
	              		
	              		
	              		  
	    
	    }
	   
	    
	    // owner gmail delete
	    
	    @Then("^Enter Password and click on sign in$")
	    public void enter_password_and_click_on_sign_in() throws Throwable {
	    	
	    	// Login gmail and delete old mail 
    		  
	    	
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
	                      	Thread.sleep(2000);
	                      	 driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	                      	WebElement checkbox = driverf.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
	                      	((JavascriptExecutor)driverf).executeScript("arguments[0].click();", checkbox);
	  	    		      Thread.sleep(1000);
	  	    		   // checkbox.click();
	  	    		    
	  	    		    // Delete old mail
	  	    		  driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
                    	WebElement checkboxdelete = driverf.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]"));
                    	 driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
                    	checkboxdelete.click();
                    	Thread.sleep(1000);
                    
                    	 WebElement inbox = driverf.findElement(By.linkText("Inbox"));
                    	 inbox.getText();
                    	 System.out.println( inbox.getText());
                    	 Thread.sleep(4000);
                  
                    	 driverf.quit();
                    	
	    		  
	  	    		    
	                    
	    System.out.println("Test merchants add user owner pass");
	    }
	    
	    //finance gmail delete
	    
	    @Then("^Enter Password and click on sign in with finance$")
	    public void enter_password_and_click_on_sign_in_with_finance() throws Throwable {
	    	
	    	// Login gmail and delete old mail 
    		  
	    	
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
	                      	Thread.sleep(2000);
	                      	 driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	                      	WebElement checkbox = driverf.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
	                      	((JavascriptExecutor)driverf).executeScript("arguments[0].click();", checkbox);
	  	    		      Thread.sleep(1000);
	  	    		   // checkbox.click();
	  	    		    
	  	    		    // Delete old mail
	  	    		  driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
                    	WebElement checkboxdelete = driverf.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]"));
                    	 driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
                    	checkboxdelete.click();
                    	Thread.sleep(1000);
                    
                    	 WebElement inbox = driverf.findElement(By.linkText("Inbox"));
                    	 inbox.getText();
                    	 System.out.println( inbox.getText());
                    	 Thread.sleep(4000);
                  
                    	 driverf.quit();
                    	
	    		  
	  	    		    
	                    
	    System.out.println("Test merchants add user finance pass");
	    }
	    
	    // operator gmail delete
	    
	    @Then("^Enter Password and click on sign in with operator$")
	    public void enter_password_and_click_on_sign_in_with_operator() throws Throwable {
	    	
	    	// Login gmail and delete old mail 
    		  
	    	
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
	                      	Thread.sleep(2000);
	                      	 driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	                      	WebElement checkbox = driverf.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]"));
	                      	((JavascriptExecutor)driverf).executeScript("arguments[0].click();", checkbox);
	  	    		      Thread.sleep(1000);
	  	    		   // checkbox.click();
	  	    		    
	  	    		    // Delete old mail
	  	    		  driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
                    	WebElement checkboxdelete = driverf.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]"));
                    	 driverf.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
                    	checkboxdelete.click();
                    	Thread.sleep(1000);
                    
                    	 WebElement inbox = driverf.findElement(By.linkText("Inbox"));
                    	 inbox.getText();
                    	 System.out.println( inbox.getText());
                    	 Thread.sleep(4000);
                  
                    	 driverf.quit();
                    	
	    		  
	  	    		    
	                    
	    System.out.println("Test merchants add user operator pass");
	    }
	    @Then("^Enter username and password and click signin$")
	    public void enter_username_and_password_and_click_signin() throws Throwable {
	    	System.out.println("Test pass all the browser");
	    	Thread.sleep(5000);
	    	if (null != driver) {
	            driver.close();
	                }
	    	
	    }
	    
	    
	    @Then("^Enter username and password and click sign in close$")
	    public void enter_username_and_password_and_click_sign_in_close() throws Throwable {
	    	System.out.println("Test pass all the browser");
	    	Thread.sleep(5000);
	    	if (null != driver) {
	            driver.close();
	                }
	    	
	    }
	    
	    @Then("^Enter username and password and click sign in closee$")
	    public void enter_username_and_password_and_click_sign_in_closee() throws Throwable {
	    	System.out.println("Test pass all the browser");
	    	Thread.sleep(5000);
	    	if (null != driver) {
	            driver.close();
	                }
	    	
	    }

}
