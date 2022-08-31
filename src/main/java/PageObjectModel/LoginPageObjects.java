package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	//We have  achieved encapsulation here
	private By username= By.xpath("//input[@id='username']");
	private By password= By.xpath("//input[@id='password']");
	private By LoginButton= By.xpath("//input[@id='Login']");
	private By TryForFree= By.xpath("//a[@id='signup_link']");
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement EnterUsername() {
		return driver.findElement(username);	
	}
	public WebElement EnterPassword() {
		return driver.findElement(password);	
	}
	public WebElement ClickLogin() {
		return driver.findElement(LoginButton);	
	}
	public WebElement ClickTryForFree() {
		return driver.findElement(TryForFree);	
	}
	
	

}
