package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Mouse_Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		WebElement td_home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
		Actions builder = new Actions(driver);
		Action a = builder.moveToElement(home).build();
		String bgcolor = td_home.getCssValue("background-color");
		System.out.println("Before hover: " + bgcolor);        
        a.perform();
        bgcolor = td_home.getCssValue("background-color");
        System.out.println("After hover: " + bgcolor);
        driver.close();
	}

}
