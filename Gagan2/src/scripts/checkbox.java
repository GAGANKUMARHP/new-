package scripts;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./selenim/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/NEW%20LAP/Desktop/code.html");
		Thread.sleep(2000);
		List<WebElement> l = driver.findElements(By.xpath("//input"));
		int count=l.size();
		System.out.println(count);
		for(int i=0;i<=count-1;i++)
		{
			WebElement e = l.get(i);
			Thread.sleep(2000);
			e.click();
				}
		
		for(int i=count-1;i>=0;i--)
		{
			WebElement e= l.get(i);
			e.click();		
			}
		
	}

}
