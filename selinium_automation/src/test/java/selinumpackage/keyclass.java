package selinumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.medlablive.in");
		driver.findElement(By.id("user_name")).sendKeys("demo");
		WebElement elementuser=driver.findElement(By.id("user_name"));
		elementuser.sendKeys(Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("demo1212");
		
		WebElement elementpass=driver.findElement(By.id("password"));
		elementpass.sendKeys(Keys.TAB);
		
		WebElement elementClick=driver.findElement(By.name("Login"));
		 elementClick.sendKeys(Keys.ENTER);
		 Thread.sleep(3000);
		 driver.close();
		 
		
	}

}
