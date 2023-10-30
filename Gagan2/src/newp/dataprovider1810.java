package newp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1810 
{

	@Test(dataProvider = "test2")
	public void test1(String name,String job,String email,String add)
	{
		System.setProperty("webdriver.gecko.driver", "./selenim/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://flowcv.com/app/cover-letter/write");
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		driver.findElement(By.id("inputfullName")).sendKeys(name);
		driver.findElement(By.id("inputjobTitle")).sendKeys(job);
		driver.findElement(By.id("inputdisplayEmail")).sendKeys(email);
		driver.findElement(By.id("inputaddress")).sendKeys(add);
		driver.findElement(By.xpath("//button[@type='submit']"));
		
		
	}
	@DataProvider(name = "test2")
	public Object[][] createData1()
	{
	 return new Object[][]
			 {
	   { "gagan","hsybsg"},
	   { "manger","suyvsyh" },
	 
	 };
	}

}
