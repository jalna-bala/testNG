package test_classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class first_class implements data_sharda {
	 WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	        driver.get("https://shardaonline.ac.in");
	        driver.manage().window().maximize();
	    }

	  // International_business
	    @Test(priority = 1)
	    public void TESTCASES1() throws InterruptedException {
	        // International Business
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_business)).click();
	        
	        WebElement text = driver.findElement(By.xpath(International_business_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);

	       //Assert.assertEquals(International_business_Data, IB);
	       Assert.assertEquals(IB, International_business_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();
	       

	    }
	  //  Project_Management
	    @Test(priority = 2)
	    public void TESTCASES2() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Project_Management)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Project_Management_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);

	       //Assert.assertEquals(Project_Management_Data, IB);
	       Assert.assertEquals(IB, Project_Management_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	  //  Marketing
	    @Test(priority = 3)
	    public void TESTCASES3() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Marketing)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Marketing_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);

	      // Assert.assertEquals(Marketing_Data, IB);
	       Assert.assertEquals(IB, Marketing_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	  //  Finance
	    @Test(priority = 4)
	    public void TESTCASES4() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Finance)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Finance_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);

	      // Assert.assertEquals(Finance_Data, IB);
	       Assert.assertEquals(IB, Finance_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	  //  Logistic_and_Supply_Chain_Management
	    @Test(priority = 5)
	    public void TESTCASES5() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Logistic_and_Supply_Chain_Management)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Logistic_and_Supply_Chain_Management_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);

	       //Assert.assertEquals(Logistic_and_Supply_Chain_Management_Data, IB);
	       Assert.assertEquals(IB, Logistic_and_Supply_Chain_Management_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	  //  Operations_Management
	    @Test(priority = 6)
	    public void TESTCASES6() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Operations_Management)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Operations_Management_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);

	       //Assert.assertEquals(Operations_Management_Data, IB);
	        Assert.assertEquals(IB, Operations_Management_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	   // Human_Resource_Management
	    @Test(priority = 7)
	    public void TESTCASES7() throws InterruptedException {
	     
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Human_Resource_Management)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Human_Resource_Management_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);

	      // Assert.assertEquals(Human_Resource_Management_Data, IB);
	        Assert.assertEquals(IB, Human_Resource_Management_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    //Digital_Marketing_and_E_commerce
	    @Test(priority = 8)
	    public void TESTCASES8() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Digital_Marketing_and_E_commerce)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Digital_Marketing_and_E_commerce_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);

	      // Assert.assertEquals(Digital_Marketing_and_E_commerce_Data, IB);
		    Assert.assertEquals(IB, Digital_Marketing_and_E_commerce_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	   // Data_Science_and_Analytics
	    @Test(priority = 9)
	    public void TESTCASES9() throws InterruptedException {
	       
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(Data_Science_and_Analytics)).click();
	        
	        WebElement text = driver.findElement(By.xpath(Data_Science_and_Analytics_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);

	     //  Assert.assertEquals(Data_Science_and_Analytics_Data, IB);
	        Assert.assertEquals(IB, Data_Science_and_Analytics_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }
	    //	International_Finance
	    @Test(priority = 10)
	    public void TESTCASES10() throws InterruptedException {
	      
	        driver.findElement(By.xpath(explore_program)).click();
	        
	        driver.findElement(By.xpath(International_Finance)).click();
	        
	        WebElement text = driver.findElement(By.xpath(International_Finance_rev));
	       
	        String IB = text.getText();
	       
	        System.out.println(IB);

	       //Assert.assertEquals(International_Finance_Data, IB);
	        Assert.assertEquals(IB, International_Finance_Data);
	       System.out.println("ELECTIVE IS FOUND");
	       
	       driver.close();

	    }

}
