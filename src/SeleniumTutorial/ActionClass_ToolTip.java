package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips/");
		Actions a = new Actions(driver);
		System.out.println("Tooltip web Page Displayed");
		WebElement toolTipButton = driver.findElement(By.id("toolTipButton"));
		a.moveToElement(toolTipButton).build().perform();
		String tooltipText = toolTipButton.getAttribute("aria-describedby");
		System.out.println("Retrieved tooltip text as :"+tooltipText); 
	}

}
