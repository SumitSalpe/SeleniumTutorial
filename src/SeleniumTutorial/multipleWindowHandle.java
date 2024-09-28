package SeleniumTutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		// open all child window
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();

		String mainWindow = driver.getWindowHandle();
		System.out.println("Main window hande is " + mainWindow);

		// to handle all open window
		Set<String> allwindowHandle = driver.getWindowHandles();
		System.out.println("Child window handle is " + allwindowHandle);
		Iterator<String> iterator = allwindowHandle.iterator();

		// Here we will check if child window has other child windows and when child
		// window is the main window it will come out of loop
		while (iterator.hasNext()) {
			String childwindow = iterator.next();
			if (!mainWindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				driver.close();
				System.out.println("Child window closed");
			}
		}
	}
}
