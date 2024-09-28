package SeleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Checkbox_button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		int a = driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println("Count of Redio buttons: " + a);
		for (int i = 0; i <= a; i++) {
			driver.findElements(By.xpath("//input[@type='radio']")).get(1).click();
		}
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='checkbox1']"));
		checkbox1.click();
		if (checkbox1.isSelected()) {
			System.out.println("Checkbox is Toggled On");
		} else {
			System.out.println("Checkbox is Toggled Off");
		}
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='checkbox2']"));
		for (int i = 0; i < 2; i++) {
			checkbox2.click();
			System.out.println("Checkbox2 Status is -  " + checkbox2.isSelected());
		}
		driver.close();

	}

}
