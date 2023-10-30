package newp;

import org.testng.annotations.Test;
@Test(groups = {"anil"})
public class demo2 {

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
