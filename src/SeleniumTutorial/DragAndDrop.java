package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Actions act = new Actions(driver);
		WebElement from = driver.findElement(By.id("column-a"));
		WebElement to = driver.findElement(By.id("column-b"));
		act.dragAndDrop(from, to).perform();
		String textTo = to.getText();
		System.out.println(textTo);
		if(textTo.equals("A"))
		{
			System.out.println("PASS: File is dropped to target as expected");
		}
		else
		{
			System.out.println("FAIL: File couldn't be dropped to target as expected");
		}
		driver.close();
	}

}
