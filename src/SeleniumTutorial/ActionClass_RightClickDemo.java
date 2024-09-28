package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_RightClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Actions a = new Actions(driver);
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		a.contextClick(rightclick).perform(); //Method1
		a.moveToElement(rightclick).contextClick().build().perform(); //Method2
		String rightclickmsg = driver.findElement(By.id("rightClickMessage")).getText();
		System.out.println(rightclickmsg);
		driver.close();
	}

}
