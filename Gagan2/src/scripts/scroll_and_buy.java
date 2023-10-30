package scripts;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class scroll_and_buy {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./selenim/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("iphone 15");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 15 Plus (256 GB) - Black']")).click();
		Thread.sleep(2000);
		Set<String> wh = driver.getWindowHandles();
		ArrayList<String> l=new ArrayList<String>(wh);
		int s = l.size();
		driver.switchTo().window(l.get(1));
		WebElement el = driver.findElement(By.id("buy-now-button"));
		Point loc = el.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		el.click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		Thread.sleep(1000);
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dst= new File("C:\\Users\\NEW LAP\\Desktop\\src\\sh1.jpeg");
		FileHandler.copy(src, dst);
		
		driver.quit();
		
		
	}

}
