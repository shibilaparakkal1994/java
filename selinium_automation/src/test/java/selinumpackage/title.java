package selinumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class title {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		String title=driver.getTitle();
		
		System.out.println("the title of the page is:"+title);
		String currentUrl=driver.getCurrentUrl();
		System.out.println("the url of the page is "+currentUrl);
		String pageSource=driver.getPageSource();
		System.out.println("sourse code of the page is"+pageSource);
		
		
		Thread.sleep(3000);
		driver.close();
		
	}



}