package selinumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maxminfullscreen {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/");

driver.manage().window().maximize();
Thread.sleep(3000);		// TODO Auto-generated method stub
driver.manage().window().minimize();
Thread.sleep(3000);	
driver.manage().window().fullscreen();
Thread.sleep(3000);	
driver.close();

	}

}
