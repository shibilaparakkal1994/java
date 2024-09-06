package selinumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keybordeventusingAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Actions actions =new Actions(driver);
		
		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("Mr.peter haynes");
		WebElement email=driver.findElement(By.id("userEmail"));
		email.sendKeys("peterhaynes@toolsqa.com");
		
		WebElement currentAddress=driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 school lane london EC71 9G0");
		actions.keyDown(Keys.CONTROL);
		
		actions.sendKeys("a");
		
		actions.keyUp(Keys.CONTROL);
		
		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL);
		
		actions.sendKeys("c");
		
		actions.keyUp(Keys.CONTROL);
		
		actions.build().perform();
		
		actions.sendKeys(Keys.TAB);
		
		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL);
		
		actions.sendKeys("v");
		
		actions.build().perform();
		
		
		WebElement permananentAddress=driver.findElement(By.id("permanentAddress"));
		
		assertEquals(currentAddress.getAttribute("value"),permananentAddress.getAttribute("value"));
		Thread.sleep(3000);
		driver.close();
	}
	private static void assertEquals(String attribute,String attribute2) {
		
		
		
		
		
	}

}
