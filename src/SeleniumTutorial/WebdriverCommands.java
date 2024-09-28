package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		System.out.println("Title of the Page before login: " + driver.getTitle());
		System.out.println("Url of the page before login: " + driver.getCurrentUrl());
		String login_credentials = driver.findElement(By.id("login_credentials")).getText();
		System.out.println(login_credentials);
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("locked_out_user");
		username.clear();
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		Thread.sleep(2000);
		System.out.println("Title of the Page after login: " + driver.getTitle());
		System.out.println("Url of the page after login: " + driver.getCurrentUrl());
		driver.close();
	}
}
