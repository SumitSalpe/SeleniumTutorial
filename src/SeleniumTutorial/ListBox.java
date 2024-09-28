package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavalidation.com/demo-form/");
		WebElement val = driver.findElement(By.id("g4072-qatools"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,800)");
		Select s = new Select(val);
		List<WebElement> li = s.getOptions();
		for(int i = 0; i<li.size();i++)
		{
			Thread.sleep(2000);
			System.out.println("options: "+ li.get(i).getAttribute("Value"));
			s.selectByIndex(i);
		}
	}

}
