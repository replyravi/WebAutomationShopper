package stepDefinitions;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Checkoutfunction extends Stordvaule{

	public Checkoutfunction() throws MalformedURLException {}
	   
	@Given("^Open admin page of Anyday$")
	    public void open_admin_page_of_anyday() throws Throwable {
		driver.get("https://anyday-acceptance.yadyna.xyz/en/admin/login");
		driver.manage().window().maximize();
		
	
	     
	    }

	 @Then("^Enter username and password click Sign In$")
	    public void enter_username_and_password_click_sign_in() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#Username")).sendKeys("superadmin@manaotest.com");
			driver.findElement(By.cssSelector("#Password")).sendKeys("Manao100%");
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("button[type='submit']")).click();
	    }

	    @Then("^Navigate to left side and click on Merchants option$")
	    public void navigate_to_left_side_and_click_on_merchants_option() throws Throwable {
	    	Thread.sleep(5000);
	    	driver.findElement(By.cssSelector("body > app-root:nth-child(2) > div:nth-child(1) > app-admin-dashboard:nth-child(2) > app-anyday-dashboard:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(4) > anyday-dashboard-menu-item:nth-child(1) > a:nth-child(1) > span:nth-child(2)")).click();
	    	
	    }

	    @Then("^Scroll horizontal till Details column and click on eyes icon$")
	    public void scroll_horizontal_till_details_column_and_click_on_eyes_icon() throws Throwable {
	    	// Scroll to the element
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	WebElement element = driver.findElement(By.xpath("//th[@title='Details']"));
	    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);  
	    	element.click();
	    	// click on eye icon
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	        driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/div[1]/app-admin-dashboard[1]/app-anyday-dashboard[1]/div[1]/div[3]/app-merchants[1]/div[1]/div[2]/div[1]/app-anyday-table[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/a[1]/i[1]")).click();
	    }
	    @Given("^Navigate to API tab and click regenerate API key button$")
	    public void navigate_to_api_tab_and_click_regenerate_api_key_button() throws Throwable {
	    	Thread.sleep(5000);
	    	driver.findElement(By.cssSelector(".nav-link[routerlink='apikey']")).click();
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	// Generate API key in the button 
	    	driver.findElement(By.cssSelector("button[label='Regenerate API Key'] span[class='p-button-label']")).click();
	    	Thread.sleep(5000);
	    	// use javascript for that shadow click 
	    	WebElement APikey =driver.findElement(By.xpath("//span[normalize-space()='Regenerate']"));
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", APikey);
	    	for(int i=1;1>=i;i++)
	    	{
	    	APikey.click();
	    	}
	    	Thread.sleep(5000);
	    	// javascript code 
	    	/**WebDriverWait wait = new WebDriverWait(driver, 50);
	    	WebElement APikeyclose = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'ng-tns-c69-18 p-dialog-header-icon')]"))); 
	    	((JavascriptExecutor)driver).executeScript("arguments[0].click();", APikeyclose);
	    	**/
	    	driver.findElement(By.xpath("//div[@class='p-dialog-header-icons ng-tns-c69-2']//button[1]")).getText();
	    	WebElement APikeyclose = driver.findElement(By.xpath("//div[@class='p-dialog-header-icons ng-tns-c69-2']//button[1]"));
	    	Actions actionss = new Actions(driver);
	    	actionss.moveToElement(APikeyclose).click().build().perform();
	    	
	    	
	    
	    }

	    @Given("^Copy API key with click on copy icon$")
	    public void copy_api_key_with_click_on_copy_icon() throws Throwable {
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("(//input[@id='inputId'])[1]")).click();
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	driver.findElement(By.xpath("(//input[@id='inputId'])[1]")).click();
	    	Thread.sleep(5000);
	    	WebElement CopyText = driver.findElement(By.xpath("(//input[@id='inputId'])[1]"));
	    	CopyText.sendKeys(Keys.CONTROL + "a");
	    	CopyText.sendKeys(Keys.CONTROL + "c");
	    	
	       // Open Mock Web Shop 
	       ((JavascriptExecutor) driver).executeScript("window.open()");
	    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    	driver.switchTo().window(tabs.get(1));
	    	driver.get("https://anyday-acceptance.yadyna.xyz/en/shopper/mock_webshop");
	    	
	    	Thread.sleep(5000);
	    	driver.findElement(By.cssSelector("input[placeholder='Merchant API key']")).click();
	    	WebElement PastAPI= driver.findElement(By.cssSelector("input[placeholder='Merchant API key']"));
	    	PastAPI.click();
	    	PastAPI.sendKeys(Keys.CONTROL + "v");
	    	
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	driver.findElement(By.cssSelector("#totalPrice")).clear();
	    	driver.findElement(By.cssSelector("#totalPrice")).sendKeys("499");
	    	
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	driver.findElement(By.cssSelector("#webShopCallbackUrl")).clear();
	    driver.findElement(By.cssSelector("#webShopCallbackUrl")).sendKeys("https://anyday-acceptance.yadyna.xyz/en/shopper/mock_webshop");
	    	
	    driver.switchTo().window(tabs.get(0));
	    }

	    @Then("^Logout Anyday admin page and switch windows to mock webshop form$")
	    public void logout_anyday_admin_page_and_switch_windows_to_mock_webshop_form() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	driver.findElement(By.cssSelector("#button-basic")).click();
	    driver.findElement(By.cssSelector(".dropdown-item")).click();
	    
	    // Code For Switch windows 
	    
	    ((JavascriptExecutor) driver).executeScript("window.open()");
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
	    }

	    @Then("^Open mock webshop form past API key in Merchant API key text field$")
	    public void open_mock_webshop_form_past_api_key_in_merchant_api_key_text_field() throws Throwable {
	        System.out.println("Test Pass");
	    } 
	    

	    @Given("^Fill total price more then three hundred price$")
	    public void fill_total_price_more_then_three_hundred_price() throws Throwable {
	    	System.out.println("Test Pass");
	    }
	    
	    @Then("^Enter URL for navigate shopper page and click on submit button$")
	    public void enter_url_for_navigate_shopper_page_and_click_on_submit_button() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	driver.findElement(By.cssSelector("div[class='outlet-wrapper'] app-mock-webshop-form div button")).click();
	    	Thread.sleep(5000);
	    }
	    

	    @Given("^Navigate to shopper page and follow login steps$")
	    public void navigate_to_shopper_page_and_follow_login_steps() throws Throwable {
	    	((JavascriptExecutor) driver).executeScript("window.open()");
	    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    	driver.switchTo().window(tabs.get(2));
	    	driver.get("https://pp.mitid.dk/test-tool/frontend/#/create-identity");
	    	// Enter CPR in the search box 
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("input[placeholder='CPR | Identity Claim | UUID']")).sendKeys("0206922990");
			driver.findElement(By.cssSelector("#search")).click();
			
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			
			// Split the text and get only text from  
			
			WebElement Uid=driver.findElement(By.cssSelector("div[class='mitid--col test-tool-view-identity-values'] li:nth-child(1)"));
	    	String Uidtext =Uid.getText();
	    	System.out.println(Uidtext);
	    	
	    	// Write code for split string and save in string variable 
	    	
	    	String[] arrSplit = Uidtext.split(": ");
	    	System.out.println(arrSplit[0]);
	    	System.out.println(arrSplit[1]);
	    	String Uidtextmain=arrSplit[1];
		
			driver.switchTo().window(tabs.get(1));
			
			Thread.sleep(5000);
	    	driver.findElement(By.cssSelector("button[class='p-mb-3 p-text-left mitid-button p-button p-component'] span[class='p-button-label']")).click();
	    	
	    	Thread.sleep(5000);
	    	WebElement Userid=driver.findElement(By.xpath("//div[@defaultlanguage='DAﾠ/ﾠDK']//input[1]"));
	    	Userid.sendKeys(Uidtextmain);
	    	Thread.sleep(5000);
	        driver.findElement(By.xpath("//button[@showicontext='IconﾠHelpﾠText']")).click();
	        
	        // Switch to the testing tool tab
	        driver.switchTo().window(tabs.get(2));
	        
	        WebElement element = driver.findElement(By.cssSelector("#open-simulator-codeapp-0"));
	    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);  
	    	element.click();
	    	
	    	
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
	    
		          
		          // scroll to cpr 
		          Thread.sleep(5000);
		          WebElement elementcpr = driver.findElement(By.cssSelector("li[class='test-tool-view-identity-item no-list'] b"));
		      	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", elementcpr);  
		          
		       // Find the cpr text and split it and copy only cpr value 
		      	WebElement Uidcpr=driver.findElement(By.xpath("//body[@id='body']/mitid-frontends-root[1]/div[1]/test-tool-view-identity[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[6]"));
		      	String Uidtextcpr =Uidcpr.getText();
		      	System.out.println(Uidtextcpr);
		      	
		      	// Write code for split string and save in string variable 
		      	
		      	String[] arrSplitcpr = Uidtextcpr.split(": ");
		      	System.out.println(arrSplitcpr[0]);
		      	System.out.println(arrSplitcpr[1]);
		      	String Uidtextmaincpr=arrSplitcpr[1];
		      	Thread.sleep(5000);
		      	
	        // Switch the windows Login Anyday 
		      	
		      	driver.switchTo().window(tabs.get(1));
		      	WebElement Useridcopycpr=driver.findElement(By.cssSelector("#dkmitid_cprentry_input"));
		    	Useridcopycpr.sendKeys(Uidtextmaincpr);
		    	Thread.sleep(5000);
		    	driver.findElement(By.cssSelector("#dkmitid_cprentry_submit")).click();
		    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		      	
	    }

	    @Given("^verify all the payments instalment and check box click on Pay First Instalment$")
	    public void verify_all_the_payments_instalment_and_check_box_click_on_pay_first_instalment() throws Throwable {
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	driver.findElement(By.cssSelector("div[class='p-checkbox-box']")).click();
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	    	Thread.sleep(5000);
	    	driver.findElement(By.cssSelector(".p-button-label")).click();
	    	Thread.sleep(5000);
	    }

	    
}
