package newp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class runner1 extends generics1
{
   @Test
   public void runer()
   {
	   driver.findElement(By.id("email")).sendKeys("8017208193");
	   driver.findElement(By.id("pass")).sendKeys("selenim1234");
	   driver.findElement(By.name("login")).click();
	   
   } 
   }
	

