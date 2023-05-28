package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest{

	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//username field
	@FindBy(id="username")
	WebElement emailId;
	
	//password field
	@FindBy(id="password")
	WebElement pswd;
	
	//login button
	@FindBy(xpath="//button[@data-test-id='password-login-button']")
	WebElement LgnBtn;
	
	public void validlogin (String username, String password)
	{
		emailId.sendKeys(username);
		pswd.sendKeys(password);
		LgnBtn.click();
	}
	
	
	
	
}
