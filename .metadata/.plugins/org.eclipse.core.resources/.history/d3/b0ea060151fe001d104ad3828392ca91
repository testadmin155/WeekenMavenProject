package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	
	public static WebDriver driver;

		public WebDriver launchURL(String browsername) {
			
			if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
			}
			else if(browsername.equals("FireFox"))
			{
				System.setProperty("webdriver.gekco.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			else if(browsername.equals("InternetExplorer"))
			{
				System.setProperty("webdriver.ie.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			
			driver.get("https://app-eu1.hubspot.com/login");
			driver.manage().window().maximize();
			
			return driver;

		}
		


}
