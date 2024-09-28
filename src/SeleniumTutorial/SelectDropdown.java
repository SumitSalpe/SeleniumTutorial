package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
		js.executeScript("scrollBy(0,5000)");
		Select drpCountry = new Select(country);
		drpCountry.selectByIndex(1);
		Thread.sleep(2000);
		drpCountry.selectByValue("AMERICAN SAMOA");
		Thread.sleep(2000);
		drpCountry.selectByVisibleText("ANDORRA");
		driver.close();
	}

}
