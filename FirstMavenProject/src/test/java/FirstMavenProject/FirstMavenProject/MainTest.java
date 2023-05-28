package FirstMavenProject.FirstMavenProject;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import POM.BaseTest;
import POM.HomePage;
import POM.LoginPage;

public class MainTest extends BaseTest{

	@BeforeSuite
	public void setup()
	{
		launchURL("chrome");
	}

	@AfterSuite
	public void teardown()
	{
		driver.close();
	}
	
		@Test
		public void ValidLogin() throws InterruptedException
		{
			LoginPage lp = new LoginPage(driver);
			HomePage hp = new HomePage(driver);
			
			lp.validlogin("automationtestacademy@gmail.com", "Test@9999");
			Thread.sleep(5000);
			hp.Entercode("9999");
		}
		

	

}