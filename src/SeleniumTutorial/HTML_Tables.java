package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HTML_Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//Finding number of Rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowcount  = rows.size();
		System.out.println("No of rows in this table : " + rowcount);
		
		//Finding number of Columns
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		int columncount = columns.size();
		System.out.println("No of columns in this table : " + columncount);
		
		//Finding cell value at 4th row and 3rd column
		WebElement celladdress = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[3]"));
		String value = celladdress.getText();
		System.out.println("The Cell Value is : " +value);
		driver.close();
	}

}
