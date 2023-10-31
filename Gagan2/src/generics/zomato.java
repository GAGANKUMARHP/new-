package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class zomato
{
 
	 public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		
	System.setProperty("webdriver.gecko.driver", "./selenim/geckodriver.exe");
	 driver=new FirefoxDriver();
	driver.get("https://www.zomato.com/bangalore/collections");
	driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.close();
		//zomato
	}
}