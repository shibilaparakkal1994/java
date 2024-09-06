package selinumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.globalsqa.com/demo-site/select-dropdown-menu");
		Select dropDown = new Select(driver.findElement(By.cssSelector("#post-2646 >div.twelve.columns > div > div > div > p > select")));
		dropDown.selectByVisibleText("Antarctica");
}
}