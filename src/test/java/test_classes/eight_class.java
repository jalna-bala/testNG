package test_classes;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class eight_class implements data_sharda {

	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        driver.get("https://shardaonline.ac.in");
	        driver.manage().window().maximize();
	    }
	    
	    
	    //Artificial Intelligence
	    @Test(priority = 71)
	    public void TESTCASES71() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Artificial_Intelligence)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Artificial_Intelligence_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //Cloud Computing
	    @Test(priority = 72)
	    public void TESTCASES72() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cloud_Computing)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Cloud_Computing_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //Computer Science and Information Technology
	    @Test(priority = 73)
	    public void TESTCASES73() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Computer_Science_and_Information_Technology)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Computer_Science_and_Information_Technology_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	  //Data Science
	    @Test(priority = 74)
	    public void TESTCASES74() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Data_Science)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Data_Science_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	  //Accounting and Finance
	    @Test(priority = 75)
	    public void TESTCASES75() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Accounting_and_Finance)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Accounting_and_Finance_Brochure_in_mcom);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //International Finance (Integrated by ACCA, UK)
	    @Test(priority = 76)
	    public void TESTCASES76() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_mcom)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_International_Finance_Integrated_by_ACCA_UK_Brochure_mcom);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //BBA_program
	    @Test(priority = 77)
	    public void TESTCASES77() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program_in_BBA)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_BBA_Program_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //BBA
	    @Test(priority = 78)
	    public void TESTCASES78() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_BBA)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_International_Finance_in_bba);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    //BCA_program
	    @Test(priority = 79)
	    public void TESTCASES79() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program_in_BCA)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Online_BCA_Program_Brochure);
	    	
	    	System.out.println("URL is correct");
		       
	    	  driver.quit();
		    }
	    
	    //BA_program
	    @Test(priority = 80)
	    public void TESTCASES80() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_Political_Science_program)).click();
	        
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
	        Assert.assertEquals(currentUrl, Expected_URL_of_Political_Science_Brochure);
	    	
	    	System.out.println("URL is correct");
		     
	    	  driver.quit();
		    } 
	    @AfterClass
	    public void tearDown() {
	        // Code to clean up after all test methods are run
	        System.out.println("Cleanup after all test methods");
	        System.out.println("executed all test cases ");
	        System.out.println("done new one");
	    }
	    
	}

	

