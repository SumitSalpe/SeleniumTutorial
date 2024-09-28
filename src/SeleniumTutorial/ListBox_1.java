package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://toolsqa.com/selenium-webdriver/dropdown-in-selenium/
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,400)");
		WebElement oldselectmenu = driver.findElement(By.id("oldSelectMenu"));
		Select s = new Select(oldselectmenu);
		//Get list of web elements
		List<WebElement> lst = s.getOptions();
		//Looping through the options and printing dropdown options
		System.out.println("Dropdown options are: ");
		for(WebElement options : lst)
		System.out.println(options.getText());
		//Selecting the option as 'Purple'-- selectByIndex
		System.out.println("Select the Option by Index 4");
		s.selectByIndex(4);
		System.out.println("Selected value is: "+ s.getFirstSelectedOption().getText());
		//Selecting the option as 'Magenta'-- selectByVisibleText
		System.out.println("Select the Option by VisibleText");
		s.selectByVisibleText("Magenta");
		System.out.println("Selected value is: "+ s.getFirstSelectedOption().getText());
		//Selecting an option by its value
		System.out.println("Select the Option by value 6");
		s.selectByValue("6");
        System.out.println("Selected value is: " + s.getFirstSelectedOption().getText());
        driver.close();
	}
}
