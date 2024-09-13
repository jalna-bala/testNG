package test_classes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class fifth_class implements data_sharda {

	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        driver.get("https://shardaonline.ac.in");
	        driver.manage().window().maximize();
	    }
	//  Logistic_and_Supply_Chain_Management
	    @Test(priority = 41)
	    public void TESTCASES41() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Logistic_and_Supply_Chain_Management)).click();
	        
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
	  //  Operations_Management
	    @Test(priority = 42)
	    public void TESTCASES42() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Operations_Management)).click();
	        
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
	   // Human_Resource_Management
	    @Test(priority = 43)
	    public void TESTCASES43() throws InterruptedException {
	     
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Human_Resource_Management)).click();
	        
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
	    //Digital_Marketing_and_E_commerce
	    @Test(priority = 44)
	    public void TESTCASES44() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Digital_Marketing_and_E_commerce)).click();
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
	   // Data_Science_and_Analytics
	    @Test(priority = 45)
	    public void TESTCASES45() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Data_Science_and_Analytics)).click();
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
	    //	International_Finance
	    @Test(priority = 46)
	    public void TESTCASES46() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_Finance)).click();
	        
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
	  //  Healthcare_and_Hospital_Administration
	    @Test(priority = 47)
	    public void TESTCASES47() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Healthcare_and_Hospital_Administration)).click();
	        
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
	    
	    // Cyber Security
	    @Test(priority = 48)
	    public void TESTCASES48() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cyber_Security)).click();
	        
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
	 //Artificial Intelligence
	    @Test(priority = 49)
	    public void TESTCASES49() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Artificial_Intelligence)).click();
	        
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
	    //Cloud Computing
	    @Test(priority = 50)
	    public void TESTCASES50() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cloud_Computing)).click();
	        
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
