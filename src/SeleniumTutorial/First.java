package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.name("q")).sendKeys("JAVATPoint");
	    WebElement input = driver.findElement(By.name("q"));
	    input.sendKeys(Keys.ENTER);
	}

}
