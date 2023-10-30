package scripts;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenim/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		for (int i = 0; i <3; i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}
		for (int j = 0; j < 3; j++)
		{
			js.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(2000);
				
		}
		
	WebElement w = driver.findElement(By.xpath("//a[text()='Facebook']"));
	 Point l = w.getLocation();
	 int x = l.getX();
	 int y = l.getY();
	 Thread.sleep(3000);
	 js.executeScript("window.scrollBy("+x+","+y+")");
	 w.click();
	}
	

}
