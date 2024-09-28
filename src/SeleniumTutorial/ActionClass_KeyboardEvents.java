package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ActionClass_KeyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Actions actions = new Actions(driver);
		WebElement userName = driver.findElement(By.id("userName"));
		userName.sendKeys("Mr.Peter Haynes");
		WebElement userEmail = driver.findElement(By.id("userEmail"));
		userEmail.sendKeys("PeterHaynes@toolsqa.com");
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("43 School Lane London EC71 9GO");
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("A");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("C");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		
		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("V");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		Assert.assertEquals(currentAddress.getAttribute("value"), permanentAddress.getAttribute("value"));
	}

}
