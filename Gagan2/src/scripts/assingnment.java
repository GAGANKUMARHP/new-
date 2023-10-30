package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingnment {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./selenim/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/NEW%20LAP/Desktop/code.html");
	Thread.sleep(2000);
	WebElement a = driver.findElement(By.xpath("//input[@id='a1']"));
	a.sendKeys(Keys.CONTROL+"a"+"x");
	Thread.sleep(2000);
	WebElement b = driver.findElement(By.xpath("//input[@id='a3']"));
	b.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	WebElement c = driver.findElement(By.xpath("//input[@id='a2']"));
	c.sendKeys(Keys.CONTROL+"a"+"x");
	Thread.sleep(2000);
	WebElement d = driver.findElement(By.xpath("//input[@id='a1']"));
	d.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	WebElement e = driver.findElement(By.xpath("//input[@id='a3']"));
	e.sendKeys(Keys.CONTROL+"a"+"x");
	
	
	
	

	}

}
