package selinumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathusingatribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(3000);
		WebElement logoutBtn = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		Thread.sleep(4000);
		if(logoutBtn.isDisplayed())
		{
			System.out.println("home page is displayed");
		}
			else
			{
				System.out.println("home page is not displayed");
			}
		}
	}


