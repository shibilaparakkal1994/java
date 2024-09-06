package selinumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("5329");
		driver.findElement(By.name("submit")).submit();
		Alert alert =(Alert) driver.switchTo().alert();
		String alertMessage=driver.switchTo().alert().getText();
		System.out.println("alert message:"+ alertMessage);
        Thread.sleep(5000);
        alert.accept();
        alert.dismiss();
	}

	
}
