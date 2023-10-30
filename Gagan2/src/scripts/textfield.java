package scripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textfield {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./selenim/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NEW%20LAP/Desktop/code.html");
		Thread.sleep(2000);
		List<WebElement> l = driver.findElements(By.xpath("//input"));

		int a = l.size();
		System.out.println(a);
		for(WebElement w:l)
		{
			w.sendKeys("gagan");
			Thread.sleep(1000);
			
		}
		
		
		for(int i=a-1;i>=0;i--)
		{
			WebElement w = l.get(i);
			Thread.sleep(1000);
		     w.clear();
		}
		}
	}


