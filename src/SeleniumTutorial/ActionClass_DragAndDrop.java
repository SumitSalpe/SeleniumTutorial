package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		Actions a = new Actions(driver);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		String bgcolor = droppable.getCssValue("background-color");
		System.out.println("Before hover: " + bgcolor);        
		a.dragAndDrop(draggable, droppable).perform();
		bgcolor = droppable.getCssValue("background-color");
		System.out.println("Ater hover: " + bgcolor);   
		String msg = droppable.getText();
		if(msg.equals("Dropped!"))
		{
			System.out.println("PASS: Source is dropped to target as expected");
		}
		else
		{
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
	}

}
