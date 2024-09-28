package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToiframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		String msg = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(msg);
		//Switch back to the main window
		driver.switchTo().defaultContent();
	}
}
