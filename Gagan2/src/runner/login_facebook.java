package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.TEST1;

public class login_facebook
{

	@Test
	public void test1()
	{
		System.setProperty("webdriver.gecko.driver", "./selenim/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		TEST1 t=new TEST1(driver);
		t.email("9449137408");
		t.pass("111@gagan");
		t.login();
		
		
	}
}
