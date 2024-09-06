package selinumpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile =ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\mg990707\\Pictures\\Camera Roll\\Screenshot.png");
		Files.copy(srcFile,destFile);
		driver.close();
		// TODO Auto-generated method stub

	}

}
