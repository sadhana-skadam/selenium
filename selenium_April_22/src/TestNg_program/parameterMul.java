package TestNg_program;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterMul {
	@Test
	@Parameters({"val1","val2"})
	public void mul(int v1,int v2) 
	{
		int mul=v1*v2;
		System.out.println("multiplivation="+mul);
	}
	

}
