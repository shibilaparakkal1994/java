package selinumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver obj=new ChromeDriver();
		obj.get("https://demo.guru99.com/test/radio.html");
		WebElement radio1=obj.findElement(By.id("vfb-7-1"));
		WebElement radio2=obj.findElement(By.id("vfb-7-2"));
		radio1.click();
		System.out.println("Radio button 1 selected");
		radio2.click();
		System.out.println("radio button 2 selected");
		WebElement checkbox1=obj.findElement(By.id("vfb-6-0"));
		WebElement checkbox2=obj.findElement(By.id("vfb-6-1"));
		checkbox1.click();
		if(checkbox1.isSelected()) {
			System.out.println("checkbox1 is selected");
			
			
		}
		else
		{
			System.out.println("checkbox is not selected");
			
		}
		Thread.sleep(5000);
		obj.close();
		
	}

}
