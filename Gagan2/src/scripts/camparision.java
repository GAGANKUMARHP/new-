package scripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class camparision {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","./selenim/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		/*driver.findElement(By.xpath("//span[@class=\'a-size-medium a-color-base a-text-normal\']")).click();*/
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
	    Set<String> wh = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<String>(wh);
		int s = l.size();
		driver.switchTo().window(l.get(1));
		Thread.sleep(1000);
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click(); 
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		
		
		
		
	}

}
