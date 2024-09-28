package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement element = driver.findElement(By.id("promtButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		Alert promptAlert = driver.switchTo().alert();
		String alertmsg = promptAlert.getText();
		System.out.println(alertmsg);
		promptAlert.sendKeys("Sumit");
		promptAlert.accept();
	}

}
