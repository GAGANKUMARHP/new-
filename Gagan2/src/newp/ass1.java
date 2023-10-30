package newp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ass1 extends generics1
{
@Test
public void test()
{
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
	driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.ENTER);
	
	String t = driver.getTitle();
	System.out.println(t);
   Assert.assertEquals(t, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in  ");
    System.out.println("I love you");
	
}
/*@Test
public void test2()
{
	driver.findElement(By.id("email")).sendKeys("8017208193");
	driver.findElement(By.id("pass")).sendKeys("selenim1234");
	driver.findElement(By.name("login")).click();
	String t = driver.getTitle();
	System.out.println(t);
    Assert.assertEquals(t, "Facebook – log in or");
    System.out.println("I love you");*/
	
	
	
}



