package SeleniumTutorial;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.swtestacademy.com/datepicker-using-selenium/
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.turkishairlines.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement datePicker = driver.findElement(By.cssSelector("#general-booker-datapicker"));
		datePicker.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement date = driver.findElement(By.xpath("//div[@class='vc-container vc-monthly vc-blue vc-light vc-bordered']//div[@aria-label='Saturday, Jan 20, 2024'][normalize-space()='20']"));
		wait.until(ExpectedConditions.visibilityOf(date));
		date.click();
		driver.findElement(By.xpath("//button[@class='button']")).click();
	}
}
