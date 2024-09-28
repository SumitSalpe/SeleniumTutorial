package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_DoubleClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Actions a = new Actions(driver);
		WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
		a.doubleClick(doubleClickBtn).perform();
		String doubleClickBtnMsg = driver.findElement(By.id("doubleClickMessage")).getText();
		System.out.println(doubleClickBtnMsg);
	}

}
