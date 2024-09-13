package test_classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class second_class implements data_sharda {

	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        driver.get("https://shardaonline.ac.in");
	        driver.manage().window().maximize();
	    }
	    
	    //  Healthcare_and_Hospital_Administration
	    @Test(priority = 11)
	    public void TESTCASES11() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Healthcare_and_Hospital_Administration)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Healthcare_and_Hospital_Administration_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       //Assert.assertEquals(Healthcare_and_Hospital_Administration_Data, IB);
	       Assert.assertEquals(IB, Healthcare_and_Hospital_Administration_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    
	    // Cyber Security
	    @Test(priority = 12)
	    public void TESTCASES12() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cyber_Security)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Cyber_Security_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	      
	       Assert.assertEquals(IB, Cyber_Security_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	 //Artificial Intelligence
	    @Test(priority = 13)
	    public void TESTCASES13() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Artificial_Intelligence)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Artificial_Intelligence_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	      
	       Assert.assertEquals(IB, Artificial_Intelligence_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    //Cloud Computing
	    @Test(priority = 14)
	    public void TESTCASES14() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Cloud_Computing)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Cloud_Computing_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	     
	       Assert.assertEquals(IB, Cloud_Computing_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    //Computer Science and Information Technology
	    @Test(priority = 15)
	    public void TESTCASES15() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Computer_Science_and_Information_Technology)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Computer_Science_and_Information_Technology_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       Assert.assertEquals(IB, Computer_Science_and_Information_Technology_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    
	  //Data Science
	    @Test(priority = 16)
	    public void TESTCASES16() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mca_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Data_Science)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Data_Science_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       Assert.assertEquals(IB, Data_Science_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    
	  //Accounting and Finance
	    @Test(priority = 17)
	    public void TESTCASES17() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Accounting_and_Finance)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Accounting_and_Finance_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       Assert.assertEquals(IB, Accounting_and_Finance_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    //International Finance (Integrated by ACCA, UK)
	    @Test(priority = 18)
	    public void TESTCASES18() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(Mcom_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_mcom)).click();
	        
	        WebElement text = driver.findElement(By.xpath(International_Finance_in_mcom_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       Assert.assertEquals(IB, International_Finance_in_mcom_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    //BBA_program
	    @Test(priority = 19)
	    public void TESTCASES19() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program_in_BBA)).click();
	        
	        WebElement text = driver.findElement(By.xpath(BBA_program_in_BBA_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       Assert.assertEquals(IB, BBA_program_in_BBA_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    //BBA
	    @Test(priority = 20)
	    public void TESTCASES20() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(BBA_program)).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(International_Finance_in_BBA)).click();
	        
	        WebElement text = driver.findElement(By.xpath(International_Finance_in_BBA_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);
  
	       Assert.assertEquals(IB, International_Finance_in_BBA_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    
	    
}
