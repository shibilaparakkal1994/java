package selinumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.findElement(By.name("q")).sendKeys("flower");
driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
driver.findElement(By.name("btnK")).click();
Thread.sleep(5000);
driver.close();
	}

}
