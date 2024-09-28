package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertTrueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		//Assert.assertTrue(false);
		// In the above code, Assert.assertTrue() method contains the false condition.
		// Therefore, the assertion fails which means that the test case is also failed
		driver.findElement(By.xpath("//input[@value='checkbox1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='checkbox1']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='checkbox1']")).isSelected());
		driver.close();
	}

}
