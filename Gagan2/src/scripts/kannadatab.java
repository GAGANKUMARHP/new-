package scripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class kannadatab {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./selenim/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		Set<String> allwin = driver.getWindowHandles();
	    for (String wh : allwin)
	    {
			driver.switchTo().window(wh);
			String t = driver.getTitle();
			System.out.println(t);
		}
		
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_D );
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		 ArrayList<String> l=new ArrayList<String>(allwin);
		 int c = l.size();
		 System.out.println(c);
		 String wh = l.get(1);
		 driver.switchTo().window(wh);
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
