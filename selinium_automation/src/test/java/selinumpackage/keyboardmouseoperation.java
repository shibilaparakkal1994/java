package selinumpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardmouseoperation {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Robot r= new Robot();//delecration of r
		
		r.mouseMove(300,500 );//method of mouseor mouse action
		
		r.keyPress(KeyEvent.VK_ALT);//key method
		
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_W);//to open a new private window
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
