package newp;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo
{

	@Test(priority = 1)
	public void test1()
	{
		Reporter.log("hello",true);
		}
	@Test
	public void test2()
	{
		Reporter.log("world",true);
	}

}	


