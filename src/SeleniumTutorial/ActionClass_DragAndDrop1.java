package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_DragAndDrop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		Actions a = new Actions(driver);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		int xOffset = draggable.getLocation().getX();
		int yOffset = draggable.getLocation().getY();
		System.out.println("xOffset--->"+xOffset+" yOffset--->"+yOffset);
		int xOffset1 = droppable.getLocation().getX();
		int yOffset1 = droppable.getLocation().getY();
		System.out.println("xOffset1--->"+xOffset1+" yOffset1--->"+yOffset1);
		//Find the xOffset and yOffset difference to find x and y offset needed in which from object required to dragged and dropped
		xOffset1 = (xOffset1 - xOffset)+10;
		yOffset1 = (xOffset1 - xOffset)+20;
		System.out.println(xOffset1);
		System.out.println(yOffset1);
		a.dragAndDropBy(draggable, xOffset1,yOffset1).perform();
		String msg = droppable.getText();
		if(msg.equals("Dropped!"))
		{
			System.out.println("PASS: Source is dropped to target as expected");
		}
		else
		{
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
		driver.close();
	}

}
