package stepDefinitions;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Stordvaule extends Capab{
	
	
	
	public Stordvaule() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
		   
	}
	public String storevalue()
	{
	String identity= driver.findElement(By.cssSelector("input[placeholder='Enter Identity Claim']")).getAttribute("value");
	
	return identity;
	
	
   
	}
	
	public String cprtext()
	{
		String cpr = driver.findElement(By.cssSelector("input[placeholder='Enter CPR Number']")).getAttribute("value");
		return cpr;
		  
	}
	
	// write code for Automation Test Step for shopper Login automation with MitId testing tools
	
	public void login() throws InterruptedException
    {
		// ** Given Open Mit Id testing tool Link
		
		driver.get("https://pp.mitid.dk/test-tool/frontend/#/create-identity");
		driver.manage().window().maximize();
		
		// ** When Click upper left side search box and type CPR number which you want to login
		
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[placeholder='CPR | Identity Claim | UUID']")).sendKeys("0206922990");
		driver.findElement(By.cssSelector("#search")).click();
		
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
    	Thread.sleep(5000);
    	
    	//code for switch between windows 
    	((JavascriptExecutor) driver).executeScript("window.open()");
    	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(tabs.get(1));
    	driver.get("https://anyday-acceptance.yadyna.xyz/en/shopper");
    	Thread.sleep(5000);
    	driver.findElement(By.cssSelector("button[class='p-mb-3 p-text-left mitid-button p-button p-component'] span[class='p-button-label']")).click();
    	
    	Thread.sleep(5000);
    	WebElement Userid=driver.findElement(By.xpath("//div[@defaultlanguage='DAﾠ/ﾠDK']//input[1]"));
    	Userid.sendKeys(Uidtextmain);
    	Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@showicontext='IconﾠHelpﾠText']")).click();
        // Switch the testing tool tab 
        driver.switchTo().window(tabs.get(0));
    	// Scroll on this element 
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
	      	
	        // Switch the shopper tab 
	        driver.switchTo().window(tabs.get(1));
	        WebElement Useridcopycpr=driver.findElement(By.cssSelector("#dkmitid_cprentry_input"));
	    	Useridcopycpr.sendKeys(Uidtextmaincpr);
	    	Thread.sleep(5000);
	    	driver.findElement(By.cssSelector("#dkmitid_cprentry_submit")).click();
	    	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	        
    	
	}
}
