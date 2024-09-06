package TestNGframes;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class BeforeandAftertest {
	public String baseUrl = "https://www.browserstack.com/";
    String driverPath = "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
    public WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        System.out.println("Launching Chrome browser");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void verifyHomepageTitle() {
        String expectedTitle = "Most reliable app and cross browser testing platform | BrowserStack";
        String actualTitle = driver.getTitle();
        AssertJUnit.assertEquals(actualTitle, expectedTitle);
    }

    @AfterTest
    public void terminateBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
