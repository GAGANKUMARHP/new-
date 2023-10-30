package newp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelexe 
{

	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void test1(String browser)
	{
		System.setProperty("webdriver.gecko.driver", "./selenim/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./selenim/chromedriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");	
		}
		else
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
		}
	}
	
}
