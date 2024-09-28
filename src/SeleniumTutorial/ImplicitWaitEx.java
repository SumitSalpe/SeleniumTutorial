package SeleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();  
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // pageload timeout  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
		driver.get("https://www.easemytrip.com/");
		WebElement From = driver.findElement(By.id("FromSector_show"));
		From.sendKeys("Mumbai", Keys.ENTER);
		WebElement To = driver.findElement(By.id("FromSector_show"));
		To.sendKeys("Trivandrum", Keys.ENTER);
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.id("snd_5_12/01/2024")).click();
		driver.findElement(By.className("srchBtnSe")).click();
		driver.findElement(By.xpath("//button[text()='Book Now']")).click();
	}

}
