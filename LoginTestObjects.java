package POM;

public class LoginTestObjects<WebDriver> {

	public void username(WebDriver driver) {
		driver.findelements(By.xpath("//input[@placeholder='Email']"));
		
	}
public void password() {
	driver.findelements(by.xpath("//input[@placeholder='password']"));
		
	}
public void loginbtn() {
	driver.findelements(by.xpath("//input[@placeholder='//*[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']']"));
	
	
}
public void username() {
	// TODO Auto-generated method stub
	
}
}
