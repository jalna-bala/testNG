package test_classes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fourth_class implements data_sharda {

	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        driver.get("https://shardaonline.ac.in");
	        driver.manage().window().maximize();
	    }
	    // Apply now Banner 1st 
	    @Test(priority = 31)
	    public void TESTCASES31() throws InterruptedException {
	      

	    	 Actions actions = new Actions(driver);
	    	 
	    	 WebElement hoverElement =driver.findElement(By.xpath(hoverElement_xpath));
	    	
	    	 actions.moveToElement(hoverElement).perform();
	    	 
	    	 Thread.sleep(2000);
	    	driver.findElement(By.xpath(Apply_now)).click();
	    	Thread.sleep(2000); 
		    
		       System.out.println("Clickable");
		       
		       driver.close();
	    }
	    // Apply now Banner 2nd in side scroll
	    @Test(priority = 32)
	    public void TESTCASES32() throws InterruptedException {
	      

	    	 Actions actions = new Actions(driver);
	    	 
	    	 WebElement hoverElement =driver.findElement(By.xpath(hoverElement_xpath_2nd));
	    	 Thread.sleep(3000);
	    	 actions.moveToElement(hoverElement).perform();
	    	 
	    	 Thread.sleep(3000);
	    	driver.findElement(By.xpath(hoverElement_xpath_2nd)).click();
	    	Thread.sleep(3000); 
		    
		       System.out.println("Clickable");
		       
		       driver.close();
	    }
	    
	  //  master program
	    @Test(priority = 33)
	    public void TESTCASES33() throws InterruptedException {
	     
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        // Scroll down by 1000 pixels
	        js.executeScript("window.scrollBy(0,1150)");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath(Apply_now_finance)).click();
		       
		       System.out.println("its Clicable for finance");
		        
		       driver.close();
	       

	    }
	    //bachalor program
	    @Test(priority = 34)
	    public void TESTCASES34() throws InterruptedException {
	     
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        // Scroll down by 1000 pixels
	        js.executeScript("window.scrollBy(0,900)");
	        
		        
		      driver.findElement(By.xpath(Bachelors_Degree)).click();
		      
		      
		      driver.findElement(By.xpath(international_finance)).click();
		       
		
		        
		            System.out.println("its Clicable for internation finance bachlor");
		        
		       driver.close();
	       

	    }  
	  // WHATSAPP NO CHECK
	    @Test(priority = 35)
	    public void TESTCASES35() throws InterruptedException {
	     
	    	driver.findElement(By.xpath(whatsapp_xpath)).click(); 
	    	
	    	
	    	Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
         Set<String> allWindows = driver.getWindowHandles();
         for (String window : allWindows) {
             if (!window.equals(originalWindow)) {
                 driver.switchTo().window(window);
                 break;
             }
         }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL);
	    	
	    	System.out.println("URL is correct");
	    	
	    	
		       driver.close();
	       

	    }  
	    
	    //Phone NO CHECK
	    @Test(priority = 36)
	    public void TESTCASES36() throws InterruptedException {
	     
	    	 Actions actions = new Actions(driver);
	    	 
	    	 WebElement hoverElement =driver.findElement(By.xpath(call_button));
	    	
	    	 actions.moveToElement(hoverElement).perform();
	    	 
	    	 Thread.sleep(2000);
	    	 WebElement hoverElement_2 =driver.findElement(By.xpath(call_no));
		    	
	    	 actions.moveToElement(hoverElement_2).perform();

	    	String current_no= driver.findElement(By.xpath(call_no)).getText();
	    	  Assert.assertEquals(current_no, Expected_NO);
	    	
	    	System.out.println("the no is correect "+current_no);
	    	driver.close();
	    	
	}
		  // International_business
	    @Test(priority = 37)
	    public void TESTCASES37() throws InterruptedException {
	        // International Business
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_business)).click();  
	        Thread.sleep(2000);
	    driver.findElement(By.xpath(Apply_now_on_elective)).click();
	        
	    
	    Thread.sleep(2000);
 	
 	String originalWindow = driver.getWindowHandle();
     Set<String> allWindows = driver.getWindowHandles();
     for (String window : allWindows) {
         if (!window.equals(originalWindow)) {
             driver.switchTo().window(window);
             break;
         }
     }
 	 
 	String currentUrl = driver.getCurrentUrl();
     System.out.println("Current URL: " + currentUrl);

     // Optionally, use an assertion to verify the URL
     Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
 	
 	System.out.println("URL is correct");
	       
 	  driver.quit();
	    }
	  //  Project_Management
	    @Test(priority = 38)
	    public void TESTCASES38() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Project_Management)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Marketing
	    @Test(priority = 39)
	    public void TESTCASES39() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Marketing)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Finance
	    @Test(priority = 40)
	    public void TESTCASES40() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Finance)).click();
	        
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(Apply_now_on_elective)).click();
		        
		    
		    Thread.sleep(2000);
	    	
	    	String originalWindow = driver.getWindowHandle();
	        Set<String> allWindows = driver.getWindowHandles();
	        for (String window : allWindows) {
	            if (!window.equals(originalWindow)) {
	                driver.switchTo().window(window);
	                break;
	            }
	        }
	    	 
	    	String currentUrl = driver.getCurrentUrl();
	        System.out.println("Current URL: " + currentUrl);

	        // Optionally, use an assertion to verify the URL
	        Assert.assertEquals(currentUrl, Expected_URL_of_apply_now);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
}
