package TestNg_program;

import org.testng.annotations.Test;

public class groupdepenceny {
	@Test(groups="signin")
	public void login() 
	{
		System.out.println("login succesfully");
	}
	@Test(dependsOnGroups = "signin")
	public void viewaccount() 

	{
		System.out.println("view account succesfully");
		}


}
