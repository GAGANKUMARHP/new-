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

public class tabs {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./selenim/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(1000);
		WebElement t1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
		WebElement t2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
		WebElement t3 = driver.findElement(By.xpath("//span[text()='Projects']"));
		WebElement t4 = driver.findElement(By.xpath("//span[text()='Support']"));
		WebElement t5 = driver.findElement(By.xpath("//span[text()='Blog']"));
		Set<String> allwin = driver.getWindowHandles();
		Actions act=new Actions(driver);
	     Robot r=new Robot();
	     ArrayList<WebElement> ele=new ArrayList<WebElement>();
	     ele.add(t1);
	     ele.add(t2);
	     ele.add(t3);
	     ele.add(t4);
	     ele.add(t5);
	     
	
	 
	   
	     
		
		
		
		
		
		
		
		
		
	}

}
