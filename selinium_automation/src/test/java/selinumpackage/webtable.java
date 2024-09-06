package selinumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\mg990707\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("C:/Users/mg990707/Desktop/webtable.html");
		List<WebElement>allRows= (List<WebElement>) driver.findElements(By.xpath("//tr"));
		int totalRows=allRows.size();
		System.out.println("total no of rows in table:"+totalRows);
		List<WebElement>allcolumns=(List<WebElement>) driver.findElements(By.xpath("//th"));
		int totalcolumns=allcolumns.size();
		System.out.println("total no of columns in table:"+totalcolumns);
		List<WebElement>allcells=(List<WebElement>) driver.findElements(By.xpath("//th|//td"));
		
		int totalcells=allcells.size();
		System.out.println("total no of cells present in the table is:"+totalcells);
		int countnumbervalue=0;
		int sum=0;
		int countnumbervalue1=0;
		for(WebElement cell:allcells) {
			String cellvalue=cell.getText();
			try
			{
				int number = Integer.parseInt(cellvalue);
				System.out.println(""+number);
				countnumbervalue1++;
				sum=sum+number;
			}
			catch (NumberFormatException e) {
			
		}}
		System.out.println("total count of numeric value is:"+countnumbervalue1);
		System.out.println("total sum of all numeric value is:"+sum);
	}
			
		}
		
		
	


