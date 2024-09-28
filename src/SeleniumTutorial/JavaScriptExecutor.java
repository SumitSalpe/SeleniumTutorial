package SeleniumTutorial;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		js.executeScript("document.getElementById('user_password').value='password';");
		js.executeScript("document.getElementById('user_submit').click();");
		js.executeScript("alert('Please check the box to confirm acceptance of our Terms of Service and Privacy Policy');");
	}
}
