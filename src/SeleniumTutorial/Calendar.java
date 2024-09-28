package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/");
		WebElement bdaytime = driver.findElement(By.name("bdaytime"));
		bdaytime.sendKeys("08071997");
		bdaytime.sendKeys(Keys.TAB);
		bdaytime.sendKeys("06:30");
		WebElement submit =driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		String msg = driver.findElement(By.xpath("//body/div[2]")).getText();
		System.out.println(msg);
	}

}
