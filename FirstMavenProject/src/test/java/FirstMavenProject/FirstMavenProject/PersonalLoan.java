package FirstMavenProject.FirstMavenProject;

import org.testng.annotations.Test;

public class PersonalLoan {
	
	@Test(groups= {"sanity"})
	public void PersonalLoanwithWeb()
	{
		System.out.println("this is a PersonalLoan from WEB");
	}
	
	@Test(groups= {"regression"})
	public void PersonalLoanwithAPP()
	{
		System.out.println("this is a PersonalLoan from APP");
	}
	
	@Test(groups= {"regression"})
	public void PersonalLoanwithBranch()
	{
		System.out.println("this is a PersonalLoan from Branch");
	}

}
