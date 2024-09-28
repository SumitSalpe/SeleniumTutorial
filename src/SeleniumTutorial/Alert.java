package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement customerid = driver.findElement(By.name("cusid"));
		customerid.sendKeys("Test1");
		driver.findElement(By.name("submit")).click();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		driver.switchTo().alert().dismiss();
		driver.close();
	}

}
