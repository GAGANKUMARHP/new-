package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.amezon;

public class amezonrunner
{

	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver", "./selenim/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		amezon a=new amezon(driver);
		a.textbox("iphone 14");
		a.search();
	}	
}
