package test_classes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sixth_class implements data_sharda {

	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        driver.get("https://shardaonline.ac.in");
	        driver.manage().window().maximize();
	    }
	    
	    //Computer Science and Information Technology
	    @Test(priority = 51)
	    public void TESTCASES51() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Computer_Science_and_Information_Technology)).click();
	        
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
	    
	  //Data Science
	    @Test(priority = 52)
	    public void TESTCASES52() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Data_Science)).click();
	        
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
	    
	  //Accounting and Finance
	    @Test(priority = 53)
	    public void TESTCASES53() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Accounting_and_Finance)).click();
	        
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
	    //International Finance (Integrated by ACCA, UK)
	    @Test(priority = 54)
	    public void TESTCASES54() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_mcom)).click();
	        
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
	    //BBA_program
	    @Test(priority = 55)
	    public void TESTCASES55() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program_in_BBA)).click();
	        
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
	    //BBA
	    @Test(priority = 56)
	    public void TESTCASES56() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_BBA)).click();
	        
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
	    //BCA_program
	    @Test(priority = 57)
	    public void TESTCASES57() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program_in_BCA)).click();
	        
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
	    
	    //BA_program
	    @Test(priority = 58)
	    public void TESTCASES58() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_Political_Science_program)).click();
	        
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
	   
	    
		  // International_business
	    @Test(priority = 59)
	    public void TESTCASES59() throws InterruptedException {
	        // International Business
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_business)).click();  
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
     Assert.assertEquals(currentUrl, Expected_URL_of_International_business_Brochure);
 	
 	System.out.println("URL is correct");
	       
 	  driver.quit();
	    }
	  //  Project_Management
	    @Test(priority = 60)
	    public void TESTCASES60() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Project_Management)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Project_Management_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }


}
