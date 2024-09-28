package SeleniumTutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		WebElement windowButton =  driver.findElement(By.id("windowButton"));
		windowButton.click();
		//Get handles of the windows
		String mainwindowHandle = driver.getWindowHandle();
		System.out.println(mainwindowHandle);
		Set<String> allwindowHandles = driver.getWindowHandles();
		System.out.println(allwindowHandles);
		Iterator<String> iterator = allwindowHandles.iterator();
		// Here we will check if child window has other child windows and will fetch the heading of the child window
		while(iterator.hasNext())
		{
			String childwindow = iterator.next();
			System.out.println(childwindow);
			if (!mainwindowHandle.equalsIgnoreCase(childwindow)) 
			{
				driver.switchTo().window(childwindow);
				String sampleHeading = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println("Element found using text: " + sampleHeading);
			}
		}
		
	}

}
