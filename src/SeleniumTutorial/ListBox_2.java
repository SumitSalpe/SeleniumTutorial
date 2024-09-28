package SeleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,500)");
		WebElement cars = driver.findElement(By.id("cars"));
		Select s = new Select(cars);
		List<WebElement> lst = s.getOptions();
		System.out.println("Dropdown options are: ");
		for (WebElement options : lst)
			System.out.println(options.getText());
		// Using isMultiple() method to verify if the element is multi-select, if yes go
		// onto next steps else end it
		if (s.isMultiple()) {
			// Selecting option as 'Opel'-- ByIndex
			System.out.println("Selected by index");
			s.selectByIndex(2);

			// Selecting the option as 'Saab'-- ByValue
			System.out.println("Select option saab by Value");
			s.selectByValue("saab");

			// Selecting the option by text
			System.out.println("Select option Audi by Text");
			s.selectByVisibleText("Audi");

			// Get the list of selected options
			System.out.println("The selected values in the dropdown options are -");

			List<WebElement> selectedOptions = s.getAllSelectedOptions();

			for (WebElement selectedOption : selectedOptions)
				System.out.println(selectedOption.getText());

			// Deselect the option by text
			System.out.println("Deselect option Audi by Text");
			s.deselectByVisibleText("Audi");

			// Deselect the option as 'Saab'-- ByValue
			System.out.println("Select option saab by Value");
			s.deselectByValue("saab");

			// Validate that both the values are deselected
			System.out.println("The selected values after deselect in the dropdown options are - ");
			List<WebElement> selectedOptionsAfterDeselect = s.getAllSelectedOptions();
			for (WebElement selectedOptionAfterDeselect : selectedOptionsAfterDeselect)
				System.out.println(selectedOptionAfterDeselect.getText());
			s.deselectAll();
		}
		driver.close();
	}

}
