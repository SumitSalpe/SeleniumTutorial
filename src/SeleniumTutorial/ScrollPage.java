package SeleniumTutorial;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.javatpoint.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,5000)");	
		WebElement jenkins = driver.findElement(By.linkText("Jenkins"));
		jenkins.click();
		driver.close();
	}

}
