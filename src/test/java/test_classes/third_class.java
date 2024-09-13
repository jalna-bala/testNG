package test_classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class third_class implements data_sharda {

	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        driver.get("https://shardaonline.ac.in");
	        driver.manage().window().maximize();
	    }
	    
	    //BCA_program
	    @Test(priority = 21)
	    public void TESTCASES21() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BCA_program_in_BCA)).click();
	        
	        WebElement text = driver.findElement(By.xpath(BCA_program_in_BCA_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       Assert.assertEquals(IB, BCA_program_in_BCA_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    } 
	    
	    
	    //BA_program
	    @Test(priority = 22)
	    public void TESTCASES22() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BA_Political_Science_program)).click();
	        
	        WebElement text = driver.findElement(By.xpath(BA_Political_Science_program_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       Assert.assertEquals(IB, BA_Political_Science_program_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }    
	  //  about_us
	    @Test(priority = 23)
	    public void TESTCASES23() throws InterruptedException {
	      
	        driver.findElement(By.xpath(about_us)).click();
	        	        
	        WebElement text = driver.findElement(By.xpath(about_us_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       //Assert.assertEquals(Healthcare_and_Hospital_Administration_Data, IB);
	       Assert.assertEquals(IB, about_us_data);
	      	       
	       driver.close();

	    }
	   // Blogs
	    @Test(priority = 24)
	    public void TESTCASES24() throws InterruptedException {
	      
	        driver.findElement(By.xpath(Blogs)).click();
	        	        
	        WebElement text = driver.findElement(By.xpath(Blogs_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       //Assert.assertEquals(Healthcare_and_Hospital_Administration_Data, IB);
	       Assert.assertEquals(IB, Blogs_data);
	      	       
	       driver.close();

	    }
	    //Contact_us
	    @Test(priority = 25)
	    public void TESTCASES25() throws InterruptedException {
	     
	        driver.findElement(By.xpath(Contact_us)).click();
	        	        
	        WebElement text = driver.findElement(By.xpath(Contact_us_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       //Assert.assertEquals(Healthcare_and_Hospital_Administration_Data, IB);
	       Assert.assertEquals(IB, Contact_us_data);
	      	       
	       driver.close();

	    }
	  //  searchicon
	  //  @Test(priority = 26)
	    public void TESTCASES26() throws InterruptedException {
	      
	        driver.findElement(By.xpath(searchicon)).click();
	        
	       
	        //
	        driver.findElement(By.id(search_input_xpath)).sendKeys(searchicon_data);
	        //
	        driver.findElement(By.id(search_input_xpath)).sendKeys(Keys.ENTER);
	        //
	      
	        WebElement text = driver.findElement(By.xpath(searchicon_rev));
	        String IB = text.getText();
	       	     
	       Assert.assertEquals(IB, searchicon_data);
	       System.out.println(IB);
	      	       
	       driver.close();

	    }
	  //  Enquire_now form
	    @Test(priority = 27)
	    public void TESTCASES27() throws InterruptedException {
	       
	        driver.findElement(By.xpath(Enquire_now)).click();
	     	        
		      WebElement text = driver.findElement(By.xpath(Enquire_now_rev));
		       
		       String IB = text.getText();
		       
		           
		       Assert.assertEquals(IB, Enquire_now_data);
		       
		       System.out.println(IB);
		       
		       driver.close();

	    }
	  //  Apply_now
	    @Test(priority = 28)
	    public void TESTCASES28() throws InterruptedException {
	       
	    	
	    	 Actions actions = new Actions(driver);
	    	 
	    	 WebElement hoverElement =driver.findElement(By.xpath(hoverElement_xpath));
	    	
	    	 actions.moveToElement(hoverElement).perform();
	    	 
	    	 Thread.sleep(2000);
	    	driver.findElement(By.xpath(Apply_now)).click();
	    	Thread.sleep(2000); 
		    
		       System.out.println("Clickable");
		       
		       driver.close();

	    }
	   // master and bachlor program click
	  //  @Test(priority = 29)
	    public void TESTCASES29() throws InterruptedException {
	        
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        // Scroll down by 1000 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	    
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath(Bachelors_Degree)).click();
	        
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath(Masters_Degree)).click();
	        
	        Thread.sleep(2000);
	       
	       
	       driver.close();

	    }
	   // enquiry form fill
	    @Test(priority = 30)
	    public void TESTCASES30() throws InterruptedException {
	     
	        driver.findElement(By.xpath(Enquire_now)).click();
	     	        
		    driver.findElement(By.id(Name_id)).sendKeys(Name);
		       
		    driver.findElement(By.id(email_id)).sendKeys(email);
		    
		    driver.findElement(By.id(phone_id)).sendKeys(phone);
		    
		  //  driver.findElement(By.xpath(get_otp)).click();

		   // Thread.sleep(2000);
		   // driver.findElement(By.id(otp_id)).sendKeys(otp);
		    
		    //fill manually 
		    
		  //  driver.findElement(By.xpath(verify_otp)).click();
		    
		    WebElement stateListbox = driver.findElement(By.name("state"));

	        // Create a Select object and pass the listbox element
	        Select select = new Select(stateListbox);

	        // Example: Select an option by visible text
	        select.selectByValue("Maharashtra");
	        
	        WebElement cityListbox = driver.findElement(By.id("city"));
	        Select citySelect = new Select(cityListbox);
	        citySelect.selectByValue("Jalna");

	        // Handling 'program' listbox
	        WebElement programListbox = driver.findElement(By.id("program"));
	        Select programSelect = new Select(programListbox);
	        programSelect.selectByVisibleText("MBA");

	        // Handling 'elective' listbox
	        WebElement electiveListbox = driver.findElement(By.id("elective"));
	        Select electiveSelect = new Select(electiveListbox);
	        electiveSelect.selectByVisibleText("Finance");
		    System.out.println("form is working");
		    driver.close();
	    }
	    
	    
}
