package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestCase {
	
	public void login() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spotcheck\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://spotcheck-tst.outsystemsenterprise.com/BackOffice_Portal/LoginAndRegistration.LoginPage.aspx");
 
	LoginTestObjects login = new LoginTestObjects();
	login.username(driver);
}
}
