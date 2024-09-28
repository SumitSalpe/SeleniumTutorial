package SeleniumTutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");
		String ExpectedTitle = "Demo Guru99 Page";
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		if(ExpectedTitle.equals(ActualTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		WebElement selenium = driver.findElement(By.linkText("Selenium"));
		wait.until(ExpectedConditions.visibilityOf(selenium));
		selenium.click();
	}

}
