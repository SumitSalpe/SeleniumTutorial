package SeleniumTutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		WebElement element = driver.findElement(By.id("confirmButton"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		Alert confirmationAlert = driver.switchTo().alert();
		String alertmsg = confirmationAlert.getText();
		System.out.println(alertmsg);
		confirmationAlert.accept();
	}

}
