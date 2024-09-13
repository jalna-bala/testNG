package test_classes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class seventh_class implements data_sharda {

	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        driver.get("https://shardaonline.ac.in");
	        driver.manage().window().maximize();
	    }
	    
	    //  Marketing
	    @Test(priority = 61)
	    public void TESTCASES61() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Marketing)).click();
	        
	        Thread.sleep(2000);
		  
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Marketing_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Finance
	    @Test(priority = 62)
	    public void TESTCASES62() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Finance)).click();
	        
	        Thread.sleep(2000);
		   
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		        
		    
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Finance_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Logistic_and_Supply_Chain_Management
	    @Test(priority = 63)
	    public void TESTCASES63() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Logistic_and_Supply_Chain_Management)).click();
	        
	        Thread.sleep(2000);
		   
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Logistics_and_Supply_Chain_Management_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Operations_Management
	    @Test(priority = 64)
	    public void TESTCASES64() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Operations_Management)).click();
	        
	        Thread.sleep(2000);
		   
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		        
		    
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Operations_Management_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	   // Human_Resource_Management
	    @Test(priority = 65)
	    public void TESTCASES65() throws InterruptedException {
	     
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Human_Resource_Management)).click();
	        
	        Thread.sleep(2000);


	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		        
		    
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Human_Resource_Management_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //Digital_Marketing_and_E_commerce
	    @Test(priority = 66)
	    public void TESTCASES66() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Digital_Marketing_and_E_commerce)).click();
	        Thread.sleep(2000);
		  
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Digital_Marketing_and_E_commerce_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	   // Data_Science_and_Analytics
	    @Test(priority = 67)
	    public void TESTCASES67() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Data_Science_and_Analytics)).click();
	        Thread.sleep(2000);
		   
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Data_Science_and_Analytics_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //	International_Finance
	    @Test(priority = 68)
	    public void TESTCASES68() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_Finance)).click();
	        
	        Thread.sleep(2000);  
	        
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_International_Finance_Integrated_by_ACCA_UK_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	  //  Healthcare_and_Hospital_Administration
	    @Test(priority = 69)
	    public void TESTCASES69() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Healthcare_and_Hospital_Administration)).click();
	        
	        Thread.sleep(2000);
		   
	        driver.findElement(By.xpath(Download_Brochure_Button)).click();
		    
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Healthcare_and_Hospital_Administration_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	    // Cyber Security
	    @Test(priority = 70)
	    public void TESTCASES70() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cyber_Security)).click();
	        
	        Thread.sleep(2000);

	        driver.findElement(By.xpath(Download_Brochure_Button)).click();     
		    
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Cyber_Security_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }


}
