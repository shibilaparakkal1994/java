package TestNGframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class medlabnewtest {

	WebDriver driver;//intializatin of driver
	@Test(priority =1,description="in step 1")
	public void f()
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	@Test(priority =2,description ="in step 2")
	public void a()
	{
		driver.get("http://demo.medlablive.in");
        driver.findElement(By.id("user_name")).sendKeys("demo");
        driver.findElement(By.id("password")).sendKeys("demo1212");
        driver.findElement(By.name("Login")).click();
	}
	

}
