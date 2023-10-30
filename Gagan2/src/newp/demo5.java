package newp;

import org.testng.annotations.Test;
@Test(groups = {"gagan"})
public class demo5 {

	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("hello");
	}
	@Test(groups = {"sanity","regression"})
	public void test2()
	{
		System.out.println("hello");
	}
	@Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("hello");
	}
}
