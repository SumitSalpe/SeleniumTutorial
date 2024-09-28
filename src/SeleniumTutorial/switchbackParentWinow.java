package SeleniumTutorial;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchbackParentWinow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		driver.findElement(By.id("windowButton")).click();
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> it = allWindow.iterator();

		while (it.hasNext()) {
			String chileWindow = it.next();
			if (!mainWindow.equalsIgnoreCase(chileWindow)) {
				driver.switchTo().window(chileWindow);
				WebElement text = driver.findElement(By.id("sampleHeading"));
				System.out.println("Heading of child window is: " + text.getText());
				driver.close();
				System.out.println("Child window closed");
			}
		}
		driver.switchTo().window(mainWindow);
		driver.quit();
	}

}
