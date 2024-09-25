package test_classes;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Vo_referral implements Referral_data {

    WebDriver driver;

    // XPaths for elements
    String login_button = "//div[contains(text(), 'Login')]";
    String Email_input = "//input[@class='border pl-2 w-[20rem] py-2 rounded-lg outline-none']";
    String send_otp_button = "//button[text()='Send OTP']";
    String otp_input = "/html/body/div[1]/div/div/div[3]/form[2]/input";

    @BeforeMethod
    public void setUp() {
        // Ensure the path to ChromeDriver is correct
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");
	        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://uat.vignanonline.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void TESTCASES1() throws InterruptedException {
        // Step 1: Click on login button
        driver.findElement(By.xpath(login_button)).click();

        // Step 2: Enter email to send OTP
        driver.findElement(By.xpath(Email_input)).sendKeys("balaji.bandal@usdcglobal.com");
        driver.findElement(By.xpath(send_otp_button)).click();

        // Step 3: Wait for OTP email and fetch the OTP
        String otp = waitForEmailOTP("imap.gmail.com", "balaji.bandal@usdcglobal.com", "esko dneq jxhh vcru", 30); // 30 seconds timeout

        if (otp != null) {
            // Step 4: Print the OTP
            System.out.println("Fetched OTP: " + otp);

            // Step 5: Enter OTP into the OTP input field
            driver.findElement(By.xpath(otp_input)).sendKeys(otp);
            System.out.println("OTP successfully entered: " + otp);
        } else {
            System.out.println("OTP not found.");
        }
    }

    // Method to wait for OTP from email using JavaMail API
    public static String waitForEmailOTP(String host, final String username, final String appPassword, int timeoutInSeconds) {
        try {
            Properties properties = new Properties();
            properties.put("mail.store.protocol", "imaps");
            Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, appPassword);
                }
            });

            Store store = session.getStore();
            store.connect(host, username, appPassword);

            // Open inbox folder
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_WRITE);

            long startTime = System.currentTimeMillis();
            long endTime = startTime + timeoutInSeconds * 1000;

            while (System.currentTimeMillis() < endTime) {
                // Search for unread messages
                FlagTerm unreadFlagTerm = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
                Message[] messages = inbox.search(unreadFlagTerm);

                if (messages.length > 0) {
                    Message message = messages[0];  // Fetch the latest unread email
                    String emailContent = message.getContent().toString();

                    // Debug: Print email content
                    System.out.println("Email Content: " + emailContent);

                    // Use regex to find OTP in the email content
                    Pattern otpPattern = Pattern.compile("One-Time Password: (\\w+)");
                    Matcher matcher = otpPattern.matcher(emailContent);
                    if (matcher.find()) {
                        inbox.close(false);
                        store.close();
                        return matcher.group(1); // Return OTP
                    }
                }

                // Sleep for a short period before checking again
                Thread.sleep(2000); // Check every 2 seconds
            }

            // Close inbox and store if the timeout is reached
            inbox.close(false);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null; // Return null if no OTP is found within the timeout
    }

    public static void main(String[] args) {
        Vo_referral test = new Vo_referral();
        try {
            test.setUp();  // Call setUp method
            test.TESTCASES1();  // Call your test case
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
