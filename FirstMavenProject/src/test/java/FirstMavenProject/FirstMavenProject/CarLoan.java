package FirstMavenProject.FirstMavenProject;

import org.testng.annotations.Test;

public class CarLoan {
	
	@Test
	public void CarLoanwithWeb()
	{
		System.out.println("this is a CarLoan from WEB");
	}
	
	@Test(groups= {"sanity"})
	public void CarLoanwithAPP()
	{
		System.out.println("this is a CarLoan from APP");
	}
	
	@Test(groups= {"regression"})
	public void CarLoanwithBranch()
	{
		System.out.println("this is a CarLoan from Branch");
	}

}
