package test_classes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    int emptyHrefCount = 0; // ✅ Counter for empty or missing href

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\Chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://shardaonline.ac.in");
    }

    @Test
    public void checkBrokenLinks() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links found: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("Skipping empty or missing href: " + link.getText());
                emptyHrefCount++; // ✅ Increment counter
                continue;
            }

            if (!url.startsWith("http")) {
                System.out.println("Skipping non-HTTP URL: " + url);
                skippingNonHttpCount++;
                continue;
            }

            checkLinkStatus(url);
        }

        // ✅ Updated Summary with empty/missing href count
        System.out.println("========= Summary =========");
        System.out.println("Total links checked: " + links.size());
        System.out.println("Working links: " + workingLinksCount);
        System.out.println("Broken links: " + brokenLinksCount);
        System.out.println("Forbidden links (403): " + forbiddenLinksCount);
        System.out.println("Blocked links (999): " + blockedByAutomationCount);
        System.out.println("Skipped non-HTTP links: " + skippingNonHttpCount);
        System.out.println("Skipped empty/missing href: " + emptyHrefCount); // ✅ Added this
        System.out.println("everything is ok");
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

            connection.disconnect();
        } catch (IOException e) {
            System.out.println("Error checking URL: " + url + " - " + e.getMessage());
            brokenLinksCount++;
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();3
        }
    }
}
