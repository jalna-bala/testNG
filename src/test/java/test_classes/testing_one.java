package test_classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testing_one implements data_sharda {

	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();   
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        driver.get("https://shardaonline.ac.in");
	        driver.manage().window().maximize();
	    }
	
	
	
	
	  @Test(priority = 1)
	    public void TESTCASES11() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Healthcare_and_Hospital_Administration)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Healthcare_and_Hospital_Administration_rev));
	       
	        String IB = text.getText();
	       
	      //   System.out.println(IB);

	       //Assert.assertEquals(Healthcare_and_Hospital_Administration_Data, IB);
	       Assert.assertEquals(IB, Healthcare_and_Hospital_Administration_Data);
	       System.out.println(IB + " ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    
}
