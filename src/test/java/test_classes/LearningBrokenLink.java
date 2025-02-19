package test_classes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearningBrokenLink {

    WebDriver driver;
    int brokenLinksCount = 0;
    int workingLinksCount = 0;
    int forbiddenLinksCount = 0;
    int skippingNonHttpCount = 0;
    int blockedByAutomationCount = 0;

    @BeforeMethod
    public void setUp() {
        // Using WebDriverManager to set up ChromeDriver automatically
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\Chromedriver.exe");
	       

        // Initialize the WebDriver (Chrome)
        driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the webpage
        driver.get("https://shardaonline.ac.in");
    }

    @Test
    public void checkBrokenLinks() {
        // Get all the anchor tags (links) on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print total number of links
        System.out.println("Total links found: " + links.size());

        // Check each link's status
        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("Skipping empty or missing href.");
                continue;
            }

            // Check if the URL starts with "http" or "https"
            if (!url.startsWith("http")) {
                System.out.println("Skipping non-HTTP URL: " + url);
                skippingNonHttpCount++;
                continue;
            }

            checkLinkStatus(url);
        }

        // Print summary of links
        System.out.println("========= Summary =========");
        System.out.println("Total links checked: " + links.size());
        System.out.println("Working links: " + workingLinksCount);
        System.out.println("Broken links: " + brokenLinksCount);
        System.out.println("Forbidden links (403): " + forbiddenLinksCount);
        System.out.println("Blocked links (999): " + blockedByAutomationCount);
        System.out.println("Skipped non-HTTP links: " + skippingNonHttpCount);
    }

    private void checkLinkStatus(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.connect();

            int responseCode = connection.getResponseCode();

            if (responseCode == 403) {
                System.out.println(url + " is forbidden (status code: 403).");
                forbiddenLinksCount++;
            } else if (responseCode == 999) {
                System.out.println(url + " is blocked by automation (status code: 999).");
                blockedByAutomationCount++;
            } else if (responseCode >= 400) {
                System.out.println(url + " is a broken link (status code: " + responseCode + ").");
                brokenLinksCount++;
            } else {
                System.out.println(url + " is working (status code: " + responseCode + ").");
                workingLinksCount++;
            }

            connection.disconnect();  // Closing connection

        } catch (IOException e) {
            System.out.println("Error checking URL: " + url + " - " + e.getMessage());
            brokenLinksCount++;
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
