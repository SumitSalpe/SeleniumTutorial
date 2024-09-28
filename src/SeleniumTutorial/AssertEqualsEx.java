package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertEqualsEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.partialLinkText("REGISTER")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		Assert.assertEquals("Register: Mercury Tours", title);
		System.out.println("Title of the page: "+title);
		driver.close();
	}

}
